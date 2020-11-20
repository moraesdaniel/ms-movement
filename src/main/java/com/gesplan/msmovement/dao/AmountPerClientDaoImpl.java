package com.gesplan.msmovement.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AmountPerClientDaoImpl implements AmountPerClientDao{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Object[]> reportAmountPerClient() {
        return em.createNativeQuery("select client_id, sum(total_value) as amount "+
                "from purchase group by client_id").getResultList();
    }
}
