package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.VipMapper;
import cn.edu.guet.model.Vip;
import cn.edu.guet.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IVipServiceImpl implements IVipService {
    @Autowired
    VipMapper vipMapper;

    @Override
    public List<Vip> getVipByTel(String phone) {
        return vipMapper.getVipByTel(phone);
    }

    @Override
    public List<Vip> getAllVip() {
        return vipMapper.getAllVip();
    }
}
