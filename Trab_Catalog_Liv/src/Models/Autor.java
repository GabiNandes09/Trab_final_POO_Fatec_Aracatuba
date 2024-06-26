package Models;

public class Autor {
    private int autor_id;
    private String autor_nome;

    public Autor() {
    }

    public Autor(int autor_id, String autor_nome) {
        this.autor_id = autor_id;
        this.autor_nome = autor_nome;
    }
    public Autor(String autor_nome) {
        this.autor_nome = autor_nome;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getAutor_nome() {
        return autor_nome;
    }

    public void setAutor_nome(String autor_nome) {
        this.autor_nome = autor_nome;
    }

   @Override
    public String toString(){
        return autor_nome;
    }
    
    
    
}
