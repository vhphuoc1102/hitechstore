package com.phuocvh.product.entities;

import com.phuocvh.common.entities.BaseEntity;
import com.phuocvh.common.util.HashMapConverter;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Map;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "pms_sku")
public class PmsSku extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  @Column(columnDefinition = "varchar(64) default ''")
  private String skuName;

  @Column(columnDefinition = "varchar(64) default ''")
  private String skuCode;

  @Column(columnDefinition = "decimal(15,3) default 0")
  private BigDecimal price;

  @Column(columnDefinition = "decimal(15,3) default 0")
  private BigDecimal promotionPrice;

  @Comment("Sale properties data save in JSON format")
  @Column(columnDefinition = "varchar(500) default ''")
  @Convert(converter = HashMapConverter.class)
  private Map<String, Object> spData;

  @Column(columnDefinition = "varchar(255) default ''")
  private String pic;

  @Column(columnDefinition = "int default 0")
  private Integer stock;

  @Column(columnDefinition = "int default 0")
  private Integer lowStock;

  @Column(columnDefinition = "int default 0")
  private Integer sale;

  @ManyToOne private PmsProduct productId;
}
