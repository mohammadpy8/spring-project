package com.example.springstart.response;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Personal {
    @NotNull(message = "id not null")
    private final Long id;
    private final String fullName;
    private final Long nationalID;
}
