import java.util.Scanner;

public class Cases {
    Scanner sc = new Scanner(System.in);

    public void Case1(){
        System.out.println("------Vendo Tabuada------");
        System.out.println("Escolha um Número: ");
        int n = sc.nextInt();

        System.out.println("\nTabuada: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        System.out.println("\nDigite 0 para sair");
        char c = sc.next().charAt(0);
    }

    public void Case2(){
        System.out.println("------------Calculo do IMC------------");
        System.out.println("Formula : IMC = peso/(altura * altura)");

        System.out.println("Qual seu peso?");
        double peso = sc.nextDouble();
        System.out.println("Qual sua altura?");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("\nSeu IMC: " + imc);

        if(imc <= 18.5){
            System.out.println("A baixo do peso ideal");
        } else if(imc >= 18.6 && imc <= 24.9){
            System.out.println("peso ideal");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("Levemente a cima do peso ideal");
        } else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obsidade Grau 1");
        }  else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obsidade Grau 2 (Severa)");
        } else if(imc >= 40){
            System.out.println("Obsidade Grau 3 (Morbida)");
        }
        System.out.println("\nDigite 0 para sair");
        char c = sc.next().charAt(0);
    }

    public void Case3(){
        System.out.println("------Números Decrescentes------");
        System.out.println("digite um numero: ");
        int n = sc.nextInt();
        System.out.println("digite um numero maior que o primeiro: ");
        int m = sc.nextInt();
        System.out.println("Será feito em numeros pares ou impares?");
        String escolha = sc.next();

        if("pares".equals(escolha)){
            for(int i = m; i >= n; i--){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        } else if("impares".equals(escolha)){
            for(int i = m; i >= n; i--){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }
        System.out.println("\nDigite 0 para sair");
        char c = sc.next().charAt(0);
    }

    public void Case4(){
        System.out.println("------Não divisivel por 0------");
        System.out.println("Infome um numero para a divisão: ");
        int n = sc.nextInt();

        while (true){
            System.out.println("Informe um numero para ser dividido: ");
            int d = sc.nextInt();
            if(d < n){
                System.out.printf("Informe um numero maior que %s \n", n);
                continue;
            }
            int resultado = d % n;
            System.out.printf("%s %% %s = %s\n", d, n, resultado);
            if(resultado != 0){
                break;
            }
        }
    }
}