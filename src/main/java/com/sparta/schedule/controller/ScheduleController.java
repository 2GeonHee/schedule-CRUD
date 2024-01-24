package com.sparta.schedule.controller;

import com.sparta.schedule.dto.ScheduleRequestDto;
import com.sparta.schedule.dto.ScheduleResponseDto;
import com.sparta.schedule.entity.Schedule;
import com.sparta.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedule")
    public ScheduleResponseDto saveSchedule(@RequestBody ScheduleRequestDto scheduleRequestDto) {
        return scheduleService.saveSchedule(scheduleRequestDto);
    }

    @GetMapping("/schedule")
    public List<Schedule> getScheduleList() {
        return scheduleService.getScheduleList();
    }

    @PutMapping("/schedule/{id}")
    public Schedule update(Long id, @RequestBody ScheduleRequestDto scheduleRequestDto) {
        return scheduleService.update(id, scheduleRequestDto);
    }

    @DeleteMapping("/schedule/{id}")
    public void deleteSchedule(Long id) {
    }
}
