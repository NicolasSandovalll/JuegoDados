package dominio;


public class Juego {
    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;
    private boolean victoria;
    private int totalSuma;

    public Juego() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.calculadora = new Calculadora();
        this.victoria = false;
        this.totalSuma = 0;
    }

    public void iniciarJuego() {
        lanzarDados();
        if (verificarVictoria()) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste, La suma fue de: " + totalSuma);
        }
    }

    public void lanzarDados() {
        dado1.lanzar();
        dado2.lanzar();
    }

    public boolean verificarVictoria() {
        totalSuma = calculadora.sumar(dado1.getCaraActual(), dado2.getCaraActual());
        this.victoria = (totalSuma == 7);
        return this.victoria;
    }

    public int getValorDado1() {
        return dado1.getCaraActual();
    }

    public int getValorDado2() {
        return dado2.getCaraActual();
    }
}
