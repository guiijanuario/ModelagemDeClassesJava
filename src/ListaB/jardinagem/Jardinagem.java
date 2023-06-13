package ListaB.jardinagem;

public class Jardinagem {

    String nomeJardim;
    Double qtdMetros;
    Integer qtdPlantas;
    Double qtdMetrosGrama;
    Double valorAdubo;
    Double valorMetroGrama;
    Double valorConteGrama;

    public Jardinagem(String nomeJardim, Double qtdMetros, Integer qtdPlantas,
                      Double qtdMetrosGrama, Double valorAdubo,
                      Double valorMetroGrama, Double valorCorteGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorConteGrama = valorCorteGrama;
    }

    public Double usarAdubo(Double qtdMetros){
        Double metrosEmCm = qtdMetros / 100;
        Double quantidadeAdubo = metrosEmCm * 0.5;

        System.out.println("Deve ser usado " + quantidadeAdubo + " gramas de adubo." );

        return quantidadeAdubo;
    }

    public Double precoAdubo(Double quantidadeAdubo){
            Double precoAdubo = quantidadeAdubo * valorAdubo;
            return precoAdubo;
    }

    public double precoCorteGrama(double qtdMetrosGrama, double valorMetroGrama){
        valorConteGrama = qtdMetrosGrama * valorMetroGrama;
        return valorConteGrama;
    }

}
