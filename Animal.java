// Créer une classe "Animal" avec comme attributs "espece" et "age"

public class Animal{
	private String espece;
	private int age;

	// Constructeur
	public Animal (String espece, int age){
		this.espece = espece;
		this.age = age;
	}

	// Getters
	public String getEspece(){
		return espece;
	}

	public int getAge(){
		return age;

	}

	// Setters

	public void setEspece(String espece){
		this.espece = espece;
	}

	public void setAge(int age){
		if(age > 0){
			this.age = age;
		} else {
			System.out.println("Age invalide");
		}
	}

}