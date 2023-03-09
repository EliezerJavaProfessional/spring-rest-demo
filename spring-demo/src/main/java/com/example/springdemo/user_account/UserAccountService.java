package com.example.springdemo.user_account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {
    @Autowired
    private UserAccountRepository userAccountRepository;

    public Iterable<UserAccount> list() {return userAccountRepository.findAll();}
    public UserAccount get(Long id) {return userAccountRepository.findById(id).get();}
    public UserAccount postAndPut(UserAccount userAccount) {return userAccountRepository.save(userAccount);}
    public void delete(Long id) {userAccountRepository.deleteById(id);}
}
