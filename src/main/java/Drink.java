package pl.javastart.task;

public class Drink {

    String name;
    double price;
    boolean withAlcohol;
    Ingridient ingridientA;
    Ingridient ingridientB;
    Ingridient ingridientC;

    public Drink(String name, double price, boolean withAlcohol,
                 Ingridient ing1, Ingridient ing2, Ingridient ing3) {
        this.name = name;
        this.price = price;
        this.withAlcohol = withAlcohol;
        this.ingridientA = ing1;
        this.ingridientB = ing2;
        this.ingridientC = ing3;
    }

    String getDrinkInfo() {
        return "Drink: " + name
                + "\nCena: " + price + "zł"
                + "\nCzy zawiera alkohol? " + withAlcohol
                + "\nSkładniki:\n" + ingridientA.getIngridients()
                + "\n" + ingridientB.getIngridients()
                + "\n" + ingridientC.getIngridients();
    }

    String volumeAll() {
        int volumeSum = ingridientA.getVolume() + ingridientB.getVolume() + ingridientC.getVolume();
        return "Pojemność: " + volumeSum + "ml";
    }
}

