package com.phuocvh.product.dtos.product;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdAttrValueWrap {
  private Integer id;
  private String value;
  private Integer productId;
  private Integer attributeId;
}
