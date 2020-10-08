package exercicio;
//Classe
public class Calçado{

    //Atributos
    String marca;
    String cor;
    int numero;
    String tipo;
    float valor;
    
    //Construtor

    public Calçado(String marca, String cor, int numero, String tipo, float valor) {
    	this.marca = marca;
    	this.cor = cor;
    	this.numero = numero;
    	this.tipo = tipo;
    	this.valor = valor;	
	}

	//Métodos de acesso do tipo getters e setters
    
	    public String getMarca() {
			return marca;
		}
	
		public void setMarca(String marca) {
			this.marca = marca;
		}
	
		public String getCor() {
			return cor;
		}
	
		public void setCor(String cor) {
			this.cor = cor;
		}
	
		public int getNumero() {
			return numero;
		}
	
		public void setNumero(int numero) {
			this.numero = numero;
		}
	
		public String getTipo() {
			return tipo;
		}
	
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	
		public float getValor() {
			return valor;
		}
	
		public void setValor(float valor) {
			this.valor = valor;
		}
	
	//Objetos
	
	public static void main(String[] args) {
	
	Calçado [] Cal = new Calçado [5];
	
	Cal[0]=new Calçado("Pampili", "Rosa", 28, "Sandália", (float) 69.90);
	Cal[1]=new Calçado("Pé com Pé", "Azul e Branco", 25, "Tênis", (float) 74.90);
	Cal[2]=new Calçado("Nyke", "Preto e Branco", 32, "Chinelo", (float) 89.90);
	Cal[3]=new Calçado("Adidas", "Marron", 23, "Tênis", (float) 99.90);
	Cal[4]=new Calçado("Havaianas", "Verde e Amarelo", 29, "Chinelo", (float) 29.90);
	
	for(int i = 0; i < 5; i++)
	{
		System.out.println("Calçado"+" - Marca: "+Cal[i].getMarca()+" - Cor: "+Cal[i].getCor()+" - Número: "+Cal[i].getNumero()+" - Tipo: "+Cal[i].getTipo()+" - Preço: R$"+Cal[i].getValor());
		
	}
	}

	
}
