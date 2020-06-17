package com.hbz.blog.mapper;

import com.hbz.blog.entity.TBlog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2020-06-11
 */
public interface TBlogMapper extends BaseMapper<TBlog> {
    void updateViews(long id);
}
