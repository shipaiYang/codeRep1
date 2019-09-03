package org.ysp.dao;

import org.ysp.entity.UserInfo;

import java.util.List;

public interface BaseDao<T> {
    /**
     * 查询全部用户信息
     * @return
     */
    List<T> loadAll();

    void save(T entity);

}
