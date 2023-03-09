package com.example.springdemo.user_account;

//Jakarta Imports
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
//Java Imports
import java.util.List;
//Project Imports
import com.example.springdemo.user_message.UserMessage;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue
    @Column(name="Id")
    private Long id;
    
    @Column(name="FirstName", nullable=false)
    private String firstName;
    
    @Column(name="LastName")
    private String lastName;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<UserMessage> userMessages;

    public UserAccount(){};
    public UserAccount(Long id, String firstName, String lastName){};

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
    public String getFirstName() {return firstName;}
    public void setFirstName(String name) {this.firstName = name;}
    
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("{");
        buffer.append("id:"+id);
        buffer.append(", first_name:\""+firstName+"\"");
        buffer.append(", last_name:\""+lastName+"\"");
        buffer.append("}");
        return buffer.toString();
    }
}