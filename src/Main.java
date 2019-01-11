import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		int quantidadeL, nova_marcha;
		String saida;
		Carro c1 = new Carro();
		
		System.out.println("Digite o chassi do carro:");
	    String chassi = input.next();
	    System.out.println("Digite a marca do carro:");
        String marca  = input.next();
		System.out.println("Digite o modelo do carro:");
        String modelo  = input.next();
        System.out.println("Digite o tipo de combustivel do carro:");
        String tipoCombustivel  = input.next();
        System.out.println("Digite a capacidade do tanque do carro:");
        int capacidadeTanque  = input.nextInt();
        System.out.println("Digite a número de passageiros do carro:");
        int numPassageiro  = input.nextInt();
        System.out.println("Digite a velocidade máxima do carro:");
        float velocidadeMax  = input.nextFloat();
        
        c1.setChassi(chassi);
        c1.setMarca(marca);
        c1.setModelo(modelo);
        c1.setTipoCombustivel(tipoCombustivel);
        c1.setCapacidadeTanque(capacidadeTanque);
        c1.setNumPassageiro(numPassageiro);
        c1.setVelocidadeMax(velocidadeMax);
        
        do {

            //float velocidade = Carro.getVelocidadeAtual();
            System.out.println("Carro ligado? " + c1.isEstadoInicial());
            //System.out.println("Velocidade: " + velocidade);
            
            System.out.println("1-Ligar"+"\n"
            		+ "2-Desligar"+"\n"
            		+ "3-Acelerar"+"\n"
            		+ "4-Freiar"+"\n"
            		+ "5-Trocar Marcha"+"\n"
            		+ "6-Abastecer"+"\n"
            		+ "7-Ver Status");
            
            opcao = input.nextInt();
            
            

            switch (opcao) {
            	case 1:
            		c1.Ligar();
            		break;
                case 2:
                	c1.Desligar();
                    break;
                case 3:
                    c1.Acelerar();
                    break;
                case 4:
                    c1.Freiar();
                    break;
                case 5:
                	System.out.println("Digite a marcha que deseja colocar?");
                    nova_marcha = input.nextInt();
                	c1.Trocar_Marcha(nova_marcha);
                case 6:
                	System.out.println("Digite a quantidade que vai abastecer?");
                    quantidadeL = input.nextInt();
                    c1.Abastecer(quantidadeL);
                    break;
                case 7:
                	saida = c1.toString();
                	System.out.println(""+saida);
                	break;
            }

        } while (opcao!=0);
       
        
	  }
}
