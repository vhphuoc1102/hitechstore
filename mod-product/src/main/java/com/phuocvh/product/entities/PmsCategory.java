package com.phuocvh.product.entities;

import com.phuocvh.common.entities.BaseEntity;
import jakarta.persistence.*;
import java.util.List;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "pms_category")
public class PmsCategory extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  @Column(columnDefinition = "varchar(64) default ''")
  private String name;

  @Column(columnDefinition = "varchar(255) default ''")
  private String icons;

  @Column(columnDefinition = "varchar(255) default ''")
  private String keywords;

  @Column(columnDefinition = "text default ''")
  private String description;

  @Column(columnDefinition = "int(1) default 0")
  private Integer showStatus;

  @Column(columnDefinition = "int default 0")
  private Integer productCount;

  @ManyToMany private List<PmsProdAttr> attributeIds;

  @ManyToOne private PmsCategory parentCategory;
}
