package cn.edu.guet.mapper;

import cn.edu.guet.model.Consume;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface ConsumeMapper {
    List<Consume> getAllConsume();
    List<Consume> getConsumeByDay(String day);
    void deleteConsume(String num);


}
