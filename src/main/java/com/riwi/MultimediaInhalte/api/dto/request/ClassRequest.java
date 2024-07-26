package com.riwi.MultimediaInhalte.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassRequest {
    @NotBlank(message = "The name is required")
    private String name;
    @NotBlank(message = "The description is required")
    private String description;
    @NotNull(message = "The created is required")
    private LocalDateTime createdAt;
    private Boolean active;
}
