package com.example.springdemo.user_message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMessageRepository extends CrudRepository<UserMessage, Long> {}