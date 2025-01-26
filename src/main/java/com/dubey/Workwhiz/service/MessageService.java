package com.dubey.Workwhiz.service;

import com.dubey.Workwhiz.modal.Message;

import java.util.List;

public interface MessageService {
    Message sendMessage(Long senderId,Long chatId,String content)throws Exception;
    List<Message> getMessagesByProjectId(Long projectId)throws Exception;
}
