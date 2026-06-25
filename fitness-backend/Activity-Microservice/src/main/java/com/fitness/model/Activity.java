package com.fitness.model;

import com.fitness.model.ENUM.ActivityType;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Map;

@Document(collection = "activities")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    @Id
    private String activityId;
    private String userId;

    @Builder.Default
    private ActivityType type = ActivityType.CARDIO;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;

    @Field("metrics")
    private Map<String, Object> additionalMetrics;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}