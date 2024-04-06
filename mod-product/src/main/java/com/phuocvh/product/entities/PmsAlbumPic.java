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
@Table(name = "pms_album_pic")
public class PmsAlbumPic extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  @Column(columnDefinition = "varchar(1000) default ''")
  private String pic;

  @ManyToOne private PmsAlbum albumId;
}
