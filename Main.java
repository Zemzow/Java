import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	
	    Aluno aVazio = new Aluno();
	    aVazio.imprimeAluno();
	    aVazio.setNome("Andrea");
	    System.out.println("Nome " + aVazio.getNome());
	    System.out.println("Nome ");
		String n = sc.nextLine();
		int cod;
		do{
		  System.out.println("Codigo ");
		  cod = Integer.parseInt(sc.nextLine());
		  if (cod<1){
		      System.out.println("Valor Inválido! Digite um positivo");
		  }
		}while(cod<1);
		System.out.println("CPF ");
		String cpf = sc.nextLine();
		char s;
		do{
		  System.out.println("Sexo ");
		  s = sc.nextLine().toUpperCase().charAt(0);
		  if (s != 'M' && s != 'F') {
		      System.out.println("Digite apenas F ou M");
		  }
		} while (s != 'M' && s != 'F');
		System.out.println("Nota P1 ");
		double nota1 = Double.parseDouble(sc.nextLine());
		System.out.println("Nota P2 ");
		double nota2 = Double.parseDouble(sc.nextLine());
		System.out.println("Nota P3 ");
		double nota3 = Double.parseDouble(sc.nextLine());
		Aluno a1 = new Aluno(n, cod, cpf, s, nota1,	nota2, nota3);
		a1.imprimeAluno();
		System.out.println("Resultado "+a1.resultado());
		
		
	    
	    /* usar quando modificador de acesso for public ou default
	    Aluno a1 = new Aluno();
	    System.out.println("Nome ");
		a1.nome = sc.nextLine();
		do{
		  System.out.println("Codigo ");
		  a1.codmat = Integer.parseInt(sc.nextLine());
		  if (a1.codmat<1){
		      System.out.println("Valor Inválido! Digite um positivo");
		  }
		}while(a1.codmat<1);
		System.out.println("CPF ");
		a1.cpf = sc.nextLine();
		do{
		  System.out.println("Sexo ");
		  a1.sexo = sc.nextLine().toUpperCase().charAt(0);
		  System.out.println(a1.sexo);
		  if (a1.sexo != 'M' && a1.sexo != 'F') {
		      System.out.println("Digite apenas F ou M");
		  }
		} while (a1.sexo != 'M' && a1.sexo != 'F');
		System.out.println("Nota P1 ");
		a1.nota_P1 = Double.parseDouble(sc.nextLine());
		System.out.println("Nota P2 ");
		a1.nota_P2 = Double.parseDouble(sc.nextLine());
		System.out.println("Nota P3 ");
		a1.nota_P3 = Double.parseDouble(sc.nextLine());
		a1.imprimeAluno();
		System.out.println("Resultado "+a1.resultado());
		
		Aluno a2 = new Aluno();
		System.out.println("Nome ");
		a2.nome = sc.nextLine();
		System.out.println("Codigo ");
		a2.codmat = Integer.parseInt(sc.nextLine());
		System.out.println("CPF ");
		a2.cpf = sc.nextLine();
		System.out.println("Sexo ");
		a2.sexo = sc.nextLine().charAt(0);
		System.out.println("Nota P1 ");
		a2.nota_P1 = Double.parseDouble(sc.nextLine());
		System.out.println("Nota P2 ");
		a2.nota_P2 = Double.parseDouble(sc.nextLine());
		System.out.println("Nota P3 ");
		a2.nota_P3 = Double.parseDouble(sc.nextLine());
		System.out.println("Resultado "+a2.resultado());
		*/
	    /*
		Aluno a1 = new Aluno();
		a1.nome = "Paulo";
		a1.codmat = 55123;
		a1.cpf = "800912345-12";
		a1.sexo = 'M';
		a1.nota_P1 = 7;
		a1.nota_P2 = 6;
		a1.nota_P3 = 8;
		System.out.println("Resultado "+a1.resultado());
		
		Aluno a2 = new Aluno();
		a2.nome = "Ana";
		a2.codmat = 991239;
		a2.cpf="500876123-15";
		a2.sexo = 'F';
		a2.nota_P1 = 2;
		a2.nota_P2 = 6;
		a2.nota_P3 = 9;
		System.out.println("Resultado "+a2.resultado());
		*/
	}
}
