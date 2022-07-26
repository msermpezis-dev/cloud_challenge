package com.example.demo.purchasehistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @author msermpezis-dev
 * @project demo
 */

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long> {

    @Override
    Optional<PurchaseHistory> findById(Long id);
}
