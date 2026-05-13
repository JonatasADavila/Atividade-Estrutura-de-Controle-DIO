public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;

        do{
            Menu.Menu();
            Cases cases = new Cases();
            op = sc.next().charAt(0);

            switch(op){
                case '1':
                    cases.Case1();
                    break;
                case '2':
                    cases.Case2();
                    break;
                case '3':
                    cases.Case3();
                    break;
                case '4':
                    cases.Case4();
                    break;
                case '0':
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Digite apenas de 0 a 4 das opções a cima");
            }
        }while(op != '0');
    }