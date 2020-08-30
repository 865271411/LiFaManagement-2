package cn.edu.guet.mapper;

import cn.edu.guet.model.Menus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenusMapper {
    List<Menus> getAllMenus();
}
