package com.example.springdemo.user_account;
//# Spring Framework Anotations
//Enable CORS to test multiple ports on the same computer
//THIS IS A DEMO, NEVER USE ON PRODUCTION GRADE CODE!
import org.springframework.web.bind.annotation.CrossOrigin; 
//Rest Services Mapping
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
//Parameters, Request and Response Mappings
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//# Spring Framework Autowired Service
import org.springframework.beans.factory.annotation.Autowired;

//Enable CORS
@CrossOrigin
@RestController
public class UserAccountController {
    //Data Repository
    @Autowired
    private UserAccountService userAccountService;
    
    //Split Get Mapping to use AutoMap of the Response (1/2) Retrieve a list
    //Using multiple endpoints in value to avoid end hypen no end hypen confusion
    @GetMapping(value = {"/rest/user_account","/rest/user_account/"}, produces = "application/json")
	@ResponseBody
    public Iterable<UserAccount> getList(
        @RequestParam(required = false) String firstName, 
        @RequestParam(required = false) String lastName, 
        @RequestParam(required = false) String sort) {
        UserAccount userAccount = new UserAccount(null, firstName, lastName);
        return userAccountService.list(userAccount, sort);
    }
    
    //Split Get Mapping to use AutoMap of the Response (2/2) Retrieve a single object
    @GetMapping(value = {"/rest/user_account/{id}", "/rest/user_account/{id}/"}, produces = "application/json")
	@ResponseBody
    public UserAccount get(@PathVariable(required = true) Long id) {
        return userAccountService.get(id);
    }
    
    //Insert a new object if id is sent it will be ignored
    @PostMapping(value = {"/rest/user_account","/rest/user_account/"}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public UserAccount post(@RequestBody UserAccount userAccount) {
        //reset user id
        userAccount.setId(null);
        return userAccountService.postAndPut(userAccount);
    }

    //Update an object
    @PutMapping(value = {"/rest/user_account/{id}", "/rest/user_account/{id}/"}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public UserAccount put(@PathVariable(required = true) Long id, @RequestBody UserAccount userAccount) {
        //make object id and uri id match
        userAccount.setId(id);
        return userAccountService.postAndPut(userAccount);
    }

    //Delete an object
    @DeleteMapping(value = {"/rest/user_account/{id}", "/rest/user_account/{id}/"}, produces = "application/json")
	public void delete(@PathVariable(required = true) Long id) {
        userAccountService.delete(id);
    }
}
