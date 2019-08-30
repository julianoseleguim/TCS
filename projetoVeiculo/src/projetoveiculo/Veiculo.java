/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoveiculo;

/**
 *
 * @author aluno
 */
public abstract class Veiculo {
    protected String modelo;
    protected int ano;
    protected String cor;
    protected boolean status;
    protected float precoCombustivel;
    protected int nivelCombustivel;
    protected int capacidadeTanqueCombustiv;
    protected int velocidade;     
    
    void ligar(){
        if(this.status == true){
            System.out.println("Veículo já está ligado!");
        }else {
            this.status = true;                    
            System.out.println("Veículo ligado!");
        }
    }
    
    void desligar(){
        if(this.status == false){
            System.out.println("Veículo já está desligado!");
        } else {
            this.status = false;
            this.velocidade = 0;
            System.out.println("Veículo desligado!");
        }                          
    }
    
    void trocarPneu() throws InterruptedException{
        if(this.status == false){
            System.out.println("Trocando pneu..Aguarde");            
            Thread.sleep(3000);
            System.out.println("Pneu trocado!");
        } else {
            System.out.println("Desligue o veículo antes de trocar os pneus");
        }                   
    }
        
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(float precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    public int getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(int nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public int getCapacidadeTanqueCombustiv() {
        return capacidadeTanqueCombustiv;
    }

    public void setCapacidadeTanqueCombustiv(int capacidadeTanqueCombustiv) {
        this.capacidadeTanqueCombustiv = capacidadeTanqueCombustiv;
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
}
