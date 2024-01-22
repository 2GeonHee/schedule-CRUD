package com.sparta.schedule.controller;

import com.sparta.schedule.dto.RequestDto;
import com.sparta.schedule.entity.Scedule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleControllerTest {

    @Test
    void newScedule() {
        Scedule scedule = new Scedule(new RequestDto("어린왕자","행복하게 살았습니다",1,"2024-01-22"));
    }
}