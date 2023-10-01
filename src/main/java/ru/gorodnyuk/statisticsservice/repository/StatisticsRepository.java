package ru.gorodnyuk.statisticsservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gorodnyuk.statisticsservice.model.StatisticsEntity;

public interface StatisticsRepository extends CrudRepository<StatisticsEntity, Long> {
    void updateStatisticByIp(String ip);
}
