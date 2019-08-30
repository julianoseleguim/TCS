/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoveiculo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Carro extends Veiculo implements IVeiculo{
    private int qtdePorta;    

    Carro() {
        this.modelo = "Corsa";
        this.cor = "Branco";
        this.ano = 2010;                
        this.qtdePorta = 4;
        this.capacidadeTanqueCombustiv = 40;
        this.nivelCombustivel = 40;
        this.status = false;                
        this.velocidade = 0;  
        this.precoCombustivel = (float) 3.00d;
    }
            
    @Override
    public void abastecer() {
        if(this.status == false){
            float valorGasto = 0;
            int nivelAtual = this.nivelCombustivel;
            for(int i=this.nivelCombustivel; i<=this.capacidadeTanqueCombustiv; i++){
                //this.nivelCombustivel = i;            
                this.setNivelCombustivel(i);
                valorGasto = (this.capacidadeTanqueCombustiv - nivelAtual)*this.precoCombustivel;
            }
            try {
                System.out.println("Veículo abastecendo..");
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Veiculo abastecido: " + (this.nivelCombustivel - nivelAtual) + "L" + " Valor total R$ " + valorGasto);
        }else {
            System.out.println("Desligue o Veículo para abastecer!");
        }             
    }

    @Override
    public void acelerar() {       
        if(this.status == true){            
            this.velocidade = this.velocidade + 20; 
            System.out.println(this.velocidade + " km/h");
            atualizaNivelCombustivel();
            if (this.velocidade == 120){
                System.out.println("Carro chegou na velocidade máxima!");                
            }
        }
    }

    @Override
    
    public void mostrarInfo() {
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.ano);
        System.out.println(this.qtdePorta);
        System.out.println(this.capacidadeTanqueCombustiv);
        System.out.println(this.nivelCombustivel);
        System.out.println(this.status);                        
    }

    @Override
    public void atualizaNivelCombustivel() {
        this.nivelCombustivel = this.nivelCombustivel - 10;
        if((this.nivelCombustivel <= 10) && (this.nivelCombustivel > 0)){
            System.out.println("Combustível na reserva! recomenda-se abastecer.");
        }else if (this.nivelCombustivel == 0){
            System.out.println("Sem Combustível..Carro desligado!");
            this.status = false;               
        }
    }

    @Override
    public void frear() {
        if(this.status == true){            
            this.velocidade = this.velocidade - 20;
            System.out.println(this.velocidade + " km/h");
            //atualizaNivelCombustivel();
            if (this.velocidade == 0){
                System.out.println("Carro parou!");                
            }
        }
    }
    
}
