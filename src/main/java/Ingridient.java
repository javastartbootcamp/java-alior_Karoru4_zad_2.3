package pl.javastart.task;

public class Ingridient {

    String ingridientName;
    int volume;

    public Ingridient(String ingridientName, int vol) {
        this.ingridientName = ingridientName;
        this.volume = vol;
    }

    String getIngridients() {
        return ingridientName;
    }

    int getVolume() {
        return volume;
    }
}
