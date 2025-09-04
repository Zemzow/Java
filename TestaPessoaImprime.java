/* ExercC-cios de classe
3. Dentro do main usar o método Imprime para mostrar na
console as informações das 3 pessoas criadas em tempo de
execução.
*/
public class TestaPessoaImprime
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
        
        
        pessoa1.Imprime(); 
        pessoa2.Imprime(); 
        pessoa3.Imprime();
    }
}

