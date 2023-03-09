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
//Project Imports
import com.example.springdemo.user_account.UserAccount;

@Entity
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
    
    public UserMessage(){};
    public UserMessage(Long id, UserAccount userAccount, String message){};

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
    public UserAccount getUserAccount() {return userAccount;}
    public void setUserAccount(UserAccount userAccount) {this.userAccount = userAccount;}
    
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}
    
    
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("{");
        buffer.append("id:"+id);
        buffer.append(", user_account:\""+userAccount.toString()+"\"");
        buffer.append(", message:\""+message+"\"");
        buffer.append("}");
        return buffer.toString();
    }
}