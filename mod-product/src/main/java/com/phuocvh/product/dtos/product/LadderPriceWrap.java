package com.phuocvh.product.dtos.product;

import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LadderPriceWrap {
  private Integer id;
  private Integer productId;
  private Integer count;
  private BigDecimal discount;
  private BigDecimal price;
}
