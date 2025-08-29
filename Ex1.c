//Troque duas letras de um texto utilizando conteúdo informado pelo usuário
#include <stdio.h>

int main()
{
    char letra;
    char letra2;
    
    printf("Vamos escrever a frase 'Ola Mundo'");
    printf("Insira a letra O: ");
    scanf(" %c", &letra);
    
    printf("Insira a letra a: ");
    scanf(" %c", &letra2);
    
    printf("%cl%c mundo!", letra, letra2);

    return 0;
}
