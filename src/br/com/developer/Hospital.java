package br.com.developer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hospital {

    private Long id;

    private String nome;
    private String cnpj;
    private String endereco;
    private Double latitude;
    private Double longitude;
    private Integer ocupacao;
    private String dataAttOcupacao;

    private List<Recurso> recursos;

    public Hospital() {
    }

    public Hospital(Long id, String nome, String cnpj, String endereco, Double latitude, Double longitude, Integer ocupacao, String dataAttOcupacao) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ocupacao = ocupacao;
        this.dataAttOcupacao = dataAttOcupacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(Integer ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getDataAttOcupacao() {
        return dataAttOcupacao;
    }

    public void setDataAttOcupacao(String dataAttOcupacao) {
        this.dataAttOcupacao = dataAttOcupacao;
    }

    public void atualizarOcupacao(int newOcupacao) {
        setOcupacao(newOcupacao);
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nome='" + nome + '\n' +
                "• endereco='" + endereco + '\n' +
                "• ocupacao=" + ocupacao + "%" +
                " - dataAttOcupacao='" + dataAttOcupacao + '\n' +
                "• recursos=" + recursos +
                '}';
    }
}
