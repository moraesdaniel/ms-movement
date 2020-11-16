package com.gesplan.msmovement.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchase")
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
    private Long clientId;

    @Column(name = "total_value", nullable = false)
    private Double totalValue;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "qtd_items", nullable = false)
    private Double qtdItems;

    public Purchase(Long clientId, Double totalValue, Date date, Double qtdItems) {
        this.clientId = clientId;
        this.totalValue = totalValue;
        this.date = date;
        this.qtdItems = qtdItems;
    }
}
