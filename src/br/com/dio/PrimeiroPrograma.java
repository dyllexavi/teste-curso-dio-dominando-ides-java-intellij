package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livros livros = new Livros("O problema dos 3 corpos", 300);

        System.out.println(gato);
        System.out.println(livros);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!!" + (a+b));*/
    }
}

class Livros {
    private String nome;
    private Integer npg;

    public Livros(String nome, Integer npg) {
        this.nome = nome;
        this.npg = npg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpg() {
        return npg;
    }

    public void setNpg(Integer npg) {
        this.npg = npg;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", npg=" + npg +
                '}';
    }
}
