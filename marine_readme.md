# [Exercises] OOP

<img src="../../art/oclogo.png" alt="drawing" width="150"/>

## Cet exercice a pour but la maitrise des bases de la programmation objet en JAVA

### Ennoncé :

1 - Créer une classe CarBrand (marque de voiture) avec les attributs suivants :

```
• name (String)
• address (String)
```

```
class CarBrand{
    String name;
    String adress;
    
}
```

2 -  Créer une classe Car (voiture) avec les attributs suivants :

```
• name (String)
• color (String)
• kilometers (int)
• brand (CarBrand)
```

```
class Car {
    String name;
    String color;
    Int kilometers;
    CarBrand brand;
}
```

3 - Créer un constructeur pour les 2 classes qui initialise toutes les propriétés de la classe.

```
class CarBrand{
    String name;
    String adress;

    //constructeur
    public CarBrand(String name, String adress){
        this.name= name;
        this.adress=adress;
    }

}

class Car {
    String name;
    String color;
    Int kilometers;
    CarBrand brand;

    //constructeur
    public Car(String name, String color, Int kilometers, CarBrand brand){
        this.name=name;
        this.color=color;
        this.kilometers=kilometers;
        this.brand=brand;
    }
}
```

4 - Créer 2 objets "marque de voitures" (Renault et Citroën).

```
CarBrand Renault= new CarBrand("Renault");
CarBrand Citroen= new CarBrand("Citroen");
```

5 - Créer 3 objets "voiture" (Clio, Twingo et Saxo) avec leurs marques associées.

```
Car Clio= new Car("Clio", "blanche", 55000, Renault);
Car Twingo=new Car("Twingo", "verte", 23000, Renault);
Car Saxo=new Car("Saxo", "bleue", 130000, Citroen);
```

6 - Ajouter 1 méthode "start" sur la classe "Car" qui affiche le nom de la voiture et "vrooom" dans la console.

```
class Car {
    String name;
    String color;
    Int kilometers;
    CarBrand brand;

    //constructeur
    public Car(String name, String color, Int kilometers, CarBrand brand){
        this.name=name;
        this.color=color;
        this.kilometers=kilometers;
        this.brand=brand;
    }

    //méthode start
    void start(){
        System.out.println(brand +"Vrooom");
    }
}


```

7 - Appeler la méthode "start" sur la Clio et la Twingo.

```
Clio.start();
Twingo.start();
```

8 - Le programme doit afficher "Clio vrooom" et "Twingo vrooom" dans la console.

```
public static void main(){
    Car Clio= new Car("Clio", "blanche", 55000, Renault);
    Car Twingo=new Car("Twingo", "verte", 23000, Renault);

        Clio.start();
        Twingo.start();
}
```

