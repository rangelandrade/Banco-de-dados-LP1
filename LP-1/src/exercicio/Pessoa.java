package exercicio;
//Classe
public class Pessoa {

    //Atributos
    String nome;
    String sexo;
    float altura;
    float massa;
    String hobby;
    
    //Construtor
    public Pessoa(String nome, String sexo, float altura, float massa, String hobby){
        this.nome = nome;
        this.sexo = sexo;
        this.altura= altura;
        this.massa = massa;
        this.hobby = hobby;
    }
    
    //Métodos de acesso do tipo getters e setters
    	
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getSexo() {
			return sexo;
		}
		
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		public float getAltura() {
			return altura;
		}
		
		public void setAltura(float altura) {
			this.altura = altura;
		}
		
		public float getMassa() {
			return massa;
		}
		
		public void setMassa(float massa) {
			this.massa = massa;
		}
		
		public String getHobby() {
			return hobby;
		}
		
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
    
    
	//Objetos
	
		public static void main(String[] args) {
		
		Pessoa [] Pes = new Pessoa [5];
		
		Pes[0]=new Pessoa("Rangel", "Masculino", (float) 1.70, (float) 75.2, "automobilismo");
		Pes[1]=new Pessoa("Carolina", "Feminino", (float) 1.64, (float) 60.5, "Dançar");
		Pes[2]=new Pessoa("Valentina", "Feminino", (float) 1.01, (float) 16.5, "Patinar");
		Pes[3]=new Pessoa("Renê", "Masculino", (float) 1.78, (float) 80.5, "Aviação");
		Pes[4]=new Pessoa("Renata", "Feminino", (float) 1.66, (float) 72.5, "Dançar");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Pessoa"+" - Nome: "+Pes[i].getNome()+" - Sexo: "+Pes[i].getSexo()+" - Altura: "+Pes[i].getAltura()+" - Peso: "+Pes[i].getMassa()+"Kg"+" - Hobby: "+Pes[i].getHobby());
			
		}
		}
}
