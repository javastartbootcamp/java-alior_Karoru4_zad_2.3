package pl.javastart.task;

public class DrinkRecipe {
    public static void main(String[] args) {

        Ingridient ingridient1 = new Ingridient("woda", 150);
        Ingridient ingridient2 = new Ingridient("sok cytrynowy", 10);
        Ingridient ingridient3 = new Ingridient("wódka", 50);
        Drink drink1 = new Drink("Mojito", 13, true, ingridient1, ingridient2, ingridient3);

        Ingridient ingridient4 = new Ingridient("syrop cukrowy", 20);
        Ingridient ingridient5 = new Ingridient("sok cytrynowy", 21);
        Ingridient ingridient6 = new Ingridient("whiskey", 45);
        Drink drink2 = new Drink("Whiskey sour", 18, true, ingridient4, ingridient5, ingridient6);

        System.out.println(drink1.getDrinkInfo());
        System.out.println(drink1.volumeAll() + "\n");
        System.out.println(drink2.getDrinkInfo());
        System.out.println(drink2.volumeAll() + "\n");
    }
}
