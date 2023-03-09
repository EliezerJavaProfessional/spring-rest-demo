package com.example.springdemo.user_message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserMessageController {
    @Autowired
    private UserMessageService userMessageService;
    
    @GetMapping(value = {"/rest/user_message","/rest/user_message/"}, produces = "application/json")
	@ResponseBody
    public Iterable<UserMessage> getList() {return userMessageService.list();}
    
    @GetMapping(value = {"/rest/user_message/{id}", "/rest/user_message/{id}/"}, produces = "application/json")
	@ResponseBody
    public UserMessage get(@PathVariable(required = true) Long id) {return userMessageService.get(id);}
    
    @DeleteMapping(value = {"/rest/user_message/{id}", "/rest/user_message/{id}/"}, produces = "application/json")
	public void delete(@PathVariable(required = true) Long id) {userMessageService.delete(id);}
    
    @PostMapping(value = {"/rest/user_message","/rest/user_message/"}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public UserMessage post(@RequestBody UserMessage userMessage) {return userMessageService.put(userMessage);}

}
