package projecto_polimorfismo;

/**
 * @author Jason
 */
public class Aluno {
   
    
    private String nome;
    private String telefone;
    private String matricula;
    
    
    public Aluno(){
        
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    
    
    public String getNome() {
        return nome;
    }
    
    public String getNome(boolean nome){
    
        if(nome){
            return this.nome.split(" ")[0];
        }
        else
        {
            return this.nome;
        }
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
     
    
}
