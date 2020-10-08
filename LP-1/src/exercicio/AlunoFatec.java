package exercicio;
//Classe
public class AlunoFatec {

    //Atributos
    String nome;
    String curso;
    int RA;
    String materia;
    float nota;
    
    //Construtor
    public AlunoFatec(String nome, String curso, int RA, String mat, float nota){
        this.nome = nome;
        this.curso = curso;
        this.RA = RA;
        materia = mat;
        this.nota = nota;
    }
    
    //Métodos de acesso do tipo getters e setters
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
            
    public String getCurso() {
		return curso;
	}

	public void setCurso(String curso){
		this.curso = curso;
	}
	
	public int getRA(){
		return RA;
	}

	public void setRA(int RA) {
		this.RA = RA;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	//Objetos
	
		public static void main(String[] args) {
		
		AlunoFatec [] Alf = new AlunoFatec [5];
		
		Alf[0]=new AlunoFatec("Rangel", "Banco de Dados", 138625, "LP1", (float) 8.0);
		Alf[1]=new AlunoFatec("Marcelo", "Banco de Dados", 1378568, "LAB", 10);
		Alf[2]=new AlunoFatec("Carlos", "ADS", 135886, "Matemática Discreta", 8);
		Alf[3]=new AlunoFatec("Helen", "Banco de Dados", 125635, "Engenharia de Software", 9);
		Alf[4]=new AlunoFatec("Arnaldo", "ADS", 125412, "Arquitetura e Modelagem BD", 7);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("AlunoFatec"+" - Nome: "+Alf[i].getNome()+" - Curso: "+Alf[i].getCurso()+" - RA: "+Alf[i].getRA()+" - Matéria: "+Alf[i].getMateria()+" - Nota: "+Alf[i].getNota());
			
		}
		}
	
}
