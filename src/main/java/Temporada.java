public class Temporada {

    private int ano;
    private int temporada;
    private String situacao;

    public Temporada(int ano, int temporada) {
        this.ano = ano;
        this.temporada = temporada;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirTemporada() {
        this.situacao = "Temporada Iniciada";
    }

    public void fecharTemporada() {
        this.situacao = "Temporada Acabou";
    }
}
