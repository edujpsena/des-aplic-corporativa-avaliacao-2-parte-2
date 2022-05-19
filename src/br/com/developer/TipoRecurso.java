package br.com.developer;

public enum TipoRecurso {

    ENFERMEIRO(1, 3),
    MEDICO(2, 3),
    RESPIRADOR(3, 5),
    TOMOGRAFO(4, 12),
    AMBULANCIA(5,  10);

    private Integer codigo;

    private Integer pontos;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    private TipoRecurso(Integer codigo, Integer pontos) {
        this.codigo = codigo;
        this.pontos = pontos;
    }

    public static TipoRecurso valueOf(Integer codigo) {
        for (TipoRecurso tr: values()) {
            if (tr.getCodigo().equals(codigo)) {
                return tr;
            }
        }
        return null;
    }
}
