public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CarBrand Renault = new CarBrand("Renault","Boulogne-Billancourt");
        CarBrand Citroën = new CarBrand("Citroën","Rueil-Malmaison");

        Car Clio = new Car("Clio","rouge",12805,Renault);
        Car Twingo = new Car("Twingo","blanc", 53635,Renault);
        Car Saxo = new Car ("Saxo","jaune", 6430,Citroën);

        Clio.Start();
        Twingo.Start();

    }
}

------------------------------------------------------------------------------------

public class Car {
    String name;
    String color;
    int kilometers;
    CarBrand brand;

    Car(String pName, String pColor, int pKilometers, CarBrand pBrand){
        name=pName;
        color=pColor;
        kilometers=pKilometers;
        brand=pBrand;
    }

    public void Start() {
        Log.i(name,"vroom");
    }

}

------------------------------------------------------------------------------------

public class CarBrand {
    String name;
    String address;

    CarBrand(String pName, String pAddress) {
        name = pName;
        address = pAddress;
    }
}
