package cn.itsource.gofishing.mapper;

import cn.itsource.product.domain.Sku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * SKU Mapper 接口
 * </p>
 *
 * @author BKE
 * @since 2019-10-17
 */
public interface SkuMapper extends BaseMapper<Sku> {

    List<Sku> getSkusByProductId(Long productId);
}
