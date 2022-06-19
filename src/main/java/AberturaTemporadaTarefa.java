public class AberturaTemporadaTarefa implements Tarefa{

    private Temporada temporada;

    public AberturaTemporadaTarefa(Temporada temporada) {
        this.temporada = temporada;
    }

    public void executar() {
        this.temporada.abrirTemporada();
    }

    public void cancelar() {
        this.temporada.fecharTemporada();
    }
}
