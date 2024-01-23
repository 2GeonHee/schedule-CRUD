package com.sparta.schedule.controller;

import com.sparta.schedule.dto.RequestDto;
import com.sparta.schedule.dto.ResponseDto;
import com.sparta.schedule.entity.Schedule;
import lombok.Value;
import lombok.val;
import org.springframework.web.bind.annotation.*;

import java.security.Key;
import java.util.*;

@RestController
@RequestMapping("/api")
public class ScheduleController {
    Scanner sc = new Scanner(System.in);
    private final Map<Long, Schedule> scheduleList = new HashMap<>();

    @PostMapping("/schedule")
    public ResponseDto newSchedule(@RequestBody RequestDto requestDto) {
        Schedule schedule = new Schedule(requestDto);

        Long maxId = !scheduleList.isEmpty() ? Collections.max(scheduleList.keySet()) + 1 : 1;
        schedule.setId(maxId);

        scheduleList.put(schedule.getId(), schedule);

        ResponseDto responseDto = new ResponseDto(schedule);

        return responseDto;
    }

    @GetMapping("/schedule")
    public List<ResponseDto> getAllSchedule() {
        List<ResponseDto> allList = scheduleList.values().stream().map(ResponseDto::new).toList();
        return allList;
    }

    //    키값에 해당하는 value 가져오기
//    @GetMapping("/schedule")
//    public void getSchedule() {
//        if (scheduleList.containsKey(key)) {
//            System.out.println(scheduleList.get(key));
//        }
//    }

    @PutMapping("/schedule/{id}")
    public Long update(@PathVariable Long id, @RequestBody RequestDto requestDto) {
        if (scheduleList.containsKey(id)) {
            Schedule schedule = scheduleList.get(id);
            schedule.update(requestDto);
            return schedule.getId();
        } else {
            throw new IllegalArgumentException("일정이 존재하지 않습니다");
        }
    }

    @DeleteMapping("/schedule/{id}")
    public Long delete(@PathVariable Long id, @RequestBody RequestDto requestDto) {
        if (scheduleList.containsKey(id)) {
            scheduleList.remove(id);
            return id;
        } else {
            throw new IllegalArgumentException("일정이 존재하지 않습니다.");
        }
    }
}