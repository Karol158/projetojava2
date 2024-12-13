package biblioteca;
public class Livroinfantil extends Livros {

  private String linguagem;
  
  Livroinfantil(String capa, String nome_livro, String nome_autor, int ano_escrito, 
     String genero, int ano_publicado, String linguagem){
        super(capa, nome_livro, nome_autor, ano_escrito, genero, ano_publicado); 
        this.linguagem=linguagem;
     }
     public String getLinguagem(){
        return linguagem;
     }
     public void setLinguagem(String linguagem){
        this.linguagem=linguagem;
     }
     @Override
public String getCapa() {
    return this.capa;
}
@Override
public void setCapa(String capa) {
    this.capa = capa;
}
@Override
public String getNome_livro() {
    return this.nome_livro;
}
@Override
public void setNome_livro(String nome_livro) {
    this.nome_livro = nome_livro;
}
@Override
public String getNome_autor() {
    return this.nome_autor;
}
@Override
public void setNome_autor(String nome_autor) {
    this.nome_autor = nome_autor;
}
@Override
public int getAno_escrito() {
    return this.ano_escrito;
}
@Override
public void setAno_escrito(int ano_escrito) {
    this.ano_escrito = ano_escrito;
}
@Override
public String getGenero() {
    return this.genero;
}
@Override
public void setGenero(String genero) {
    this.genero = genero;
}
@Override
public int getAno_publicado() {
    return this.ano_publicado;
}
@Override
public void setAno_publicado(int ano_publicado) {
    this.ano_publicado = ano_publicado;
}

}
