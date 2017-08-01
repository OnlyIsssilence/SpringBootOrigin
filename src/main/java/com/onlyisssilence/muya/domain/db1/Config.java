package com.onlyisssilence.muya.domain.db1;

import javax.persistence.*;

/**
 * Author: MuYa
 * Date  : 2017/7/24
 * Description:
 */
@Entity
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String cron;


    public Config(String cron) {
        this.cron = cron;
    }

    public Config() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }
}
