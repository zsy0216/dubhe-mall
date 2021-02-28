package mapper;

import com.zhang.product.mapper.ProductMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: zhangshuaiyin
 * @date: 2021/2/28 13:44
 */
@SpringBootTest
public class ProductMapperTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void test(){
        System.out.println(productMapper.selectList(null));
    }
}
