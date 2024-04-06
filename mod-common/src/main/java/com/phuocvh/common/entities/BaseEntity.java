package com.phuocvh.common.entities;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
public class BaseEntity {
  @CreationTimestamp private Instant createTs;
  @UpdateTimestamp private Instant updateTs;

  private Integer registId;

  private Integer updateId;

  public void prePersist(Integer userId) {
    this.registId = userId;
    this.updateId = userId;
    this.createTs = Instant.now();
    this.updateTs = Instant.now();
  }

  public void preUpdate() {}
}
