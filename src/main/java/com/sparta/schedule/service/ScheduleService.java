package com.sparta.schedule.service;

import com.sparta.schedule.dto.ScheduleRequestDto;
import com.sparta.schedule.dto.ScheduleResponseDto;
import com.sparta.schedule.entity.Schedule;
import com.sparta.schedule.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.image.RescaleOp;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Transactional
    public ScheduleResponseDto saveSchedule(ScheduleRequestDto requestDto) {
        Schedule schedule = new Schedule(requestDto);
        Schedule saveSchedule = scheduleRepository.save(schedule);
        return new ScheduleResponseDto(schedule);
    }

    public List<Schedule> getScheduleList() {
        return scheduleRepository.findAll();
    }

    public ScheduleResponseDto getSchdule(Long id) {
        Schedule schedule = scheduleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("선택한 일정이 없습니다."));
        return new ScheduleResponseDto(schedule);
    }

    @Transactional
    public Schedule update(Long id, ScheduleRequestDto requestDto) {
        Schedule schedule = scheduleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("선택한 일정이 없습니다."));
//        if (scheduleRepository.findById(id).equals(requestDto.getPassword())) {
            schedule.update(requestDto);
//        }
            return schedule;
    }

    @Transactional
    public void deleteSchedule(Long id) {
        Schedule schedule = scheduleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("선택한 일정이 없습니다."));
//        if (scheduleRepository.findById(id).equals(requestDto.getPassword())) {
            scheduleRepository.deleteById(id);
//        }
    }
}
