import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String nome, nome2, nome3;
        String email, email2, email3;
        String resultado, resultado2, resultado3;
        double nota1, nota2, nota3,
        nota1_2, nota2_2, nota3_2,
        nota1_3, nota2_3, nota3_3;

        System.out.println("Insira o nome do aluno 1");
        nome = scanner.next();
        System.out.println("Insira o Email do aluno 1");
        email = scanner.next();
        System.out.println("Insira primeira nota do aluno 1");
        nota1 = scanner.nextDouble();
        System.out.println("Insira a segunda nota do aluno 1");
        nota2 = scanner.nextDouble();
        System.out.println("Insira a terceira nota do aluno 1");
        nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;


        if (media >= 7)
        {
            resultado = "Aprovado";
        }
        else
        {
            resultado = "Reprovado";
        }
        System.out.println("---------------------------");
        System.out.println("Nome do aluno 1: " + nome);
        System.out.println("E-mail do aluno 1: " + email);
        String mediaf = String.format("%.1f", media);
        System.out.println("O resultado do aluno 1 foi: " + resultado + " media: " + mediaf);
        System.out.println("---------------------------");


        //codigo 2
        System.out.println("Insira o nome do aluno 2");
        nome2 = scanner.next();
        System.out.println("Insira o Email do aluno 2");
        email2 = scanner.next();
        System.out.println("Insira primeira nota do aluno 2");
        nota1_2 = scanner.nextDouble();
        System.out.println("Insira a segunda nota do aluno 2");
        nota2_2 = scanner.nextDouble();
        System.out.println("Insira a terceira nota do aluno 2");
        nota3_2 = scanner.nextDouble();

        double media2 = (nota1_2 + nota2_2 + nota3_2) / 3;


        if (media2 >= 7)
        {
            resultado2 = "Aprovado";
        }
        else
        {
            resultado2 = "Reprovado";
        }
        System.out.println("---------------------------");
        System.out.println("Nome do aluno 2: " + nome2);
        System.out.println("E-mail do aluno 2: " + email2);
        String mediaf2 = String.format("%.1f", media2);
        System.out.println("O resultado do aluno 2 foi: " + resultado2 + " media: " + mediaf2);
        System.out.println("---------------------------");


        //codigo 3
        System.out.println("Insira o nome do aluno 3");
        nome3 = scanner.next();
        System.out.println("Insira o Email do aluno 3");
        email3 = scanner.next();
        System.out.println("Insira primeira nota do aluno 3");
        nota1_3 = scanner.nextDouble();
        System.out.println("Insira a segunda nota do aluno 3");
        nota2_3 = scanner.nextDouble();
        System.out.println("Insira a terceira nota do aluno 3");
        nota3_3 = scanner.nextDouble();

        double media3 = (nota1_3 + nota2_3 + nota3_3) / 3;


        if (media >= 7)
        {
            resultado3 = "Aprovado";
        }
        else
        {
            resultado3 = "Reprovado";
        }

        System.out.println("---------------------------");
        System.out.println("Nome do aluno 3: " + nome3);
        System.out.println("E-mail do aluno 3: " + email3);
        String mediaf3 = String.format("%.1f", media3);
        System.out.println("O resultado do aluno 3 foi: " + resultado3 + " media: " + mediaf3);
        System.out.println("---------------------------");


        scanner.close();
    }
}
