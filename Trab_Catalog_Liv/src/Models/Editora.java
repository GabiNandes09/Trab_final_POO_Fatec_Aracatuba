package Models;

public class Editora {
    private int editora_id;
    private String editora_nome;

    public Editora() {
    }

    public Editora(int editora_id, String editora_nome) {
        this.editora_id = editora_id;
        this.editora_nome = editora_nome;
    }
    
    public Editora(String editora_nome) {
        this.editora_nome = editora_nome;
    }

    public int getEditora_id() {
        return editora_id;
    }

    public void setEditora_id(int editora_id) {
        this.editora_id = editora_id;
    }

    public String getEditora_nome() {
        return editora_nome;
    }

    public void setEditora_nome(String editora_nome) {
        this.editora_nome = editora_nome;
    }
    
    @Override
    public String toString(){
        return editora_nome;
    }

}
