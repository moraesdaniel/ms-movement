package com.gesplan.msmovement.dto;

import com.gesplan.msmovement.domain.Client;
import com.gesplan.msmovement.domain.Purchase;
import lombok.Getter;

import java.util.Date;

@Getter
public class PurchaseDTO {
    private Client cliente;
    private Double valor;
    private Date data;
    private Double qtdItens;

    public Purchase buildBean() {
        return new Purchase(this.cliente.getId(), this.valor, this.data, this.qtdItens);
    }
}
