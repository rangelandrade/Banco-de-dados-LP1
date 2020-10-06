package exercicio;
//Classe
public class Profissional {

    //Atributos
    String nome;
    String departamento;
    int ID;
    float salario;
    String cargo;
    
    //Construtor
    public Profissional(String nome, String depto, int ID, float sal, String c){
        this.nome = nome;
        departamento = depto;
        this.ID = ID;
        salario = sal;
        cargo = c;
    }
    
    //Métodos de acesso do tipo getters e setters
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
            
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	//Objetos
	
		public static void main(String[] args) {
		
		Profissional [] Pro = new Profissional [5];
		
		Pro[0]=new Profissional("Rangel", "Machine Build", 420, 2000, "Técnico Automação");
		Pro[1]=new Profissional("Carolina", "RH", 806, 2000, "Secretária");
		Pro[2]=new Profissional("Marcelo", "Compras", 201, 1500, "Comprador Sr.");
		Pro[3]=new Profissional("Carlos", "Engenharia", 187, 5000, "Engenheiro de Produto");
		Pro[4]=new Profissional("Marcos", "Machine Build", 722, 4500, "Coordenador");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Profissional"+" - Nome: "+Pro[i].getNome()+" - Departamento: "+Pro[i].getDepartamento()+" - ID: "+Pro[i].getID()+" - Salário R$: "+Pro[i].getSalario()+" - Cargo: "+Pro[i].getCargo());
			
		}
		}
	
}
