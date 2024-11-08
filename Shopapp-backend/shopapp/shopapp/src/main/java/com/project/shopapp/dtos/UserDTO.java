package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    @JsonProperty("fullname")
    private String fullName;

    @JsonProperty("phone_number")
    @NotBlank(message = "Phone number is require")
    private String phoneNumber;

    private String address;

    @NotBlank(message = "Password can not be blank")
    private String password;

    @JsonProperty("retype_password")
    private String retypePassword;


    @JsonProperty("dateOfBirth")
    private Date dateOfBirth;

    @JsonProperty("facebook_account_id")
    private int facebookAccountId;

    @JsonProperty("google_account_id")
    private int googleAccountId;

    @NotNull(message = "RoleId is required")
    @JsonProperty("role_id")
    private Long roleId;

    public @NotBlank(message = "Password can not be blank") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password can not be blank") String password) {
        this.password = password;
    }

    public String getRetypePassword() {
        return retypePassword;
    }

    public void setRetypePassword(String retypePassword) {
        this.retypePassword = retypePassword;
    }
}
