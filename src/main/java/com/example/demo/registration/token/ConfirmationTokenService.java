package com.example.demo.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 12:21 μ.μ. - 24/07/2022
 */

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final IConfirmationTokenRepository IConfirmationTokenRepository;

    public void saveConfirmationToken(ConfirmationToken token) {
        IConfirmationTokenRepository.save(token);
    }

    public Optional<ConfirmationToken> getToken(String token) {
        return IConfirmationTokenRepository.findByToken(token);
    }

    public int setConfirmedAt(String token) {
        return IConfirmationTokenRepository.updateConfirmedAt(
                token, LocalDateTime.now());
    }

}
