package com.gesplan.msmovement.service;

import com.gesplan.msmovement.dao.PurchaseDao;
import com.gesplan.msmovement.domain.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService{
    @Autowired
    private PurchaseDao purchaseDao;

    @Override
    public Purchase save(Purchase purchase) {
        return purchaseDao.save(purchase);
    }
}
