package com.example.chatapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "message")
@Data
public class Message {

    private long messageId;

}
