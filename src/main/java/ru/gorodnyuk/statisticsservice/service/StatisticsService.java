package ru.gorodnyuk.statisticsservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import ru.gorodnyuk.statisticsservice.repository.StatisticsRepository;

@Service
@RequiredArgsConstructor
public class StatisticsService {

    public static final String UNKNOWN_IP = "unknown";

    private final StatisticsRepository statisticsRepository;

    public void calculate(String ip) {
        if (StringUtils.hasText(ip)) {
            statisticsRepository.updateStatisticByIp(ip);
        } else {
            statisticsRepository.updateStatisticByIp(UNKNOWN_IP);
        }
    }
}
