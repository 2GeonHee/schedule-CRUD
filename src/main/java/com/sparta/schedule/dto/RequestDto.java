package com.sparta.schedule.dto;

import lombok.Getter;

@Getter
public class RequestDto {
    private String title;
    private String contents;
    private String person;
    private int password;
    private String date;

    public RequestDto(String title, String contents, String person, int password, String date) {
        this.title = title;
        this.contents = contents;
        this.person = person;
        this.password = password;
        this.date = date;
    }
}


