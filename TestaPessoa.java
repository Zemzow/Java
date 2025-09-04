/* ExercC-cios de classe
2. Escrever a classe TestaPessoa, que contem o método main,
onde serão criadas 3 pessoas: a Ana Souza com 31 anos, a Bia
Nunes com 25 anos e o Paulo Santos com 45 anos.
*/

public class TestaPessoa
{

    // classe principal
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa(); 
        Pessoa pessoa2 = new Pessoa(); 
        Pessoa pessoa3 = new Pessoa();
        
        pessoa1.nome = "Ana Souza"; 
        pessoa1.idade = 31; 
        pessoa2.nome = "Bia Nunes"; 
        pessoa2.idade = 25; 
        pessoa3.nome = "Paulo Santos"; 
        pessoa3.idade = 45;
        
    }
}

