package org.ysp.service.impl;

import org.springframework.stereotype.Service;
import org.ysp.dao.UserDao;
import org.ysp.entity.UserInfo;
import org.ysp.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pai
 * @date 2019/9/2
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<UserInfo> getAllUserInfo() {
        return userDao.loadAll();
    }
}
