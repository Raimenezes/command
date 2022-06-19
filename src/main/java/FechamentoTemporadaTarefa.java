public class FechamentoTemporadaTarefa implements Tarefa {

    private Temporada temporada;

    public FechamentoTemporadaTarefa(Temporada temporada) {
        this.temporada = temporada;
    }

    public void executar() {
        this.temporada.fecharTemporada();
    }

    public void cancelar() {
        this.temporada.abrirTemporada();
    }
}
