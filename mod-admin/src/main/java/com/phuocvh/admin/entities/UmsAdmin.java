package com.phuocvh.admin.entities;

import com.phuocvh.common.entities.BaseEntity;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UmsAdmin extends BaseEntity {
  // Essential information
  @Id private UUID id;
  private String username;
  private String password;
  private String icon;
  private String email;
  private String nickname;
  private Integer status;
  private String note;
  private Instant loginTime;

  // Basic optional information
  private String phone;
  private Integer gender;
  private Instant birthday;
  private String address;

  @OneToMany(mappedBy = "umsAdminId", cascade = CascadeType.ALL)
  private List<UmsAdminLog> umsAdminLogIds;
}
