package org.ysp.dao.impl;

import org.springframework.stereotype.Component;
import org.ysp.dao.IBaseDao;

import java.util.List;

/**
 * @author pai
 * @date 2019/9/2
 */

public abstract class IBaseDaoImpl<T> implements IBaseDao<T> {


    @Override
    public List<T> getAllUserInfo() {

        return null;
    }
}
