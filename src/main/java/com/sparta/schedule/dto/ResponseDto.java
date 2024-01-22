package com.sparta.schedule.dto;

import com.sparta.schedule.entity.Scedule;
import lombok.Getter;

@Getter
public class ResponseDto {
    private Long id;
    private String title;
    private String contents;
    private int password;
    private String date;

    public ResponseDto(Scedule scedule) {
        this.id = scedule.getId();
        this.title = scedule.getTitle();
        this.contents = scedule.getContents();
        this.password = scedule.getPassword();
        this.date = scedule.getDate();
    }
}
