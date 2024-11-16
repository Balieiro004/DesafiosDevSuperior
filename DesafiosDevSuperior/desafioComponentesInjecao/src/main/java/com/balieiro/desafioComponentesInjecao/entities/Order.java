package com.balieiro.desafioComponentesInjecao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private Integer cod;
    private Double basic;
    private Double discount;
}
