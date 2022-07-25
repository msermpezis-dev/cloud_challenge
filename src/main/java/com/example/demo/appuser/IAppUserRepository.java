package com.example.demo.appuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
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
public interface IAppUserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE AppUser a " +
            "SET a.enabled = TRUE WHERE a.email = ?1")
    int enableAppUser(String email);

    @Transactional
    @Query("SELECT id " +
            "FROM AppUser " +
            "WHERE email = ?1")
    int getAppUserIdByEmail(String email);

}
