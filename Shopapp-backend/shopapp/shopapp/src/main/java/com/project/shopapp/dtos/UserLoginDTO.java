package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDTO {

    @JsonProperty("phoneNumber")
    @NotBlank(message = "Phone number is require")
    private String phoneNumber;

    @NotBlank(message = "Password can not be blank")
    private String password;

}
