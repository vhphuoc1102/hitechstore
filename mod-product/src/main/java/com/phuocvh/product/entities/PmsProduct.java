package com.phuocvh.product.entities;

import com.phuocvh.common.entities.BaseEntity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "pms_product")
public class PmsProduct extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  @Column(columnDefinition = "varchar(64) default ''")
  private String name;

  @Column(columnDefinition = "varchar(255) default ''")
  private String pic;

  @Column(columnDefinition = "varchar(64) default ''")
  private String productSn;

  @Column(columnDefinition = "int(1) default 0")
  private Integer deleteStatus;

  @Column(columnDefinition = "int(1) default 0")
  private Integer publishStatus;

  @Column(columnDefinition = "int(1) default 0")
  private Integer newStatus;

  @Column(columnDefinition = "int(1) default 0")
  private Integer recommendStatus;

  @Column(columnDefinition = "int(1) default 0")
  private Integer verifyStatus;

  @Column(columnDefinition = "int(1) default 0")
  private Integer previewStatus;

  @Column(columnDefinition = "decimal(15,3) default 0")
  private BigDecimal price;

  @Column(columnDefinition = "decimal(15,3) default 0")
  private BigDecimal promotionPrice;

  @Column(columnDefinition = "decimal(15,3) default 0")
  private BigDecimal originalPrice;

  @Column(columnDefinition = "text default ''")
  private String description;

  @Column(columnDefinition = "varchar(255) default ''")
  private String subTitle;

  @Column(columnDefinition = "decimal(10,2) default 0")
  private BigDecimal weight;

  @Column(columnDefinition = "varchar(255) default ''")
  private String keywords;

  @Column(columnDefinition = "varchar(255) default ''")
  private String albumPics;

  @Comment("Quantity of product available in stock")
  @Column(columnDefinition = "int default 0")
  private Integer stock;

  @Comment("Quantity threshold")
  @Column(columnDefinition = "int default 0")
  private Integer lowStock;

  @Column(columnDefinition = "varchar(16) default ''")
  private String unit;

  @Comment("Number of sale products")
  @Column(columnDefinition = "int default 0")
  private Integer sale;

  @Column(columnDefinition = "datetime")
  private Instant promotionStartTime;

  @Column(columnDefinition = "datetime")
  private Instant promotionEndTime;

  @Column(columnDefinition = "int default 0")
  private Integer promotionLimit;

  // DEF: promotion là những sự kiện có thay đổi về giá.
  @Comment(
      "0->Use original price without promotion; "
          + "1->Use promotional price; "
          + "2->Use member price; "
          + "3->Use ladder price; "
          + "4->Use full discount price; "
          + "5->Limited time purchase")
  @Column(columnDefinition = "int(1) default 0")
  private Integer promotionType;

  @Column(columnDefinition = "varchar(255) default ''")
  private String note;

  @Column(columnDefinition = "int default 0")
  private Integer giftGrowth;

  @Column(columnDefinition = "int default 0")
  private Integer giftPoint;

  @Column(columnDefinition = "int default 0")
  private Integer usePointLimit;

  @ManyToOne private PmsCategory categoryId;

  @ManyToOne private PmsBrand brandId;

  @ManyToOne private PmsProdAttrGroup prodAttrGroupId;
}
