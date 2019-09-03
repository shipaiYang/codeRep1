package org.ysp.dao.impl;

import org.springframework.stereotype.Component;
import org.ysp.dao.UserDao;
import org.ysp.entity.UserInfo;

import java.util.List;

/**
 * @author pai
 * @date 2019/9/2
 */
@Component("userDao")
public class UserDaoImpl extends BaseDaoImpl<UserInfo> implements UserDao {


}
