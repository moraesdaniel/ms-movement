package com.gesplan.msmovement.dao;

import com.gesplan.msmovement.domain.Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseDao extends CrudRepository<Purchase, Long> {
}
