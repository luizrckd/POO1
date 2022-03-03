
package newpackage;

public class Funcionario {
    
    //Métodos publicos
    public String cargo;
    public double salario;
    
    //Métodos privados
    private String nome;
    private int idade;
    private float altura;
    
    //Get´s & Set´s
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String c){
        this.cargo = c;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double s){
        this.salario = s;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float a){
        this.altura = a;
    }
    
    //Método toString
    @Override
    public String toString(){
        return "Cargo: " + cargo + ", Salário: " + salario + ", Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura;
    }
    
}
