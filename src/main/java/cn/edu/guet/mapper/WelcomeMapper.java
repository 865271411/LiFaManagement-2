package cn.edu.guet.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface WelcomeMapper {
    int totalVIP();
    int totalTodayConsume(String day);
}
