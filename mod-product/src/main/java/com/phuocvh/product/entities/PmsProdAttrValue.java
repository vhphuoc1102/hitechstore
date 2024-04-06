package com.phuocvh.product.entities;

import com.phuocvh.common.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "pms_product_attribute_value")
public class PmsProdAttrValue extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  @Column(columnDefinition = "varchar(64) default ''")
  private String value;

  @ManyToOne private PmsProduct productId;

  @ManyToOne private PmsProdAttr attributeId;
}
