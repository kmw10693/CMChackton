package com.cmc.cmc_server.infra;

import com.cmc.cmc_server.domain.PostImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostImageRepository extends JpaRepository<PostImage, Long> {
}
