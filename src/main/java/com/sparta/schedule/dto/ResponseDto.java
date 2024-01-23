package com.sparta.schedule.dto;

import com.sparta.schedule.entity.Schedule;
import lombok.Getter;

@Getter
public class ResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String person;
    private int password;
    private String date;

    public ResponseDto(Schedule scedule) {
        this.id = scedule.getId();
        this.title = scedule.getTitle();
        this.contents = scedule.getContents();
        this.person = scedule.getPerson();
        this.date = scedule.getDate();
    }
}
