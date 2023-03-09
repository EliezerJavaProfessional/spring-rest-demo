package com.example.springdemo.user_account;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

//WE ARE NOT USING JPA
//public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {}
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {}