package com.phuocvh.admin.repositories;

import com.phuocvh.admin.entities.UmsRole;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsRoleRepository extends JpaRepository<UmsRole, UUID> {}
