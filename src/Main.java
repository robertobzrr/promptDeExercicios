import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circulo c = new Circulo();
        Livro l = new Livro();
        Retangulo r = new Retangulo();
        ContaBancaria cb = new ContaBancaria();
        Pessoa p = new Pessoa();
        Produto pr = new Produto();
        Carro crr = new Carro();
        Aluno a = new Aluno();
        Triangulo t = new Triangulo();
        Funcionario f = new Funcionario();



        int i = 0;

        do {
            System.out.println("========== Lista de Exercício 02 - Classes Python ==========\n");
            System.out.println("\n-> Escolha o exercício que deseja avaliar:\n   [1] --- Exercício 01\n   [2] --- Exercício 02\n   [3] --- Exercício 03\n   [4] --- Exercício 04\n   [5] --- Exercício 05\n   [6] --- Exercício 06\n   [7] --- Exercício 07\n   [8] --- Exercício 08\n   [9] --- Exercício 09\n   [10] --- Exercício 10 ");

            int num = sc.nextInt();
            sc.nextLine();
            switch(num){
                case 1:
                    System.out.println("1) Crie uma classe chamada “Circulo” que tenha um atributo “raio”. Implemente um\n método chamado\n “calcular_area” que retorna a área do círculo.");

                    System.out.println("  - Digite o valor do raio do circulo = ");
                    c.raio = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("R: Área do circulo: "+ c.calcular_areaCirculo(c.raio));
                    break;


                case 2:
                    System.out.println("2) Crie uma classe chamada “Livro” que tenha atributos “titulo” e “autor”. Implemente um método\n chamado “detalhes” que retorna uma string com as informações do livro.");

                    System.out.println("  - Digite o titulo do livro: ");
                    l.titulo = sc.nextLine();

                    System.out.println("  - Digite o nome do autor do livro: ");
                    l.autor = sc.nextLine();

                    System.out.println(l.detalhes());
                    break;


                case 3:
                    System.out.println("3) Crie uma classe chamada Retangulo que tenha atributos base e altura. Implemente um \nmétodo chamado calcular_area que retorna a área do retângulo.");

                    System.out.println("\n  - Digite o valor da base: ");
                    r.base = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("  -  Digite o valor da altura: ");
                    r.altura = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("R: A área do retangulo é = " + r.calcular_AreaRetangulo(r.altura, r.base));
                    break;


                case 4:
                    System.out.println("4) Crie uma classe chamada “ContaBancaria” que tenha atributos “saldo” e “titular”. \nImplemente métodos “depositar” e “sacar” para manipular o saldo.");

                    System.out.println("\nVamos começar, escolha entre as opções:\n  - [1] Saque\n  - [2] Deposito");

                    int subOpcao1 = sc.nextInt();
                    sc.nextLine();
                    switch (subOpcao1){

                        case 1:
                            System.out.println("Você escolheu SAQUE.\n\nSeu saldo atual é: "+cb.saldo+".\nDigite o valor que deseja sacar: ");
                            cb.saque = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("\nTransação completa!!\nSaldo atualizado = "+cb.saqueConta(cb.saldo, cb.saque));
                            break;


                        case 2:
                            System.out.println("Você escolheu DEPÓSITO.\n\nSeu saldo atual é: "+cb.saldo+".\nDigite o valor que deseja depositar: ");
                            cb.deposito = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("\nTransação completa!!\nSaldo atualizado = "+cb.depositoConta(cb.saldo, cb.deposito));
                            break;

                    }
                    break;

                case 5:
                    System.out.println("5) Crie uma classe chamada “Pessoa” com atributos “nome” e “idade”. Implemente um\n método chamado “falar” que imprime uma mensagem com o nome da pessoa.");

                    System.out.println("Digite seu nome: ");
                    p.nome = sc.nextLine();

                    System.out.println("Digite sua idade: ");
                    p.idade = sc.nextInt();
                    sc.nextLine();

                    System.out.println(p.falar());
                    break;


                case 6:
                    System.out.println("6) Crie uma classe chamada “Produto” com atributos “nome”, “preco” e “quantidade”. Implemente um\nmétodo chamado “calcular_total” que retorna o valor total do produto (preço * quantidade).");

                    System.out.println("Vamos calcular suas compras: \nDigite o nome do produto que deseja comprar: ");
                    pr.nome = sc.nextLine();

                    System.out.println("Digite a quantidade: ");
                    pr.quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o valor por unidade do produto: ");
                    pr.preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("O valor final de "+pr.quantidade+ " " +pr.nome+ " é = "+pr.calculoTotal(pr.quantidade, pr.preco));
                    break;


                case 7:
                    System.out.println("7) Crie uma classe chamada “Carro” com atributos “marca”, “modelo” e “ano”. Implemente um método\n" +
                            "chamado “detalhes” que retorna uma string com as informações do carro.");

                    System.out.println("  - Digite a marca do seu carro: ");
                    crr.marca = sc.nextLine();

                    System.out.println("  - Digite o modelo do seu carro: ");
                    crr.modelo = sc.nextLine();

                    System.out.println("  - Digite o ano do seu carro: ");
                    crr.ano = sc.nextInt();

                    System.out.println(crr.detalhes());
                    break;


                case 8:
                    System.out.println("8) Crie uma classe chamada “Aluno” com atributos “nome” e “notas”. Implemente um método chamado\n" +
                            "“calcular_media” que retorna a média das notas do aluno.");


                    System.out.println("\n  - Digite seu nome: ");
                    a.nome = sc.nextLine();

                    System.out.println("Vamos calcular sua média," +a.nome+ "!\n\n  - Digite sua primeira nota: ");
                    a.nota1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("  - Digite sua segunda nota: ");
                    a.nota2 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("  - Digite sua terceira nota: ");
                    a.nota3 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Sua média ficou = "+a.calcularMedia(a.nota1, a.nota2, a.nota3));

                    System.out.println(a.resultado(a.nome, a.media, a.nota1, a.nota2, a.nota3));
                    break;


                case 9:
                    System.out.println("9) Crie uma classe chamada “Triangulo” com atributos “lado1”, “lado2” e “lado3”. Implemente um\n" +
                            "método chamado “calcular_perimetro” que retorna o perímetro do triângulo.");

                    System.out.println("\nVamos calcular o perimetro do triângulo! \n  - Digite o valor do lado 1: ");
                    t.lado1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("  - Digite o valor do lado 2: ");
                    t.lado2 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("  - Digite o valor do lado 3: ");
                    t.lado3 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("O perimetro do triângulo é = "+t.calcularPerimetro(t.lado1, t.lado2, t.lado3));


                case 10:
                    System.out.println("10) Crie uma classe chamada “Funcionario” com atributos “nome”, “salario” e “cargo”. Implemente um\n" +
                            "método chamado “aumentar_salario” que recebe um valor percentual de aumento e atualiza o salário\n" +
                            "do funcionário.");

                    System.out.println("\n Vamos iniciar!\n\n  - Digite a % que dejesa dar de aumento para os funcionarios: ");
                    f.aumento = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("\nSeus funcionários terão R$"+f.aumentarSalario(f.salario, f.aumento)+ " de aumento esse mês.");

                    System.out.println("O novo salário é de = "+f.novoSalario(f.salario, f.nSalario));


            }

            System.out.println("\n-> Para continuar, digite qualquer número.\n-> Para finalizar aperte [0].");
            i = sc.nextInt();

        }while (i != 0);

        System.out.println("end.");
        sc.close();

    }

}