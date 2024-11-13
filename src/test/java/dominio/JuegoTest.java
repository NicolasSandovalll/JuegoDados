package dominio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
    private Juego juego;

    @BeforeEach
    public void setUp() {
        juego = new Juego();
    }

    @Test
    public void testLanzarDados() {
        juego.lanzarDados();
        int valorDado1 = juego.getValorDado1();
        int valorDado2 = juego.getValorDado2();


        assertTrue(valorDado1 >= 1 && valorDado1 <= 6, "El valor del dado 1 debe estar entre 1 y 6");
        assertTrue(valorDado2 >= 1 && valorDado2 <= 6, "El valor del dado 2 debe estar entre 1 y 6");
    }

    @Test
    public void testVerificarVictoria() {
        juego.lanzarDados();
        int suma = juego.getValorDado1() + juego.getValorDado2();


        if (suma == 7) {
            assertTrue(juego.verificarVictoria(), "Se esperaba victoria con una suma de 7");
        } else {
            assertFalse(juego.verificarVictoria(), "No se esperaba victoria con una suma diferente de 7");
        }
    }
}
