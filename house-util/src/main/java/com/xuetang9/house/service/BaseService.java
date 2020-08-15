package com.xuetang9.house.service;

import com.github.pagehelper.Page;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: BaseService
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-15 17:08
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Transactional(rollbackFor = {Exception.class})
public interface BaseService<T, ID> {
    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    int deleteById(ID id);

    /**
     * 通过传入的类删除
     *
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 插入数据
     *
     * @param record
     * @return
     */
    int save(T record);

    /**
     * 插入数据为空会被默认自动填充
     *
     * @param record
     * @return
     */
    int saveWithoutNull(T record);

    /**
     * 判断是否存在
     *
     * @param id
     * @return
     */
    boolean existsWithId(ID id);

    /**
     * 查询全部
     *
     * @return
     */
    List<T> listAll();

    /**
     * 通过主键查询
     *
     * @param id
     * @return
     */
    T getById(ID id);

    /**
     * 查询总数
     *
     * @param record
     * @return
     */
    int listCount(T record);

    /**
     * 按条件查询
     *
     * @param record
     * @return
     */
    List<T> list(T record);

    /**
     * 查询一个数据
     *
     * @param record
     * @return
     */
    T getOne(T record);

    /**
     * 通过主键更新
     *
     * @param record
     * @return
     */
    int updateById(T record);

    /**
     * 为空数据不更新
     *
     * @param record
     * @return
     */
    int updateByIdWithoutNull(T record);

    /**
     * 分页查询
     *
     * @param pageIndex
     * @param pageSize
     * @return
     */
    Page<T> listByPage(int pageIndex, int pageSize);

    /**
     * 分页查询重载
     *
     * @param pageIndex
     * @param pageSize
     * @param record
     * @return
     */
    Page<T> listByPage(int pageIndex, int pageSize, T record);

}
