package org.example.cdweb_be.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class LoginResponse {
    String accessToken;
    String refreshToken;
}
