public class Aluno{
    private String nome;
    private int codmat;
    private String cpf;
    private char sexo;
    private double nota_P1, nota_P2, nota_P3;
    
    public Aluno(){
        
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public Aluno(String nome, int codmat, String cpf, char sexo, double nota_P1, double nota_P2, double nota_P3){
        this.nome = nome;
        this.codmat = codmat;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nota_P1 = nota_P1;
        this.nota_P2 = nota_P2;
        this.nota_P3 = nota_P3;
    }
    
    public void imprimeSexo(){
        System.out.println("Nome " + nome);
        if (sexo == 'M'){
            System.out.println("Sexo Masculino");
        } else {
            System.out.println("Sexo Feminino");
        }
    }
    
    public void imprimeAluno(){
        imprimeSexo();
        System.out.println("Código "+codmat);
        System.out.println("CPF " + cpf);
        System.out.println("Nota P1 " + nota_P1);
        System.out.println("Nota P2 " + nota_P2);
        System.out.println("Nota P3 " + nota_P3);
    }
    
    public double mediaAluno(){
        double maior1 = nota_P1;
        double maior2 = nota_P2;
        if (nota_P2 > maior1){
            maior1 = nota_P2;
            if (nota_P1 > nota_P3){
                maior2 = nota_P1;
            }else{
                maior2 = nota_P3;
            }
        } else {
            if (nota_P3 > maior1){
                maior1 = nota_P3;
                if (nota_P1 > nota_P2){
                    maior2 = nota_P1;
                }
            } else {
                if (nota_P3 > maior2){
                    maior2 = nota_P3;
                }
            }
        }
        return (maior1 + maior2)/2;
    }
    
    public String resultado(){
        double media = mediaAluno();
        if (media >= 6){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
}