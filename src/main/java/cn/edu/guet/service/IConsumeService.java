package cn.edu.guet.service;

import cn.edu.guet.model.Consume;

import java.util.List;

public interface IConsumeService {
    List<Consume> getAllConsume();
    List<Consume> getConsumeByDay(String day);
    void deleteConsume(String num);
}
