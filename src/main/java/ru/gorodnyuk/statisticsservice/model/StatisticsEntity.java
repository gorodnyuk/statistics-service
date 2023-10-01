package ru.gorodnyuk.statisticsservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "statistics")
public class StatisticsEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ip")
    private String ip;

    @Column(name = "counter")
    private Long counter;

    public StatisticsEntity(String ip) {
        this.ip = ip;
    }
}
