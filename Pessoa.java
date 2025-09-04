/* ExercC-cios de classe
1. Escrever a classe Pessoa contendo nome e idade e o mC)todo
Imprime que imprime na Console os dados da Pessoa.
*/
public class Pessoa
{
    //Atributos da classe
    String nome;
    int idade;
    
    //Método para imprimir dados da pessoa
    void Imprime(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " + idade);
        }

    // classe principal
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Enzo";
        pessoa1.idade = 18;
        
        pessoa1.Imprime();
    }
}

