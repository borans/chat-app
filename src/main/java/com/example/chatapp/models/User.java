package com.example.chatapp.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    private Long userId;

    private String userName;

    /*
     @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // we need to configure the many-to-many relationship so that it can be reflected
    // to the database
    @JoinTable(
            name = "user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    @JsonIgnore
    private Set<Group> groups;



     */



}
