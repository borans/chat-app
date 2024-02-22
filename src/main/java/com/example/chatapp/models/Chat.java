package com.example.chatapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Entity
@Table(name = "chat")
@Data
public class Chat {

    @Id
    private long chatId;

    // MANY-TO-MANY REL. BETWEEN CHATS AND USERS
    @ManyToMany(mappedBy = "chats", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<User> users;


    @OneToMany(mappedBy = "chat")
    @JsonManagedReference
    private Set<Message> chatMessages;


    public long getChatId() {
        return chatId;
    }

    public Set<User> getUsers() {
        return users;
    }

    public Set<Message> getChatMessages() {
        return chatMessages;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public void setChatMessages(Set<Message> chatMessages) {
        this.chatMessages = chatMessages;
    }
}
