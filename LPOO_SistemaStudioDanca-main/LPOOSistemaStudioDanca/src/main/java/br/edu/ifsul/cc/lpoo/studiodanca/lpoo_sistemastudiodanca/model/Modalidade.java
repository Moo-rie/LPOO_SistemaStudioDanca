/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model;
import java.io.*;
import javax.persistence.*;
/**
 *
 * @author 20212PF.CC0006
 */
@Entity
public class Modalidade implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_modalidade", sequenceName = "seq_modalidade_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_modalidade", strategy = GenerationType.SEQUENCE) 
    Integer id;
    
    @Column(nullable = true, length = 200)
    String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
