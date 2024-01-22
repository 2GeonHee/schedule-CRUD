package com.sparta.schedule.entity;

import com.sparta.schedule.dto.RequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Scedule {
    private Long id;
    private String title;
    private String contents;
    private int password;
    private String date;

    public Scedule(RequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
        this.date = requestDto.getDate();
    }
}
