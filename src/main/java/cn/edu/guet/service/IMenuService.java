package cn.edu.guet.service;

import cn.edu.guet.model.Menus;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IMenuService {
    List<Menus> getAllMenus();
}
