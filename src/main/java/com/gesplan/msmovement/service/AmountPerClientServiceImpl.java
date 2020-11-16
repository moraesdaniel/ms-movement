package com.gesplan.msmovement.service;

import com.gesplan.msmovement.dao.AmountPerClientDao;
import com.gesplan.msmovement.domain.AmountPerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmountPerClientServiceImpl implements AmountPerClientService {

    @Autowired
    private AmountPerClientDao amountPerClientDao;

    @Override
    public List<AmountPerClient> reportAmountPerClient() {
        return amountPerClientDao.reportAmountPerClient();
    }
}
