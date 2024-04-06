package com.phuocvh.admin.repositories;

import com.phuocvh.admin.entities.UmsAdmin;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsAdminRepository extends JpaRepository<UmsAdmin, UUID> {}
