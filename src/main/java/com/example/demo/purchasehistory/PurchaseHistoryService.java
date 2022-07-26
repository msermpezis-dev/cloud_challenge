package com.example.demo.purchasehistory;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author msermpezis-dev
 * @project demo
 */

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService {

    private final IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseHistoryService(IPurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchase_time(LocalDateTime.now());

        return purchaseHistoryRepository.save(purchaseHistory);
    }

    public Optional<PurchaseHistory> findPurchasedItemsOfUser(Long user_id){

        return purchaseHistoryRepository.findById(user_id);
    }
}
