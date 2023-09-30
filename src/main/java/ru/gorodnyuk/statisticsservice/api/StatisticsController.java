package ru.gorodnyuk.statisticsservice.api;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gorodnyuk.statisticsservice.service.StatisticsService;

@RestController
@RequestMapping("/api/statistics")
@RequiredArgsConstructor
public class StatisticsController {

    private final StatisticsService statisticsService;

    @PostMapping
    public void createStatistics(HttpServletRequest httpServletRequest) {
        statisticsService.process(httpServletRequest.getRemoteAddr());
    }
}
