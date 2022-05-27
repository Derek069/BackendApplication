package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq_gen")
    @SequenceGenerator(name = "customer_seq_gen", sequenceName = "customer_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name", columnDefinition = "varchar(60)",nullable = false)
    private String firstname;
    @Column(name = "last_name", columnDefinition = "varchar(60)",nullable = false)
    private String lastname;
    @Column(name = "matricula", columnDefinition = "varchar(60)",nullable = false)
    private String matricula;

    public CustomerEntity(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}

