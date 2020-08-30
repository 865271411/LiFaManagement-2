package cn.edu.guet.service;

import cn.edu.guet.model.Vip;

import java.util.List;

public interface IVipService {
    List<Vip> getVipByTel(String phone);
    List<Vip> getAllVip();
}
