package com.xuetang9.house.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuetang9.house.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassName: BaseServiceImpl
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-15 17:09
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
public abstract class BaseServiceImpl<T, ID, BaseMapper extends Mapper<T>> implements BaseService<T, ID> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected BaseMapper baseMapper;

    @Override
    public int deleteById(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int delete(T record) {
        return baseMapper.delete(record);
    }

    @Override
    public int save(T record) {
        return baseMapper.insert(record);
    }

    @Override
    public int saveWithoutNull(T record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public boolean existsWithId(ID id) {
        return baseMapper.existsWithPrimaryKey(id);
    }

    @Override
    public List<T> listAll() {
        return baseMapper.selectAll();
    }

    @Override
    public T getById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int listCount(T record) {
        return baseMapper.selectCount(record);
    }

    @Override
    public List<T> list(T record) {
        return baseMapper.select(record);
    }

    @Override
    public T getOne(T record) {
        return baseMapper.selectOne(record);
    }

    @Override
    public int updateById(T record) {
        return baseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByIdWithoutNull(T record) {
        return baseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Page<T> listByPage(int pageIndex, int pageSize) {
        // 使用分页
        Page<T> page = PageHelper.startPage(pageIndex, pageSize);
        baseMapper.selectAll();
        return page;
    }

    @Override
    public Page<T> listByPage(int pageIndex, int pageSize, T record) {
        // 使用分页
        Page<T> page = PageHelper.startPage(pageIndex, pageSize);
        baseMapper.select(record);
        return page;
    }
}
