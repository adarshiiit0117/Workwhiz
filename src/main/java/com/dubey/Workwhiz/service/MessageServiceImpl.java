package com.dubey.Workwhiz.service;

import com.dubey.Workwhiz.modal.Chat;
import com.dubey.Workwhiz.modal.Message;
import com.dubey.Workwhiz.modal.User;
import com.dubey.Workwhiz.repository.MessageRepository;
import com.dubey.Workwhiz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectService projectService;

    @Override
    public Message sendMessage(Long senderId, Long projectId, String content) throws Exception {
        // Fetch sender from the UserRepository
        User sender = userRepository.findById(senderId)
                .orElseThrow(() -> new Exception("User not found with id: " + senderId));

        // Fetch the associated chat for the given projectId
        Chat chat = projectService.getProjectById(projectId).getChat();

        // Create a new message object
        Message message = new Message();
        message.setContent(content);
        message.setSender(sender);
        message.setChat(chat); // Set the chat for the message

        // Save the message to the repository
        Message savedMessage = messageRepository.save(message);

        // Add the saved message to the chat's message list
        chat.getMessages().add(savedMessage);

        // Return the saved message
        return savedMessage;
    }

    @Override
    public List<Message> getMessagesByProjectId(Long projectId) throws Exception {
        // Fetch the associated chat for the given projectId
        Chat chat = projectService.getChatByProjectId(projectId);

        // Retrieve messages for the chat, ordered by creation date
        return messageRepository.findByChatIdOrderByCreatedAtAsc(chat.getId());
    }
}
