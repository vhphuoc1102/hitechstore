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
@Table(name = "pms_comment")
public class PmsComment extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  private Integer productId;

  @Column(columnDefinition = "varchar(64) default ''")
  private String memberNickName;

  @Column(columnDefinition = "varchar(64) default ''")
  private String productName;

  @Column(columnDefinition = "int(3) default 0")
  private Integer star;

  @Column(columnDefinition = "varchar(64) default ''")
  private String memberIp;

  @Column(columnDefinition = "int(1) default 0")
  private Integer showStatus;

  @Column(columnDefinition = "varchar(255) default ''")
  private String productAttribute;

  @Column(columnDefinition = "int default 0")
  private Integer readCount;

  @Column(columnDefinition = "text default ''")
  private String content;

  @Column(columnDefinition = "varchar(1000) default ''")
  private String pics;

  @Column(columnDefinition = "varchar(64) default ''")
  private String memberIcon;

  @Column(columnDefinition = "int default 0")
  private Integer replayCount;
}
