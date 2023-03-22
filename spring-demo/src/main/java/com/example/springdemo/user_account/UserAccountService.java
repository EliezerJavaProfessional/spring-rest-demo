package com.example.springdemo.user_account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class UserAccountService {
    Logger logger = LogManager.getRootLogger();

    @Autowired
    private UserAccountRepository userAccountRepository;

    public Iterable<UserAccount> list() {
        return userAccountRepository.findAll();
    }
    
    public Iterable<UserAccount> list(UserAccount filter, String sortString) {
        Example<UserAccount> example = Example.of(filter);
        Sort sort=Sort.by(Sort.Direction.ASC, "id");
        if(sortString!=null&&!sortString.trim().isEmpty()){
            logger.debug("Change Sort Order");
            sort = Sort.by(Sort.Direction.ASC, sortString.split(","));
        }
        return userAccountRepository.findAll(example, sort);
    }
    public UserAccount get(Long id) {return userAccountRepository.findById(id).get();}
    public UserAccount postAndPut(UserAccount userAccount) {return userAccountRepository.save(userAccount);}
    public void delete(Long id) {userAccountRepository.deleteById(id);}
}
