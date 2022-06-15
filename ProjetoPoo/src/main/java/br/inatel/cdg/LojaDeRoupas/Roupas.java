package br.inatel.cdg.LojaDeRoupas;

// Classe abstrata "esqueleto"
public abstract class Roupas
{
    // Atributos
    private float preco;
    private String tamanho;
    private int quantidade;
    private String cor;
    private String nome;

    // GETTERS e SETTERS
    public float getPreco() {return preco;}
    public void setPreco(float preco) {this.preco = preco;}
    public String getTamanho() {return tamanho;}
    public void setTamanho(String tamanho) {this.tamanho = tamanho;}
    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

}
