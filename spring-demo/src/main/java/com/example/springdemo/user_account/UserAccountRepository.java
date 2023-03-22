package com.example.springdemo.user_account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {}