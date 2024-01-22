package com.sparta.schedule.controller;

import com.sparta.schedule.dto.RequestDto;
import com.sparta.schedule.dto.ResponseDto;
import com.sparta.schedule.entity.Scedule;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ScheduleController {
    private final Map<Long, Scedule> sceduleList = new HashMap<>();
    //일정 생성하기
    @PostMapping("/scehdule")
    public ResponseDto newScedule(@RequestBody RequestDto requestDto) {
        Scedule scedule = new Scedule(requestDto);

        Long maxId = !sceduleList.isEmpty() ? Collections.max(sceduleList.keySet()) + 1 : 1;
        scedule.setId(maxId);

        sceduleList.put(scedule.getId(), scedule);

        ResponseDto responseDto = new ResponseDto(scedule);

        return responseDto;
    }
}
