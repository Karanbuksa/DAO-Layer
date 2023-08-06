package com.example.daolayer.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;


}
