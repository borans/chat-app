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



}
