package com.andygomez.jwt2.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContact")
    private Long id;

    private String name;

    private LocalDate birthDay;

    private String phone;

    private String email;


}
