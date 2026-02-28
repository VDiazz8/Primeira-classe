package com.sgp.modelos;  // Declaração do pacote

public class Jogador {
    
    private String nome;  // Atributo privado, acessível somente dentro da classe Pessoa
    private String posicao;
    private float envergadura;  // Atributo privado, acessível somente dentro da classe Pessoa
    private float altura; 

    // Construtor que recebe nome e idade como parâmetros
    public Jogador(String nome, String posicao, float envergadura, float altura) {
        this.nome = nome;
        this.posicao = posicao;
        this.envergadura = envergadura;
        this.altura = altura

    }

    // Construtor sobrecarregado que recebe apenas o nome
    // Inicializa com valores padrão: nome="Carlos" e idade=20
    public Jogador() {
        this.nome = "Lebron";
        this.altura = 2.06;
        this.envergadura = 2.14;
        this.posicao = "Ala / Ala-pivô"
    }

    // Método que exibe uma mensagem de saudação com o nome e idade da pessoa
    public void saudacao() {
        System.out.println("Olá, " + nome + "!" + " Você tem " + altura + " metros de altura e " + envergadura "metros de envergadura. Sua posição é" + posicao);
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados
    
    // Retorna o nome do jogador
    public String getNome() {
        return nome;
    }

    // Retorna a altura do jogador
    public float getAltura() {
        return altura;
    }

    // Retorna a envergadura do jogador
    public float getEnvergadura() {
        return envergadura;
    }

    // Retorna a posicao do jogador
    public String getPosicao() {
        return posicao;
    }

    // Define um novo nome para o jogador
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define uma nova posicao para o jogador
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    // Define uma nova idade para o jogador
    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Define uma nova envergadura para o jogador
    public void setEnvergadura(float envergadura) {
        this.envergadura = envergadura;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", altura=" + altura + ", envergadura=" + envergadura + ", posição=" + posicao + "]";
    }
}