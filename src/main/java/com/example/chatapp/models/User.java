package com.example.chatapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    private Long userId;

    private String userName;

    // MANY-TO-MANY REL. BETWEEN USERS AND CHATS
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // we need to configure the many-to-many relationship so that it can be reflected
    // to the database
    @JoinTable(
            name = "user_chat",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "chat_id")
    )
    @JsonIgnore
    private Set<Chat> chats;


    // ONE-TO-MANY REL. BETWEEN ONE USER AND MANY MESSAGES
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private Set<Message> userMessages;






}
