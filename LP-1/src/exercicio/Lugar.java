package exercicio;
//Classe
public class Lugar {

    //Atributos
    String País;
    String Capital;
    String Continente;
    String Pontoturistico;
    String Moeda;
    
    //Construtor
    public Lugar(String país, String capital, String continente, String pt, String moeda){
        País = país;
        Capital = capital;
        Continente = continente;
        Pontoturistico = pt;
        Moeda = moeda;
    }
    
    //Métodos de acesso do tipo getters e setters
    
    public String getPaís(){
        return País;
    }
    
    public void setPaís(String país){
        País = país;
    }
            
    public String getCapital() {
		return Capital;
	}

	public void setCapital(String capital){
		Capital = capital;
	}
	
	public String getContinente(){
		return Continente;
	}

	public void setContinente(String continente) {
		Continente = continente;
	}

	public String getPontoturistico() {
		return Pontoturistico;
	}
	public void setPontoturistico(String pt) {
		Pontoturistico = pt;
	}

	public String getMoeda() {
		return Moeda;
	}

	public void setMoeda(String moeda) {
		Moeda = moeda;
	}
	
	//Objetos
	
		public static void main(String[] args) {
		
		Lugar [] Lug = new Lugar [5];
		
		Lug[0]=new Lugar("Grécia", "Atenas", "Europa", "Acrópole de Atenas", "Euro");
		Lug[1]=new Lugar("Brasil", "Brasília", "América do Sul", "Cristo Redentor", "Real");
		Lug[2]=new Lugar("Estados Unidos", "Washington", "América do Norte", "Central Park", "Dólar");
		Lug[3]=new Lugar("Espanha", "Madrid", "Europa", "Parque Guell", "Euro");
		Lug[4]=new Lugar("França", "Paris", "Europa", "Torre Eiffel", "Euro");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Lugar"+" - País: "+Lug[i].getPaís()+" - Capital: "+Lug[i].getCapital()+" - Continente: "+Lug[i].getContinente()+" - Ponto Turístico: "+Lug[i].getPontoturistico()+" - Moeda: "+Lug[i].getMoeda());
			
		}
		}
	
}
