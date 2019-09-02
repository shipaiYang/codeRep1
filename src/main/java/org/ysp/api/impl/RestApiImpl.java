package org.ysp.api.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.ysp.api.IRestApi;
import org.ysp.dao.IUserDao;
import org.ysp.entity.UserInfo;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pai
 * @date 2019/9/2
 */
@Component("restApi")
public class RestApi implements IRestApi {


    @Override
    public List<UserInfo> getAllUserInfo() {


        return null;
    }
}
