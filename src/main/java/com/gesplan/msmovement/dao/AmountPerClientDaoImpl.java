package com.gesplan.msmovement.dao;

import com.gesplan.msmovement.domain.AmountPerClient;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AmountPerClientDaoImpl implements AmountPerClientDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<AmountPerClient> reportAmountPerClient() {
        String query = "select client_id, sum(total_value) as amount from purchase group by client_id order by client_id";
        return em.createQuery(query, AmountPerClient.class).getResultList();
    }
}
