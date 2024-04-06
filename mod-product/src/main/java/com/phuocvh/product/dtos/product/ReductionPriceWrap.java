package com.phuocvh.product.dtos.product;

import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReductionPriceWrap {
  private Integer id;
  private Integer productId;
  private BigDecimal fullPrice;
  private BigDecimal reducePrice;
}
