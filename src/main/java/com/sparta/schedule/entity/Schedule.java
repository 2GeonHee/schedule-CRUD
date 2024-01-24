package com.sparta.schedule.entity;

import com.sparta.schedule.dto.ScheduleRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Schedule {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String contents;
    private String password;

    public Schedule(ScheduleRequestDto scheduleRequestDto) {
        this.name = scheduleRequestDto.getName();
        this.contents = scheduleRequestDto.getContents();
        this.password = scheduleRequestDto.getPassword();
    }

    public void update(ScheduleRequestDto requestDto) {
        this.name = requestDto.getName();
        this.contents = requestDto.getContents();
    }
}