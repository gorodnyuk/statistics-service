package ru.gorodnyuk.statisticsservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gorodnyuk.statisticsservice.model.StatisticsEntity;

public interface StatisticsRepository extends CrudRepository<StatisticsEntity, Long> {

    boolean existsByIp(String ip);

    void updateStatisticByIp(String ip);
}
