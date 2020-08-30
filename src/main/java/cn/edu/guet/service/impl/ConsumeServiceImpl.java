package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.ConsumeMapper;
import cn.edu.guet.model.Consume;
import cn.edu.guet.service.IConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ConsumeServiceImpl implements IConsumeService {

    @Autowired
    ConsumeMapper consumeMapper;
    @Override
    @Transactional
    public List<Consume> getAllConsume() {
        return consumeMapper.getAllConsume();
    }

    @Override
    @Transactional
    public List<Consume> getConsumeByDay(String day) {
        return consumeMapper.getConsumeByDay(day);
    }

    @Override
    @Transactional
    public void deleteConsume(String num){
         consumeMapper.deleteConsume(num);
    }
}
