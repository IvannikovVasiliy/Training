package com.example.training.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "jc_contact")
public class JcContact {
    @Id
    @Column(name = "contact_id")
    private Long id;

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    // Убрать NotNull
    //private
    @NotNull
    private String phone;

    @NotNull
    private String email;
}
