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
@Table(name = "pms_brand")
public class PmsBrand extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  @Column(columnDefinition = "varchar(64) default ''")
  private String name;

  @Column(columnDefinition = "varchar(8) default ''")
  private String firstLetter;

  @Column(columnDefinition = "int(1) default 0")
  private Integer showStatus;

  @Column(columnDefinition = "int default 0")
  private Integer productCount;

  @Column(columnDefinition = "int default 0")
  private Integer productCommentCount;

  @Column(columnDefinition = "varchar(255) default ''")
  private String logo;

  @Column(columnDefinition = "varchar(255) default ''")
  private String bigPic;

  @Column(columnDefinition = "text default ''")
  private String brandStory;
}
