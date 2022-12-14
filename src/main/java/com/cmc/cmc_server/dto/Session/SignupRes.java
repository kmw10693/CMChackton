package com.cmc.cmc_server.dto.Session;

import com.cmc.cmc_server.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignupRes {
    private String userId;
    private String email;
    private String nickname;
    private String proImg;

    public static SignupRes toSignupRes(User user) {
        return SignupRes.builder()
                .email(user.getEmail())
                .nickname(user.getNickname())
                .proImg(user.getImageUrl())
                .build();
    }

}
