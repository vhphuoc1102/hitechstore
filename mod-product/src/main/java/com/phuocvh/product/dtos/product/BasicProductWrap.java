package com.phuocvh.product.dtos.product;

import java.math.BigDecimal;
import java.time.Instant;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BasicProductWrap {
  private Integer id;
  private String name;
  private String productSn;
  private BigDecimal price;
  private BigDecimal promotionPrice;
  private BigDecimal originalPrice;
  private String subtitle;
  private String description;
  private BigDecimal weight;
  private String keywords;
  private Integer stock;
  private Integer lowStock;
  private String unit;
  private String note;

  private Instant promotionStartTime;
  private Instant promotionEndTime;
  private Integer promotionLimit;
  private Integer promotionType;

  private Integer giftGrowth;
  private Integer giftPoint;
  private Integer usePointLimit;

  private Integer categoryId;
  private Integer brandId;
  private Integer prodAttrGroup;
}
