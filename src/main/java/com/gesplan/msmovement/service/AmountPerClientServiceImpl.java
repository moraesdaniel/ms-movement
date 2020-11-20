package com.gesplan.msmovement.service;

import com.gesplan.msmovement.dao.AmountPerClientDao;
import com.gesplan.msmovement.domain.AmountPerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AmountPerClientServiceImpl implements AmountPerClientService {
    @Autowired
    private AmountPerClientDao amountPerClientDao;

    @Override
    public List<AmountPerClient> reportAmountPerClient() {
        List<Object[]> resultQuery = amountPerClientDao.reportAmountPerClient();

        List<AmountPerClient> ampList = new ArrayList<AmountPerClient>();
        if (resultQuery != null) {
            for(Object[] registry : resultQuery) {
                AmountPerClient amp = new AmountPerClient(Long.parseLong(registry[0].toString()),
                        Double.parseDouble(registry[1].toString()));
                ampList.add(amp);
            }
        }
        return ampList;
    }
}
