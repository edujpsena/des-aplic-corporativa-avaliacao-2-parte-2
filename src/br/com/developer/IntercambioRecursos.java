package br.com.developer;

import java.util.Date;
import java.util.List;

public class IntercambioRecursos {

    private Long id;

    private Hospital hospitalOrigem;
    private Hospital hospitalDestino;
    private String dataIntercambio;

    public IntercambioRecursos() {
    }

    public IntercambioRecursos(Long id, Hospital hospitalOrigem, Hospital hospitalDestino, String dataIntercambio) {
        this.id = id;
        this.hospitalOrigem = hospitalOrigem;
        this.hospitalDestino = hospitalDestino;
        this.dataIntercambio = dataIntercambio;
    }

    public void transacao(List<Recurso> recursosEnviados, List<Recurso> recursosRecebidos) {

        List<Recurso> recursosHospOrigem = hospitalOrigem.getRecursos();
        List<Recurso> recursosHospDestino = hospitalDestino.getRecursos();

        int valorRecursoEnviados = calcularValorRecursos(recursosEnviados);
        int valorRecursoRecebidos = calcularValorRecursos(recursosRecebidos);

        if (valorRecursoEnviados == valorRecursoRecebidos) {
            for (Recurso recursoEnv: recursosEnviados) {
                if (recursosHospOrigem.contains(recursoEnv)) {
                    recursosHospDestino.add(recursoEnv);
                    recursosHospOrigem.remove(recursoEnv);

                }
            }
            for (Recurso recursoRec: recursosRecebidos) {
                if (recursosHospDestino.contains(recursoRec)) {
                    recursosHospOrigem.add(recursoRec);
                    recursosHospDestino.remove(recursoRec);
                    ;
                }
            }
            System.out.println("Recursos trocados");
        } else {
            System.out.println("Os valores dos recursos devem ser equivalentes");
        }

    }

    public Integer calcularValorRecursos(List<Recurso> recursosHospital) {
        return recursosHospital.stream()
                .distinct()
                .map(recurso -> recurso.getTipo().getPontos())
                .reduce(0, (acc, valorRecurso) -> acc + valorRecurso);
    }
}
