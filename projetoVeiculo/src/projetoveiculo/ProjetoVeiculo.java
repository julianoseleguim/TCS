/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoveiculo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ProjetoVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {                        
        Carro carro = null;                
        Moto moto = null;
        Caminhao caminhao = null;
        int opcaoVeiculo;
        int funcao;
        
        do {
            System.out.println("Escolha as opções: 1.Carro 2.Moto 3.Caminhão 4.Sair");
            Scanner ler = new Scanner(System.in);       
            opcaoVeiculo = ler.nextInt();            
            switch (opcaoVeiculo){
                case 1:                    
                    carro = new Carro();                     
                    do {                        
                        System.out.println("Escolha a função do carro: 1.Ligar 2.Desligar 3.Acelerar 4.Frear 5.Nivel combustivel 6.Abastecer 7.Trocar Pneus 8.Mostrar info 9.Sair");
                        Scanner fun = new Scanner(System.in);
                        funcao = fun.nextInt();                        
                        switch (funcao){
                            case 1: 
                                carro.ligar();
                                break;
                            case 2:
                                carro.desligar();
                                break;
                            case 3: 
                                carro.acelerar();
                                break;
                            case 4:
                                carro.frear();
                                break;
                            case 5:
                                System.out.println("O nivel de combustivel: "+carro.getNivelCombustivel() +"L");
                                break;
                            case 6:
                                carro.abastecer();
                                break;
                            case 7:
                                carro.trocarPneu();
                                break;    
                            case 8:
                                carro.mostrarInfo();
                                break;
                        }
                    }while (funcao != 9);
                    break;
                case 2:
                    moto = new Moto();                     
                    do {                        
                        System.out.println("Escolha a função da moto: 1.Ligar 2.Desligar 3.Acelerar 4.Frear 5.Nivel combustivel 6.Abastecer 7.Trocar Pneus 8.Mostrar info 9.Sair");
                        Scanner fun = new Scanner(System.in);
                        funcao = fun.nextInt();                        
                        switch (funcao){
                            case 1: 
                                moto.ligar();
                                break;
                            case 2:
                                moto.desligar();
                                break;
                            case 3: 
                                moto.acelerar();
                                break;
                            case 4:
                                moto.frear();
                                break;
                            case 5:
                                System.out.println("O nivel de combustivel: "+moto.getNivelCombustivel() +"L");
                                break;
                            case 6:
                                moto.abastecer();
                                break;
                            case 7:
                                moto.trocarPneu();
                                break;  
                            case 8:
                                moto.mostrarInfo();
                                break;
                        }
                    }while (funcao != 9);
                    break;                    
                case 3: 
                    caminhao = new Caminhao();                     
                    do {                        
                        System.out.println("Escolha a função do caminhão: 1.Ligar 2.Desligar 3.Acelerar 4.Frear 5.Nivel combustivel 6.Abastecer 7.Trocar Pneus 8. Mostrar info 9.Sair");
                        Scanner fun = new Scanner(System.in);
                        funcao = fun.nextInt();                        
                        switch (funcao){
                            case 1: 
                                caminhao.ligar();
                                break;
                            case 2:
                                caminhao.desligar();
                                break;
                            case 3: 
                                caminhao.acelerar();
                                break;
                            case 4:
                                caminhao.frear();
                                break;
                            case 5:
                                System.out.println("O nivel de combustivel: "+caminhao.getNivelCombustivel() +"L");
                                break;
                            case 6:
                                caminhao.abastecer();
                                break;
                            case 7:
                                caminhao.trocarPneu();
                                break;
                            case 8:
                                caminhao.mostrarInfo();
                                break;
                        }
                    }while (funcao != 9);
                    break;                                        
            }        
        } while(opcaoVeiculo !=4);                       
    }    
}
