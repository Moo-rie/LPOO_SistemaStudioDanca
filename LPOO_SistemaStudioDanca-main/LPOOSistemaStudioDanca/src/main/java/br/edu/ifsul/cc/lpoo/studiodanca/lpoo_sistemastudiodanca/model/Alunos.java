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
//@Entity
public class Alunos extends Pessoas {
    
  private Calendar dataInicio;
  private Integer dataPgto;

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Integer getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Integer dataPgto) {
        this.dataPgto = dataPgto;
    }
    
}