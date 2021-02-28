package com.zhang.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhang.product.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: zhangshuaiyin
 * @date: 2021/2/28 13:42
 */
@Repository
public interface ProductMapper extends BaseMapper<Product> {
}
