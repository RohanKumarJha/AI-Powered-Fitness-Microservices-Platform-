package com.fitness.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityRequest {

    @NotBlank(message = "User ID should not be blank")
    private String userId;

    @NotNull(message = "Duration is required")
    @Positive(message = "Duration must be greater than 0")
    private Integer duration;

    @NotNull(message = "Calories burned is required")
    @Positive(message = "Calories burned must be greater than 0")
    private Integer caloriesBurned;

    @NotNull(message = "Start time is required")
    private LocalDateTime startTime;

    @Size(max = 10, message = "Additional metrics cannot exceed 10 entries")
    private Map<String, Object> additionalMetrics;
}
