package br.com.developer;

public class Recurso {

    private Long id;

    private String nome;
    private Integer tipo;
    private Integer valor;

    public Recurso() {
    }

    public Recurso(Long id, String nome, TipoRecurso tipo) {
        this.id = id;
        this.nome = nome;
        setTipo(tipo);
        setValor(tipo.getPontos());
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

    public TipoRecurso getTipo() {
        return TipoRecurso.valueOf(tipo);
    }

    public void setTipo(TipoRecurso tipo) {
        if (tipo != null) {
            this.tipo = tipo.getCodigo();
        }
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", valor=" + valor +
                '}';
    }
}
