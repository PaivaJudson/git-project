package projecto_polimorfismo;
/**
 * @author Jason
 */
public class ExecutarPolimorfismo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno m1 = new Aluno("Gilberto Toledo", "111");
        
        Aluno m2 = new Aluno();
        m2.setNome("Judson Paiva");
        m2.setMatricula("20132080");
        
        System.out.println(m1.getNome(true));
        
    }
    
}
