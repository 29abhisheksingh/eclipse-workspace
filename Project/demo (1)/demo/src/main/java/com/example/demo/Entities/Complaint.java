package com.example.demo.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer complaintId;
    private String complainName;
    private String status;
    private Date date;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Engineer engineer;
}
	
	