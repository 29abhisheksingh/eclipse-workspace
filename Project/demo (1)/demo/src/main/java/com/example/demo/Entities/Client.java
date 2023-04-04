package com.example.demo.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientId;
    private String password;
    private String address;
    private long phoneNumber;
    @OneToMany
    private List<Product> product;
    @OneToMany
    private List<Complaint> complaint;

}
