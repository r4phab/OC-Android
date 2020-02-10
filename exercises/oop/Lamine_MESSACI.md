# [Exercises] OOP_Lamine MESSACI

<img src="../../art/oclogo.png" alt="drawing" width="150"/>

## Cet exercice a pour but la maitrise des bases de la programmation objet en JAVA

### Ennoncé :

1 - Créer une classe CarBrand (marque de voiture) avec les attributs suivants :

• name (String)
• address (String)

```
public class CarBrand{

	private String name;
	private String address;
}
```

2 -  Créer une classe Car (voiture) avec les attributs suivants :
• name (String)
• color (String)
• kilometers (int)
• brand (CarBrand)

```
public abstract class  Car {
	private String name;
	private String color;
	private int kilometers;
	private CarBrand brand;
}
```

3 - Créer un constructeur pour les 2 classes qui initialise toutes les propriétés de la classe.


 ```
 public CarBrand (String name, String address){

 	this.name = name;
 	this.adress = address;
 }

 public CarBrand(String name) {
        this.name = name;
    }
      

public Car(String name, String color, int kilometers, CarBrand brand){

    this.name =name;
    this.color = color;
    this.kilometers = kilometers;
    this.brand = brand;

}

  public Car(String name) {
        this.name = name;
    }
    
 ```

4 - Créer 2 objets "marque de voitures" (Renault et Citroën).

```
CarBrand carBrand = new CarBrand("Renault");
CarBrand carBrand = new CarBrand("Citroên");

```

5 - Créer 3 objets "voiture" (Clio, Twingo et Saxo) avec leurs marques associées.


```
        Voiture clio = new Voiture("Clio");
        Voiture twingo = new Voiture("Twingo");
        Voiture saxo = new Voiture("Saxo");	
```
6 - Ajouter 1 méthode "start" sur la classe "Car" qui affiche le nom de la voiture et "vrooom" dans la console.

```
protected abstract void star();
```

7 - Appeler la méthode "start" sur la Clio et la Twingo.

```
 @Override
    protected void star() {
        System.out.println(this.getName()+ " Vroom!!");
    }
 ```   

8 - Le programme doit afficher "Clio vrooom" et "Twingo vrooom" dans la console.

```

        clio.star();
        twingo.star();
        saxo.star();
```	
	


