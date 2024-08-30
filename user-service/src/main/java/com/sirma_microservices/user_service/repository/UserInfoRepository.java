package com.sirma_microservices.user_service.repository;

import com.sirma_microservices.user_service.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
