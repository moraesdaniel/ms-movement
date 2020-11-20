package com.gesplan.msmovement.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Purchase")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "client_id", nullable = false)
    private Long client_id;

    @Column(name = "total_value", nullable = false)
    private Double total_value;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "qtd_items", nullable = false)
    private Double qtd_items;

    public Purchase(Long clientId, Double totalValue, Date date, Double qtdItems) {
        this.client_id = clientId;
        this.total_value = totalValue;
        this.date = date;
        this.qtd_items = qtdItems;
    }
}
