package com.example.chatapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


import java.util.Set;

@Entity
@Table(name = "group")
@Data
public class Group {

    @Id
    private long groupId;

    /*
    @ManyToMany(mappedBy = "groups", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<User> users;



     */






}
