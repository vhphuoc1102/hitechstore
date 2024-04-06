package com.phuocvh.admin.entities;

import com.phuocvh.common.entities.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UmsRole extends BaseEntity {
  @Id private UUID id;
  private String name;
  private String description;
}
