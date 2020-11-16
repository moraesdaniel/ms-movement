package com.gesplan.msmovement.controller;

import com.gesplan.msmovement.domain.Purchase;
import com.gesplan.msmovement.dto.PurchaseDTO;
import com.gesplan.msmovement.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<Purchase> save(@RequestBody PurchaseDTO purchaseDTO) {
        Purchase purchase = purchaseService.save(purchaseDTO.buildBean());
        return new ResponseEntity<>(purchase, HttpStatus.CREATED);
    }
}
