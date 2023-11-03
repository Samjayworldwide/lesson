package com.samjay.lesson.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_id_card")
public class StudentIDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String IdNumber;
    @OneToOne(cascade = {CascadeType.PERSIST}, mappedBy = "studentIDCard")
    private CustomerEntity customer;
}
