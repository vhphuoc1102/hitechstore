package com.phuocvh.product.dtos.product;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberPriceWrap {
  private Integer id;
  private Integer productId;
  private String memberPrice;
  private Integer memberLevelId;
  private String memberLevelName;
}
