package com.example.springdemo.user_message;
//Jakarta Imports
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
//Hibernate Actions
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
//Lombok annotations
import lombok.Data;
//Project Imports
import com.example.springdemo.user_account.UserAccount;

/*
 * We build this entity with @Entity and @Data to avoid declaring
 * Getters, Setters and Constructors.
 * 
 *  @Data .-  encapsulates (@RequiredArgsConstructor, @ToString, @Getter, @Setter, @EqualsAndHashCode)
 *  @RequiredArgsConstructor .- creates Constructor with Required Arguments
 *  @EqualsAndHashCode .- creates comparator and HashCode for serialization
 *  @ToString .- creates the ToString Method
 *  @Setter .- creates the Setters
 *  @Getter .- creates the Getters
 */
@Entity
@Data
public class UserMessage {
    @Id
    @GeneratedValue
    @Column(name="Id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="UserAccountId")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private UserAccount userAccount;
    
    @Column(name="Message")
    private String message;

    public UserMessage(){}
    public UserMessage(Long id, UserAccount userAccount, String message){
        this.id=id;
        this.userAccount=userAccount;
        this.message=message;
    }
}