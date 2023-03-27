package com.example.springdemo.user_account;
//Spring Imports
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//Java Imports
import java.util.List;

@Repository

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
    
    @Query (value = "SELECT TOP ?1 * FROM USER_ACCOUNT WHERE ACTIVE=TRUE ORDER BY ID", nativeQuery=true)
    List<UserAccount> findTop(Integer top);
}