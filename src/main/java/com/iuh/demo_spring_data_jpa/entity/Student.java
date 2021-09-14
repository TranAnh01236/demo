package com.iuh.demo_spring_data_jpa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int score;


}
