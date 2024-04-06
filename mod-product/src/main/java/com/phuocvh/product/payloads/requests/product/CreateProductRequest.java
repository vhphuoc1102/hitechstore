package com.phuocvh.product.payloads.requests.product;

import com.phuocvh.product.dtos.product.*;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CreateProductRequest extends BasicProductWrap {
  List<MemberPriceWrap> memberPriceList;
  List<LadderPriceWrap> ladderPriceList;
  List<SkuWrap> skuList;
  List<ProdAttrValueWrap> prodAttrValueList;
}
