package br.com.developer;

public class Transacao {

    private Long id;

    private Recurso recurso;
    private IntercambioRecursos intercambio;

    public Transacao() {
    }

    public Transacao(Long id, Recurso recurso, IntercambioRecursos intercambio) {
        this.id = id;
        this.recurso = recurso;
        this.intercambio = intercambio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public IntercambioRecursos getIntercambio() {
        return intercambio;
    }

    public void setIntercambio(IntercambioRecursos intercambio) {
        this.intercambio = intercambio;
    }
}
