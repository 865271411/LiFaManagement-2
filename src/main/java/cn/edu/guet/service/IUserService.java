package cn.edu.guet.service;

import cn.edu.guet.model.User;
import org.springframework.stereotype.Service;

public interface IUserService {

    User login(String username, String password);
}
