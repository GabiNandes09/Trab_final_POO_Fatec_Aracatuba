package Models;

public class Livro {
    private int livro_id;
    private String livro_nome;
    private int genero_id;
    private int autor_id;
    private int editora_id;

    public Livro(String nome_Livro, int ID_Genero, int ID_Autor, int ID_Editora) {
        this.livro_nome = nome_Livro;
        this.genero_id = ID_Genero;
        this.autor_id = ID_Autor;
        this.editora_id = ID_Editora;
    }

    public Livro() {
    }

    public int getLivro_id() {
        return livro_id;
    }
    public void setLivro_id(int livro_id){
        this.livro_id = livro_id;
    }

    public String getLivro_nome() {
        return livro_nome;
    }

    public void setLivro_nome(String livro_nome) {
        this.livro_nome = livro_nome;
    }

    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public int getEditora_id() {
        return editora_id;
    }

    public void setEditora_id(int editora_id) {
        this.editora_id = editora_id;
    }
    
    
    
    
}
