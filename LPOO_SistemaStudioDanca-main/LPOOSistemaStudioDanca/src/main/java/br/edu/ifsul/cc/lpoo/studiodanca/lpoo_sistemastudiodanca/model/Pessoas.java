/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model;

/**
 *
 * @author 20212pf.cc0006
 */
@Entity
public class Pessoas implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_pessoas", sequenceName = "seq_pessoas_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pessoas", strategy = GenerationType.SEQUENCE) 
    Integer id;
    String nome;
    String fone;
    Calendar dataAniver;
    String email;
    String endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Calendar getDataAniver() {
        return dataAniver;
    }

    public void setDataAniver(Calendar dataAniver) {
        this.dataAniver = dataAniver;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}