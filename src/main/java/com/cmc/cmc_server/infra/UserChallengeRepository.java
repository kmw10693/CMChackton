package com.cmc.cmc_server.infra;

import com.cmc.cmc_server.domain.Challenge;
import com.cmc.cmc_server.domain.User;
import com.cmc.cmc_server.domain.UserChallenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface UserChallengeRepository extends JpaRepository<UserChallenge, Long> {

    // user_id 동일 + challenge의 updatedAt > 지금-24시간 일 때
    @Query("select uc from UserChallenge uc where uc.user.id = :userId and uc.challenge.updateAt > :now")
    List<UserChallenge> findChallenges(Long userId, LocalDateTime now);

    @Query("select uc from UserChallenge uc where uc.challenge = :challenge and uc.nomination = false")
    List<UserChallenge> findByChallenge(Challenge challenge);

    @Modifying
    @Query("UPDATE UserChallenge uc set uc.nomination = True where uc.challenge.id = :challengeId and uc.user.id = :userId")
    void modifynom(Long challengeId, Long userId);

    List<UserChallenge> findAllByChallenge(Challenge challenge);

    List<UserChallenge> findAllByUser(User user);


}
