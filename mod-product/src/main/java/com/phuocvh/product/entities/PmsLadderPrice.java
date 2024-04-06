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
@Table(name = "pms_prod_ladder")
public class PmsLadderPrice extends BaseEntity {
  @Id private Integer id;

  @OneToOne private PmsProduct productId;

  @Column(columnDefinition = "int default 0")
  private Integer count;

  @Column(columnDefinition = "decimal(10,2) default 0")
  private BigDecimal discount;

  @Column(columnDefinition = "decimal(15,3) default 0")
  private BigDecimal price;
}
