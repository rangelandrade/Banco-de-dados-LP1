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
    public Profissional(String c, String nome){
        cargo = c;
        this.nome = nome;
    }
    
    //Métodos de acesso do tipo getters e setters
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
     public static void main(String []args){
         // Objeto
         Profissional P=new Profissional("Programador", "Rangel");
         P.setDepartamento("Engenharia");
         // Fim teste         
     }
}
