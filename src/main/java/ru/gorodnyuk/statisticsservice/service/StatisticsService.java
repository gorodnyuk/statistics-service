package ru.gorodnyuk.statisticsservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gorodnyuk.statisticsservice.repository.StatisticsRepository;

@Service
@RequiredArgsConstructor
public class StatisticsService {

    private final StatisticsRepository statisticsRepository;

    public void process(String ip) {
    }
}
