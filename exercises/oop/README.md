# [Exercises] OOP

<img src="../../art/oclogo.png" alt="drawing" width="150"/>

## Cet exercice a pour but la maitrise des bases de la programmation objet en JAVA

### Ennoncé :

1 - Créer une classe CarBrand (marque de voiture) avec les attributs suivants :

• name (String)
• address (String)
```

```
Répondre ici


public class CarBrand{

	private String name;
	private String address;
}

2 -  Créer une classe Car (voiture) avec les attributs suivants :

```
• name (String)
• color (String)
• kilometers (int)
• brand (CarBrand)
```

```
Répondre ici

public class Car {
	private String name;
	private String color;
	private int kilometers;
	private CarBrand brand;
}

3 - Créer un constructeur pour les 2 classes qui initialise toutes les propriétés de la classe.

```
Répondre ici
 
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

4 - Créer 2 objets "marque de voitures" (Renault et Citroën).


Répondre ici
...

5 - Créer 3 objets "voiture" (Clio, Twingo et Saxo) avec leurs marques associées.

```
Répondre ici
```

6 - Ajouter 1 méthode "start" sur la classe "Car" qui affiche le nom de la voiture et "vrooom" dans la console.

```
Répondre ici
```

7 - Appeler la méthode "start" sur la Clio et la Twingo.

```
Répondre ici
```

8 - Le programme doit afficher "Clio vrooom" et "Twingo vrooom" dans la console.

```
Répondre ici
```

