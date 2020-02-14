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
   public CarBrand(String name) {
        this.name = name;
        this.address = setAddress(address);
    }

      
  public Car(String name) {
        this.name = name;
        this.color = setColor(color);
        this.kilometers = setKilometers(kilometers);
        this.brand = setBrand(brand);
    }
   
 ```

4 - Créer 2 objets "marque de voitures" (Renault et Citroën).

```
 CarBrand marqueDeVoiture = new CarBrand("Renault");
 CarBrand marqueDeVoiture1 = new CarBrand("Citroën");

```

5 - Créer 3 objets "voiture" (Clio, Twingo et Saxo) avec leurs marques associées.


```
        Voiture clio = new Voiture("Clio");
        clio.setBrand(new CarBrand("Renault"));
        
        Voiture twingo = new Voiture("Twingo");
        twingo.setBrand(new CarBrand("Renault"));
        
        Voiture saxo = new Voiture("Saxo");
        clio.setBrand(new CarBrand("Citroên"));
	
```
6 - Ajouter 1 méthode "start" sur la classe "Car" qui affiche le nom de la voiture et "vrooom" dans la console.

```
protected abstract void star();// dans la class Car


// dans la class Voiture qui hérite de la class Car et On transforme Car a une class abstract

 @Override 
    protected void star() {
        System.out.println(this.getName()+ " Vroom!!");
    }

```

7 - Appeler la méthode "start" sur la Clio et la Twingo.

```
 clio.start();
 twingo.start();

 ```   

8 - Le programme doit afficher "Clio vrooom" et "Twingo vrooom" dans la console.

	


