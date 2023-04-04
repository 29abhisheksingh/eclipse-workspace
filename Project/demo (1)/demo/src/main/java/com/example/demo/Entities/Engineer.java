package com.example.demo.Entities;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@Getter

public class Engineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer engineerId;
    private String password;
    private String engineerName;
    private String domain;
    @OneToMany
    private List<Complaint> complaint;

}
