package com.phuocvh.product.entities;

import com.phuocvh.common.entities.BaseEntity;
import jakarta.persistence.*;
import java.util.List;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "pms_product_attribute")
public class PmsProdAttr extends BaseEntity {
  @Id private Integer id;

  @Column(columnDefinition = "varchar(64) default ''")
  private String name;

  @Comment("0 -> unique value, 1 -> single selection, 2 -> multiple selection")
  @Column(columnDefinition = "int(1) default 0")
  private Integer selectType;

  @Comment("0 -> manual entry, 1 -> select from list")
  @Column(columnDefinition = "int(1) default 0")
  private Integer inputType;

  @Comment("List of optional values, separated by commas")
  @Column(columnDefinition = "varchar(255) default ''")
  private String inputList;

  @Comment("0->No need to search, 1->Keyword search, 2->Range search ")
  @Column(columnDefinition = "int(1) default 0")
  private Integer searchType;

  @Comment("0-> Specification, 1-> Param")
  @Column(columnDefinition = "int(1) default 0")
  private Integer type;

  @ManyToMany private List<PmsCategory> categoryIds;

  @ManyToOne private PmsProdAttrGroup prodAttrGroupId;
}
