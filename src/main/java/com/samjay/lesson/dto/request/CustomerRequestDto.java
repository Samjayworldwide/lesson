package com.samjay.lesson.dto.request;

import com.samjay.lesson.enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerRequestDto {
    private Long id;
    @NotNull(message = "this field cannot be null")
    @NotBlank(message = "this field cannot be blank")
    @NotEmpty(message = "this field cannot be Empty")
    private String name;

    @NotNull(message = "this field cannot be null")
    @NotBlank(message = "this field cannot be blank")
    @NotEmpty(message = "this field cannot be Empty")
    private String email;


    private Gender gender;

    @NotNull(message = "this field cannot be null")
    @NotBlank(message = "this field cannot be blank")
    @NotEmpty(message = "this field cannot be Empty")
    private String phoneNumber;

    @NotNull(message = "this field cannot be null")
    @NotBlank(message = "this field cannot be blank")
    @NotEmpty(message = "this field cannot be Empty")
    private String password;

    @NotNull(message = "this field cannot be null")
    @NotBlank(message = "this field cannot be blank")
    @NotEmpty(message = "this field cannot be Empty")
    private String retypePassword;

}
