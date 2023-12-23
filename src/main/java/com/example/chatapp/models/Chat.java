package com.example.chatapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "chat")
@Data
public class Chat {

    @Id
    private long chatId;




}
