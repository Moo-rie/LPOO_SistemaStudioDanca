/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model;

import java.util.*;
import java.io.*;
import javax.persistence.*;

/**
 *
 * @author 20212pf.cc0006
 */
@Entity
public class Pagamentos implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_pagamentos", sequenceName = "seq_pagamentos_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pagamentos", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataVcto;
    @Column(nullable = false)
    private Double valor;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataPgto;
    @Column(nullable = false)
    private Double valorPgto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataVcto() {
        return dataVcto;
    }

    public void setDataVcto(Calendar dataVcto) {
        this.dataVcto = dataVcto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Calendar getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Calendar dataPgto) {
        this.dataPgto = dataPgto;
    }

    public Double getValorPgto() {
        return valorPgto;
    }

    public void setValorPgto(Double valorPgto) {
        this.valorPgto = valorPgto;
    }

}
