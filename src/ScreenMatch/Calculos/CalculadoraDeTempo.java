package ScreenMatch.Calculos;

import ScreenMatch.Modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;



    public int getTempoTotal() {
        return this.tempoTotal;
    }

    //Não usa setters, pois não é necessário alterar o tempo total

    // public void inclui(Filme f){
    //     this.tempoTotal += f.getDuracaoEmMinutos();
    // }
    
    // public void inclui(Serie s){
    //     this.tempoTotal += s.getDuracaoEmMinutos();
    // }

    //Shift + alt + o para organizar os imports/Importar os imports
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
