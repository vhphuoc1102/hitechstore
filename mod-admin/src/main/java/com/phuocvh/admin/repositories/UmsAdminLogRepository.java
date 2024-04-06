package com.phuocvh.admin.repositories;

import com.phuocvh.admin.entities.UmsAdminLog;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsAdminLogRepository extends JpaRepository<UmsAdminLog, UUID> {}
