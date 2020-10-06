package exercicio;
//Classe
public class Instrumento{

    //Atributos
    String nome;
    String marca;
    String cor;
    String material;
    String tipodesom;
    
    //Construtor

    public Instrumento(String nome, String marca, String cor, String material, String tipodesom) {
    	this.nome = nome;
    	this.marca = marca;
    	this.cor = cor;
    	this.material = material;
    	this.tipodesom = tipodesom;	
	}

	//Métodos de acesso do tipo getters e setters
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
            
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipodesom() {
		return tipodesom;
	}

	public void setTipodesom(String TS) {
		tipodesom = TS;
	}
	
	//Objetos
	
	public static void main(String[] args) {
	
	Instrumento [] Ins = new Instrumento [5];
	
	Ins[0]=new Instrumento("Violão", "Fender", "Preto", "Madeira", "Agudo");
	Ins[1]=new Instrumento("Bateria", "Yamaha", "Vermelho", "Indefinido", "Grave e Agudo");
	Ins[2]=new Instrumento("Flauta", "Yamaha", "Cinza", "Plástico", "Agudo");
	Ins[3]=new Instrumento("Guitarra", "Gibson", "Dourado", "Resina", "Agudo");
	Ins[4]=new Instrumento("Contrabaixo", "Fender", "Marron", "Resina", "Grave");
	
	for(int i = 0; i < 5; i++)
	{
		System.out.println("Instrumento"+"\t"+Ins[i].getNome()+"\t"+Ins[i].getMarca()+"\t"+Ins[i].getCor()+"\t"+Ins[i].getMaterial()+"\t"+Ins[i].getTipodesom());
		
	}
	}
}
