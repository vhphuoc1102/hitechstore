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
@Table(name = "pms_comment_reply")
public class PmsCommentReply extends BaseEntity {
  @Id private Integer id;

  @ManyToOne private PmsComment commentId;

  @Column(columnDefinition = "varchar(64) default ''")
  private String memberNickName;

  @Column(columnDefinition = "varchar(64) default ''")
  private String memberIcon;

  @Column(columnDefinition = "text default ''")
  private String content;

  @Column(columnDefinition = "int(1) default 0")
  private Integer type;
}
