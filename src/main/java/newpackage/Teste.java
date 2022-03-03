
package newpackage;

public class Teste {
    public static void main(String[] args){
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        //Funcionario 1
        f1.setCargo("Gerente");
        f1.setSalario(10.500);
        f1.setNome("João");
        f1.setIdade(37);
        f1.setAltura(1.85f);
        
        //Funcionario 2
        f2.setCargo("Caixa");
        f2.setSalario(2.700);
        f2.setNome("Gustavo");
        f2.setIdade(22);
        f2.setAltura(1.79f);
        
        //Funcionário 1
        System.out.println("Funcionário 1");
        System.out.println(f1);
        
        //Funcionário 2
        System.out.println("Funcionário 2");
        System.out.println(f2);
    }
}
