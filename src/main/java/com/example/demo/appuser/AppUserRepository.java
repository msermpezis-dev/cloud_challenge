package com.example.demo.appuser;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author msermpezis-dev
 * @project demo
 * @created 12:08 π.μ. - 24/07/2022
 */
@Repository
@Transactional(readOnly = true)
public interface AppUserRepository {

    Optional<AppUser> findByEmail(String email);
}
