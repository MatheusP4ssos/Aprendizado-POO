package list.OperacoesBasicas;

public class Livro {
  //atributos
  private final String titulo;
  private final String autor;
  private final int anoDePublicacao;

  public Livro(String titulo, String autor, int anoDePublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoDePublicacao = anoDePublicacao;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnoDePublicacao() {
    return anoDePublicacao;
  }

  @Override
  public String toString() {
    return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", anoDePublicacao=" + anoDePublicacao +
        '}';
  }
}
