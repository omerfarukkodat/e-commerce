package com.kodat.of.ecommerce.role;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kodat.of.ecommerce.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "role")
@EntityListeners(AuditingEntityListener.class)
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private List<User> user;

    @CreatedDate
    @Column(nullable = false , updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime lastModifiedDate;
}
