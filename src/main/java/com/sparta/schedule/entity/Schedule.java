package com.sparta.schedule.entity;

import com.sparta.schedule.dto.RequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Schedule {
    private Long id;
    private String title;
    private String contents;
    private String person;
    private int password;
    private String date;

    public Schedule(RequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.person = requestDto.getPerson();
        this.password = requestDto.getPassword();
        this.date = requestDto.getDate();
    }
    public void update(RequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.person = requestDto.getPerson();
    }
}
