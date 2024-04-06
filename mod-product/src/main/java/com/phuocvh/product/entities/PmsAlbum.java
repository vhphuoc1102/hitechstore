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
@Table(name = "pms_album")
public class PmsAlbum extends BaseEntity {
  @Id private Integer id;

  @Column(columnDefinition = "varchar(64) default ''")
  private String name;

  @Column(columnDefinition = "varchar(1000) default ''")
  private String coverPic;

  @Column(columnDefinition = "int default 0")
  private Integer picCount;

  @Column(columnDefinition = "varchar(1000) default ''")
  private String description;
}
