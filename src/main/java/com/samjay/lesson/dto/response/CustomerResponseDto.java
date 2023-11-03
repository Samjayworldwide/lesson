package com.samjay.lesson.dto.response;

import com.samjay.lesson.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDto {
    private String name;
    private String email;
    private Gender gender;
}
