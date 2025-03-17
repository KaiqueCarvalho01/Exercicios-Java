package ScreenMatch.Modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean finalizada;
    private int minutosPorEpisodio;
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public boolean isFinalizada() {
        return finalizada;
    }
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}