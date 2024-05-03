package com.kodat.of.ecommerce.user.dto;

import com.kodat.of.ecommerce.role.UserRole;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserDTO {
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private UserRole role;
    private boolean accountLocked;
    private boolean enabled;

}
