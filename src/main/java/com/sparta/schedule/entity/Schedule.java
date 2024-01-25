package com.sparta.schedule.entity;

import com.sparta.schedule.dto.ScheduleRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@Getter
@Entity
public class Schedule {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String contents;
    private String name;
    private String password;

    public Schedule(ScheduleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.name = requestDto.getName();
        this.password = requestDto.getPassword();
    }

    public void update(ScheduleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.name = requestDto.getName();
    }

    public boolean pass1(ScheduleRequestDto requestDto) {
       boolean pass = Objects.equals(this.password, requestDto.getPassword());
       return pass;
    }
    public boolean pass2(String password) {
        boolean pass = Objects.equals(this.password, password);
        return pass;
    }
}