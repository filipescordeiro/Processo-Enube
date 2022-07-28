/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeenube.DAO;

import com.mycompany.testeenube.MODEL.Filmes;
import com.mycompany.testeenube.VIEW.Cadastrar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Compaq
 */
public class FilmesDAO {
 
     public static String url="jdbc:mysql://localhost:3306/lojadefilmes";
     public static String login ="root";
     public static String senha ="Filipe@56";
    
    
    // Metodo de salvar no banco
    
     public static boolean salvar (String Filme,String Genero,String Classificacao,String Valor,String Sinopese ){
        
      boolean retorno = false;
        Connection conexao;
        
        
        try {
            // 1º passo - informar qual o driver devemos usar

            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2º passo - Utilizar o DriverManager para criar um objeto de conexação
            
           conexao = DriverManager.getConnection(url, login, senha);
            
           // 3º passo - Criar um objeto Statement
             PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Filmes"
                     + " (Filme,Valor,Genero,Classificacao,Sinopese) values (?,?,?,?,?)");

                         
            comandoSQL.setString(1,Filme);
            comandoSQL.setString(2, Valor);
            comandoSQL.setString(3, Genero);
            comandoSQL.setString(4, Classificacao);
            comandoSQL.setString(5, Sinopese);
                       
           // 4 º passo - executar o comando SQL

            int linhasAfetadas = comandoSQL.executeUpdate();
            
           if(linhasAfetadas>0){
           retorno = true;
        
           System.out.println("CADASTRO REALIZADO COM SUCESSO");           
           }
           else{
               retorno = false;
               throw new Exception("NÃO FOI POSSIVEL INSERIR NOVO FILME");
           
           }
           
        } catch (ClassNotFoundException ex) {
           
             System.out.println("ERRO: "+ex.getMessage());
                       retorno = false;

        } 
        catch (Exception ex) {
             System.out.println("ERRO: "+ex.getMessage());
                            retorno = false;

        }
        return retorno;
      
    }
    //metodo que gera lista geral 
      public static ArrayList<Filmes>listarFilmes(){
        
         Connection conexao = null;
         ResultSet rs = null;
         ArrayList<Filmes>listaRetorno = new ArrayList<Filmes>();
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement sql = conexao.prepareStatement("select * from Filmes where Filme like'%' ");
            
          rs =  sql.executeQuery();
            
            while(rs.next()){
                
                Filmes objFilmes = new Filmes();
                objFilmes.setFilme(rs.getString("Filme"));
                objFilmes.setClassificacao(rs.getString("Classificacao"));
                objFilmes.setValor(rs.getString("Valor"));
                objFilmes.setGenero(rs.getString("Genero"));
                objFilmes.setSinopose(rs.getString("Sinopese"));
                objFilmes.setId(rs.getInt("Idfilme"));
                listaRetorno.add(objFilmes);
            }
            
        } catch(Exception e){
            
        }finally{
            
            try{
                if(rs!=null){
                
                rs.close();
            }if(conexao!=null){
                
             
                conexao.close();
            }
            }catch(Exception e){
                
            }
            
                
       
            }
        
        return listaRetorno;
    }    
// metodo que busca por genero
        public static ArrayList<Filmes>BuscarFilmes(String Genero){
        
                    Connection conexao = null;
         ResultSet rs = null;
                    ArrayList<Filmes>listaRetorno = new ArrayList<Filmes>();
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement sql = conexao.prepareStatement("select * from Filmes where Genero like ? ");
            
            sql.setString(1,"%"+Genero+"%");
                    
          rs =  sql.executeQuery();
            
            while(rs.next()){
                
                Filmes objFilmes = new Filmes();
                objFilmes.setFilme(rs.getString("Filme"));
                objFilmes.setGenero(rs.getString("Genero"));
                objFilmes.setClassificacao(rs.getString("Classificacao"));
                objFilmes.setValor(rs.getString("Valor"));
               objFilmes.setSinopose(rs.getString("Sinopose"));
                listaRetorno.add(objFilmes);
            }
            
        } catch(Exception e){
            
        }finally{
            
            try{
                if(rs!=null){
                
                rs.close();
            }if(conexao!=null){
                
             
                conexao.close();
            }
            }catch(Exception e){
                
            }
            
                
       
            }
        
        return listaRetorno;
    }
// Metodo que busca por filme
        public static ArrayList<Filmes>BuscarFilme(String Filme){
        
                    Connection conexao = null;
         ResultSet rs = null;
                    ArrayList<Filmes>listaRetorno = new ArrayList<Filmes>();
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement sql = conexao.prepareStatement("select * from Filmes where Filme like ? ");
            
            sql.setString(1,"%"+Filme+"%");
                    
          rs =  sql.executeQuery();
            
            while(rs.next()){
                
                 Filmes objFilmes = new Filmes();
                objFilmes.setFilme(rs.getString("Filme"));
                objFilmes.setClassificacao(rs.getString("Classificacao"));
                objFilmes.setValor(rs.getString("Valor"));
                objFilmes.setGenero(rs.getString("Genero"));
                objFilmes.setSinopose(rs.getString("Sinopese"));
                objFilmes.setId(rs.getInt("Idfilme"));
                listaRetorno.add(objFilmes);
            }
            
        } catch(Exception e){
            
        }finally{
            
            try{
                if(rs!=null){
                
                rs.close();
            }if(conexao!=null){
                
             
                conexao.close();
            }
            }catch(Exception e){
                
            }
            
                
       
            }
        
        return listaRetorno;
    }

         public static boolean AlterarFilme(String Filme,String Valor,String Genero,String Classificacao,String Sinopese,int Id){
     
        
      boolean retorno = false;
        Connection conexao;
        
        
        try {
            // 1º passo - informar qual o driver devemos usar

            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2º passo - Utilizar o DriverManager para criar um objeto de conexação
            
           conexao = DriverManager.getConnection(url, login, senha);
            
           // 3º passo - Criar um objeto Statement
             PreparedStatement comandoSQL = conexao.prepareStatement("update Filmes set Filme = ? , Valor = ? ,Genero = ? ,Classificacao = ? , Sinopese = ? where Idfilme = ? ");

                         
            comandoSQL.setString(1,Filme);
            comandoSQL.setString(2,Valor);
            comandoSQL.setString(3, Genero);
            comandoSQL.setString(4, Classificacao);
            comandoSQL.setString(5, Sinopese);
            comandoSQL.setInt(6,Id);
            
                        
           // 4 º passo - executar o comando SQL

            int linhasAfetadas = comandoSQL.executeUpdate();
            
           if(linhasAfetadas>0){
           retorno = true;
        
           System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO");           
           }
           else{
               retorno = false;
               throw new Exception("NÃO FOI POSSIVEL ALTERA DADOS");
           
           }
           
        } catch (ClassNotFoundException ex) {
           
             System.out.println("ERRO: "+ex.getMessage());
                       retorno = false;

        } 
        catch (Exception ex) {
             System.out.println("ERRO: "+ex.getMessage());
                            retorno = false;

        }
        return retorno;
    }      
    
        
}
