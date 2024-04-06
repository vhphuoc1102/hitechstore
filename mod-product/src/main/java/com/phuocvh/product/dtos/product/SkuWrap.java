package com.phuocvh.product.dtos.product;

import java.math.BigDecimal;
import java.util.Map;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkuWrap {
  private Integer id;
  private String skuName;
  private String skuCode;
  private BigDecimal price;
  private BigDecimal promotionPrice;
  private Map<String, Object> spData;
  private String pic;
  private Integer stock;
  private Integer lowStock;
  private Integer sale;
  private Integer productId;
}
