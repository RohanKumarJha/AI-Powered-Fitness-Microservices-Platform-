package com.fitness.dto.response;

import com.fitness.model.ENUM.ActivityType;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityResponse {
    private String activityId;
    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String, Object> additionalMetrics;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
