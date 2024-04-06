package com.phuocvh.product.entities;

import com.phuocvh.common.entities.BaseEntity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "pms_member_price")
public class PmsMemberPrice extends BaseEntity {
  @Id private Integer id;

  @OneToOne private PmsProduct productId;

  @Column(columnDefinition = "int default 0")
  private Integer memberLevelId;

  @Column(columnDefinition = "decimal(15,3) default 0")
  private BigDecimal memberPrice;

  @Column(columnDefinition = "varchar(64) default ''")
  private String memberLevelName;
}
