package com.gesplan.msmovement.controller;

import com.gesplan.msmovement.domain.AmountPerClient;
import com.gesplan.msmovement.service.AmountPerClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class AmountPerClientController {
    @Autowired
    private AmountPerClientService amountPerClientService;

    @GetMapping
    public List<AmountPerClient> reportAmountPerClient() {
        List<AmountPerClient> result = amountPerClientService.reportAmountPerClient();
        return result;
    }
}
