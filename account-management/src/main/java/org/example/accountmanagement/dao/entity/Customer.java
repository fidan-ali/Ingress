package org.example.accountmanagement.dao.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode(of = "id")
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String surname;
}
