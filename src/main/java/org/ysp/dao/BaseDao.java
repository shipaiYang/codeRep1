package org.ysp.dao;

import org.ysp.entity.UserInfo;

import java.util.List;

public interface BaseDao<T> {
    List<T> loadAll();
}
