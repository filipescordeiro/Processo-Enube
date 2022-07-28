/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeenube.MODEL;

/**
 *
 * @author Compaq
 */
public class Filmes {
    private int Id;
    private String Filme="";
    private String Genero="";
    private String Valor;
    private String Classificacao =""; 
    private String Sinopose = "";

    public Filmes() {
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public String getSinopose() {
        return Sinopose;
    }

    public void setSinopose(String Sinopose) {
        this.Sinopose = Sinopose;
    }

    
    public String getFilme() {
        return Filme;
    }

    public String getGenero() {
        return Genero;
    }

    public String getValor() {
        return Valor;
    }

 

    public String getClassificacao() {
        return Classificacao;
    }

    public void setFilme(String Filme) {
        this.Filme = Filme;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

   

    public void setClassificacao(String Classificacao) {
        this.Classificacao = Classificacao;
    }
    
    

}
