package com.example.springdemo.user_message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMessageService {
    @Autowired
    private UserMessageRepository userMessageRepository;

    public Iterable<UserMessage> list() {return userMessageRepository.findAll();}
    public UserMessage get(Long id) {return userMessageRepository.findById(id).get();}
    public UserMessage put(UserMessage userMessage) {return userMessageRepository.save(userMessage);}
    public void delete(Long id) {userMessageRepository.deleteById(id);}
}
