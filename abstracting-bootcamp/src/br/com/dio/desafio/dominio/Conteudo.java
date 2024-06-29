package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //contante
    protected static final double XP_Padrao = 10;

    private String titulo;
    private String descricao;

    //na classe abstrata nao e possivel estanciar
    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

    
}
