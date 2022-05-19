package br.com.developer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Hospital samaritano = new Hospital(1L, "Hospital Samaritano", "09.129.222/0001-83",
                "Av. Santa Júlia, 35 - Torre", -7.1214953, -34.8591122, 85, dateFormat.format(new Date()));
        Hospital hnsn = new Hospital(1L, "Hospital Nossa Senhora das Neves", "01.817.749/0001-99",
                "R. Etelvina Macedo de Mendonça, 531 - Torre", -7.1328767, -34.8590414, 90, dateFormat.format(new Date()));

        //Atualizar porcentagem de ocupação
        samaritano.atualizarOcupacao(80);
        hnsn.atualizarOcupacao(95);

        //MOCK dos recursos nos hospitais
        Recurso medico1 = new Recurso(1L, "Dra Maria Clara", TipoRecurso.MEDICO);
        Recurso enfermeiro2 = new Recurso(2L, "Pedro Carlos", TipoRecurso.ENFERMEIRO);
        Recurso tomografo1 = new Recurso(3L, "Tomografo X8596", TipoRecurso.TOMOGRAFO);
        Recurso tomografo2 = new Recurso(4L, "Tomografo HT996", TipoRecurso.TOMOGRAFO);
        Recurso medico2 = new Recurso(5L, "Dr Marcelo Henrique", TipoRecurso.MEDICO);
        Recurso enfermeiro1 = new Recurso(6L, "Ana Carolina", TipoRecurso.ENFERMEIRO);
        Recurso tomografo3 = new Recurso(7L, "Tomografo LKS97", TipoRecurso.TOMOGRAFO);
        List<Recurso> recursosSamaritano = new ArrayList<>(Arrays.asList(medico1, enfermeiro2, tomografo1, tomografo2));
        List<Recurso> recursosHnsn = new ArrayList<>(Arrays.asList(medico2, enfermeiro1, tomografo3));
        samaritano.setRecursos(recursosSamaritano);
        hnsn.setRecursos(recursosHnsn);

        System.out.println(samaritano);
        System.out.println(hnsn);
        System.out.println("--------------------------------------------------\n");

        //Intercambio de recursos
        List<Recurso> recursosEnviados = new ArrayList<>(Arrays.asList(medico1, tomografo1));
        List<Recurso> recursosRecebidos = new ArrayList<>(Arrays.asList(enfermeiro1, tomografo3));
        IntercambioRecursos intercambio1 = new IntercambioRecursos(1L, samaritano, hnsn, dateFormat.format(new Date()));
        intercambio1.transacao(recursosEnviados, recursosRecebidos);

        System.out.println(samaritano);
        System.out.println(hnsn);
    }
}
