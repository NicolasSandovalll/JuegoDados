package dominio;

import java.util.Random;

public class Dado {
    private final int caras = 6;
    private int caraActual;

    public int getCaraActual() {
        return caraActual;
    }

    public void lanzar() {
        Random random = new Random();
        this.caraActual = random.nextInt(caras) + 1;
    }
}