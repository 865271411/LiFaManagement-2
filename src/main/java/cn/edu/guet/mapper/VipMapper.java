package cn.edu.guet.mapper;

import cn.edu.guet.model.Vip;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VipMapper {
    List<Vip> getVipByTel(String phone);
    List<Vip> getAllVip();
}
