package com.school.zyg.service;

import com.school.zyg.dao.HotMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UpdateHot {
    @Autowired
    private HotMapper hotMapper;

    @Scheduled(fixedRate = 3600000)
    private void process() {
        hotMapper.delete();
        hotMapper.update();
    }
}
