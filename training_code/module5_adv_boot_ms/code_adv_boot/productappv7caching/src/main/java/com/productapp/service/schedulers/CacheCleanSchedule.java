package com.productapp.service.schedulers;

import com.productapp.service.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Log4j2
public class CacheCleanSchedule {

    @Autowired
    private ProductService productService;

    @Scheduled(cron = "0,30 * * * * *")
    public void cleanCache(){
        log.info("cache is cleaned at :{} ", LocalDateTime.now());
        productService.evictAll();
    }
}
