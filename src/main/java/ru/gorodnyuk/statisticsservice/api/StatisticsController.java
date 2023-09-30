package ru.gorodnyuk.statisticsservice.api;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/statistics")
public class StatisticsController {

    @PostMapping
    public ResponseEntity<?> createStatistics(HttpServletRequest httpServletRequest) {
        return null;
    }
}
