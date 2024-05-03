package com.kodat.of.ecommerce.user.entity;

import com.kodat.of.ecommerce.role.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_user")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private String password;
    @Column(unique = true)
    private String email;
    private LocalDate dateOfBirth;
    private boolean accountLocked;
    private boolean enabled;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime lastModifiedDate;


}
