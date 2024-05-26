/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myconpani.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author allan
 */
public class Controller {
    private static Controller instancia;
    
    private ArrayList<Cliente>listaCliente;
    private ArrayList<Livro>listaLivro;
    
    public static Controller getInstance(){
        if(instancia == null) {
            return instancia = new Controller();
        }else{
            return instancia;
        }
    }
    
    private Controller(){
        listaCliente = new ArrayList<>();
        listaLivro = new ArrayList<>();
        
    }
    
    public void salvarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }
    
    public ArrayList<Cliente> retornarCliente(){
        return listaCliente;
    }
    
    public void salvarLivro(Livro livro){
        listaLivro.add(livro);
    }
    
    public ArrayList<Livro> retornarLivro(){
        return listaLivro;
    }
}
