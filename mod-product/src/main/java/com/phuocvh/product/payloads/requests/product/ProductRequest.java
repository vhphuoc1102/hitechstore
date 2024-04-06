package com.phuocvh.product.payloads.requests.product;

import java.util.List;

import com.phuocvh.product.dtos.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductRequest extends BasicProductWrap {
  List<MemberPriceWrap> memberPriceList;
  List<LadderPriceWrap> ladderPriceList;
  List<SkuWrap> skuList;
  List<ProdAttrValueWrap> prodAttrValueList;
}
