public class Carro {
  
  private boolean estadoInicial=false;
  private String chassi;
  private String marca;
  private String modelo;
  private String tipoCombustivel; //Tipo de Combustivel:(Diesel, alcool ou gasolina)
  private int numPassageiro;  
  private float velocidadeMax;
  private int cambio;
  private float capacidadeTanque;
  
  //Variaveis calculadas
  private static float nivelCombustivel = 0;
  private static float velocidadeAtual = 0;
 
  public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public int getNumPassageiro() {
		return numPassageiro;
	}

	public void setNumPassageiro(int numPassageiro) {
		this.numPassageiro = numPassageiro;
	}

	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public static float getNivelCombustivel() {
		return nivelCombustivel;
	}

	public static void setNivelCombustivel(float nivelCombustivel) {
		Carro.nivelCombustivel = nivelCombustivel;
	}

	public boolean isEstadoInicial() {
		return estadoInicial;
	}

	public float getVelocidadeMax() {
		return velocidadeMax;
	}
	
	public void setVelocidadeMax(float velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public int getCambio() {
		return cambio;
	}

	public static float getVelocidadeAtual() {
		return velocidadeAtual;
	}
  
   public void Ligar() {
     if(this.estadoInicial == true) {
       System.out.println("O veiculo já está ligado");
     }
       
     else {
       System.out.println("Ligando o veiculo...");
       this.estadoInicial = true;
     }
   }
  
   public void Desligar() {
     if(this.estadoInicial==false) {
       System.out.println("O veiculo já está desligado");
     }
     
     else {
           System.out.println("Desligando o veiculo...");
           this.estadoInicial = false;
       }

   }
  
   public void Acelerar() {
     if((this.estadoInicial == true) && (this.velocidadeAtual<this.velocidadeMax)&&(nivelCombustivel>0)) {
       System.out.println("Acelerando o veiculo...");
           this.velocidadeAtual += 10;
           this.nivelCombustivel -= 5;

     }
     else {
       System.out.println("O carro deve estar ligado, sua velocidade não pode ser maior que a Máxima e possuir combustivel");
     }
     
     
   }
  
   public void Freiar() {
     if (this.velocidadeAtual == 0) {
       this.velocidadeAtual = 0;
       System.out.println("O veiculo já se encontra parado");
     }
     else {
       System.out.println("Você pisou no freio...");
       this.velocidadeAtual -= 10;
       
     }
     
   }
  
   public void Trocar_Marcha(int nova_marcha) {
       if((nova_marcha<0)||(nova_marcha>5)){
         System.out.println("Marcha inválida. Operação não foi concluida!");
       }   
       else {
           this.cambio= nova_marcha;
       }       
   }

   public void Abastecer(int quantidadeL) {
     
     this.nivelCombustivel += quantidadeL;
     
     if(quantidadeL>this.capacidadeTanque) {
       System.out.println("Quantidade maior que a capacidade do tanque");
       this.nivelCombustivel = nivelCombustivel - quantidadeL;
           System.out.println("Capacidade Máxima:" + this.capacidadeTanque +  "litros");
     }   
       if(this.nivelCombustivel>this.capacidadeTanque) {
         System.out.println("O tanque está cheio!");
           this.nivelCombustivel = this.nivelCombustivel - quantidadeL;
           System.out.println("Nível do combustivel:" + this.nivelCombustivel + "litros");
         
       }   
   }
   public String toString() {
		String saida="Estado Inicial:"+this.estadoInicial+"\n"+
	           "Chassi:"+this.chassi+"\n"+
			   "Marca:"+this.marca+"\n"+
	           "Modelo:"+this.modelo+"\n"+
			   "Tipo Combustivel:"+this.tipoCombustivel+"\n"+
	           "Numero de Passageiro:"+this.numPassageiro+"\n"+
			   "Velocidade Máxima:"+this.velocidadeMax+"\n"+
	           "Cambio:"+this.cambio+"\n"+
			   "Capacidade do Tanque:"+this.capacidadeTanque+"\n"+
	           "Nível do Combustivel:"+this.nivelCombustivel+"\n"+
			   "Velocidade Atual:"+this.velocidadeMax+"\n";
		return saida;
   }
}
   

