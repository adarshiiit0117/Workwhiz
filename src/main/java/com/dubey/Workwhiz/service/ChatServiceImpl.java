package com.dubey.Workwhiz.service;

import com.dubey.Workwhiz.modal.Chat;
import com.dubey.Workwhiz.repository.ChatRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    private  ChatRepository chatRepository;


    @Override
    public Chat createChat(Chat chat) {
        return chatRepository.save(chat); // Save the chat to the repository
    }
}
