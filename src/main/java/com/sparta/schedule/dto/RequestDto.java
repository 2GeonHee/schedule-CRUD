package com.sparta.schedule.dto;

import lombok.Getter;

@Getter
public class RequestDto {
    private String title;
    private String contents;
    private int password;
    private String date;

    public RequestDto(String title, String contents, int password, String date) {
        this.title = title;
        this.contents = contents;
        this.password = password;
        this.date = date;
    }
}


