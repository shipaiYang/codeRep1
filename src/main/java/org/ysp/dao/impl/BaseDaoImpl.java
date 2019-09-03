package org.ysp.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.ysp.dao.BaseDao;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author pai
 * @date 2019/9/2
 */

public class BaseDaoImpl<T> implements BaseDao<T> {
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    private Class entityClass;

    {
        // 泛类的转换
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        entityClass = (Class) type.getActualTypeArguments()[0];
    }


    @Override
    public List<T> loadAll() {
        return hibernateTemplate.loadAll(entityClass);
    }

    @Override
    public void save(T entity) {
        hibernateTemplate.save(entity);
    }
}
