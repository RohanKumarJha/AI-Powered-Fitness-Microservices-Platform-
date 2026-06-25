package com.fitness.service.impl;

import com.fitness.dto.request.ActivityRequest;
import com.fitness.dto.response.ActivityResponse;
import com.fitness.model.Activity;
import com.fitness.repository.ActivityRepository;
import com.fitness.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityResponse trackActivity(ActivityRequest request) {
        Activity activity = Activity.builder()
                .userId(request.getUserId())
                .duration(request.getDuration())
                .caloriesBurned(request.getCaloriesBurned())
                .startTime(request.getStartTime())
                .additionalMetrics(request.getAdditionalMetrics())
                .build();
        Activity savedActivity = activityRepository.save(activity);
        return mapToResponse(savedActivity);
    }

// ----------------------- Helper Method ---------------------------

    private ActivityResponse mapToResponse(Activity activity){
        return ActivityResponse
                .builder()
                .activityId(activity.getActivityId())
                .userId(activity.getUserId())
                .type(activity.getType())
                .duration(activity.getDuration())
                .caloriesBurned(activity.getCaloriesBurned())
                .startTime(activity.getStartTime())
                .additionalMetrics(activity.getAdditionalMetrics())
                .createdAt(activity.getCreatedAt())
                .updatedAt(activity.getUpdatedAt())
                .build();
    }
}
