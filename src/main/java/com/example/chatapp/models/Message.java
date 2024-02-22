package com.example.chatapp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "message")
@Data
public class Message {

    @Id
    private long messageId;

    // MANY-TO-ONE REL. BETWEEN MANY MESSAGES TO ONE USER
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    @JsonBackReference
    private User user;



    // MANY-TO-ONE REL. BETWEEN MANY MESSAGES TO ONE CHAT
    @ManyToOne
    @JoinColumn(name = "chatId", referencedColumnName = "chatId")
    @JsonBackReference
    private Chat chat;

    public long getMessageId() {
        return messageId;
    }

    public User getUser() {
        return user;
    }

    public Chat getChat() {
        return chat;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
