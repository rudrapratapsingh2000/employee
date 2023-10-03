package com.employee.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeid")
    private Long id;
    @NotNull
    @Column(name = "firstname")
    private String firstName;
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_addressid")
    private Address address;
}
