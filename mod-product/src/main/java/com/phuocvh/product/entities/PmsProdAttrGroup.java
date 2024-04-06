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
@Table(name = "pms_product_attribute_group")
public class PmsProdAttrGroup extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  @Column(columnDefinition = "varchar(64) default ''")
  private String name;

  @Column(columnDefinition = "int default 0")
  private Integer attributeCount;

  @Column(columnDefinition = "int default 0")
  private Integer paramCount;
}
