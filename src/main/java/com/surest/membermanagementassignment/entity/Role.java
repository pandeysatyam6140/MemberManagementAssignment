package com.surest.membermanagementassignment.entity;

import jakarta.persistence.*;

import lombok.*;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Entity
@Table(name = "role")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Role {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name", nullable = false, unique = true, length = 50)
    private String name;

}