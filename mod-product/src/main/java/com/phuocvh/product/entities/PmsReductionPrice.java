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
@Table(name = "pms_prod_reduction")
public class PmsReductionPrice extends BaseEntity {
  @Id private Integer id;

  @OneToOne private PmsProduct productId;

  @Column(columnDefinition = "decimal(15,3) default 0")
  private BigDecimal fullPrice;

  @Column(columnDefinition = "decimal(15,3) default 0")
  private BigDecimal reducePrice;
}
