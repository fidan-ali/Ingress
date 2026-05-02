package org.example.accountmanagement.dao.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode(of = "id")
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String username;
    private String password;
}
