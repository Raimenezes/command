import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class CbfTest {

    Cbf cbf;
    Temporada temporada;

    @BeforeEach
    public void setUp() {
        cbf = new Cbf();
        temporada = new Temporada(2021,1);
    }

    @Test
    public void deveAbrirTemporada() {
        Tarefa aberturaTemporada = new AberturaTemporadaTarefa(temporada);
        cbf.executarTarefa(aberturaTemporada);

        assertEquals("Temporada Iniciada", temporada.getSituacao());
    }

}
