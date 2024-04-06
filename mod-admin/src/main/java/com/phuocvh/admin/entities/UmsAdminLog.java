package com.phuocvh.admin.entities;

import com.phuocvh.common.entities.BaseEntity;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UmsAdminLog extends BaseEntity {
  @Id private UUID id;
  private String ip;
  private String address;
  private String userAgent;

  @ManyToOne(fetch = FetchType.LAZY)
  private UmsAdmin umsAdminId;
}
