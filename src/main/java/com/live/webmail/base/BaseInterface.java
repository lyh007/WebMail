package com.live.webmail.base;

import java.util.List;

/**
 * 公共接口，包括添加、修改、删除、通过id查询、分页查询、查询总数
 *
 * @author kevin
 * @version Revision: 1.00 Date: 10-12-21下午2:16
 * @Email liuyuhui007@gmail.com
 */
public interface BaseInterface<T> {
    /**
     * 保存
     *
     * @param entity
     */
    public void save(T entity);

    /**
     * 修改
     *
     * @param entity
     */
    public void update(T entity);

    /**
     * 删除
     *
     * @param id
     */
    public void delete(Integer id);

    /**
     * 批量删除
     */
    public void deleteByIds(String ids);

    /**
     * 通过id查询
     *
     * @param id
     * @return
     */
    public T getById(Integer id);

    /**
     * 分页查询
     *
     * @param queryParams
     * @return
     */
    public List<T> queryByPage(QueryParams<?> queryParams);

    /**
     * 获取总数
     *
     * @param params
     * @return
     */
    public int getTotalCount(Object params);
}
