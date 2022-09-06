package InstrucaoDeRepeticao;

import java.util.Scanner;

public class InstrucaoDeRepeticao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    Estudante aluno = new Estudante("Pedro",7.8f);

    float totalnotas=0.0f;
    float nota=0.0f;
    int contador = -1 ;
    float media;
    int teste=0;

    while(nota!=-1)
    {
        totalnotas+=nota;
        System.out.println("Digite a nota ou -1 para sair.");
        do{
            if(teste!=0)
                System.out.println("Nota Invalida. Digite novamente:");
        nota = teclado.nextFloat();
        teste++;}while(nota>10 || nota<=-2);
        teste=0;
        if(nota!=-1)
            contador++;
    }
    if(contador==0)
        media=0.0f;
    else
        media=totalnotas/contador;
    aluno.setMedia(media);
    System.out.println(aluno.getNome());
    System.out.println(aluno.getMedia());


    }
}
