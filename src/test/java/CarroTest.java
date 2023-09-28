import org.example.Carro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    void deveRetornarDistanciaKm(){
        Carro carro = new Carro();
        carro.setOdometer(500);
        assertEquals(500, carro.getDistanciaKm(), 0.1);

    }

    @Test
    void deveRetornarDistanciaMilha(){
        Carro carro = new Carro();
        carro.setOdometer(500);
        assertEquals(310.6855, carro.getDistanciaMilha(), 0.1);
    }

}
