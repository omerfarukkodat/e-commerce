package com.kodat.of.ecommerce.token;

import com.kodat.of.ecommerce.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Token {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String token;

    private LocalDateTime createdAt;
    private LocalDateTime validatedAt;
    private LocalDateTime expiredAt;

    @ManyToOne
    @JoinColumn(name = "userId" , nullable = false)
    private User user;
}
