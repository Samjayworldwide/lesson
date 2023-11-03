package com.samjay.lesson.entity;

import com.samjay.lesson.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "CustomerEntity")
@Table(name = "customer_table")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String phoneNumber;
    private String password;
    @OneToOne(cascade =
            {CascadeType.PERSIST,CascadeType.REMOVE}, orphanRemoval = true)
    @JoinColumn(

            name = "student_id",
            referencedColumnName = "id"
    )
    private StudentIDCard studentIDCard;

}
