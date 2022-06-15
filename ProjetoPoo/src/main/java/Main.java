import br.inatel.cdg.Exception.EstoqueEsgotadoException;
import br.inatel.cdg.LojaDeRoupas.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        int menu; // vestido, calca, blusa, saia
        int menu2 = 10;// Sair, adicionar, remover

        // Instanciando Classes
        Estoque estoque = new Estoque();
        Vestido vestido = new Vestido();
        Calca calca = new Calca();
        Saia saia = new Saia();
        Blusa blusa = new Blusa();

        do
        {
            try {
                System.out.println("0 - Sair");
                System.out.println("1 - Adicionar peca");
                System.out.println("2 - Remover peca");
                System.out.println("3 - Mostrar todas a pecas");
                menu2 = entrada.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Opcao invalida");
                menu2 = 0;
            }

            // SAIR
            if(menu2 == 0)
            {
                System.out.println("Voce saiu");
            }
            // ADICIONAR PEÇA
            else if (menu2 == 1)
            {
                System.out.println("1 - Vestido");
                System.out.println("2 - Calca");
                System.out.println("3 - Saia");
                System.out.println("4 - Blusa");

                menu = entrada.nextInt();
                entrada.nextLine();

                // Adicionando itens
                switch(menu)
                {
                    // VESTIDO
                    case 1:

                        System.out.println("Nome: ");
                        vestido.setNome(entrada.nextLine());
                        System.out.println("Digite o preco: ");
                        vestido.setPreco(entrada.nextFloat());
                        entrada.nextLine();
                        System.out.println("Digite o tamanho: ");
                        vestido.setTamanho(entrada.nextLine());
                        System.out.println("Digite a quantidade: ");
                        vestido.setQuantidade(entrada.nextInt());
                        entrada.nextLine(); // Estou indo de inteiro para string, da erro
                        System.out.println("Digite a Cor: ");
                        vestido.setCor(entrada.nextLine());

                        estoque.adicionaPecas(vestido);
                        break;

                    // CALÇA
                    case 2:

                        System.out.println("Nome: ");
                        calca.setNome(entrada.nextLine());
                        System.out.println("Digite o preco: ");
                        calca.setPreco(entrada.nextFloat());
                        entrada.nextLine();
                        System.out.println("Digite o tamanho: ");
                        calca.setTamanho(entrada.nextLine());
                        System.out.println("Digite a quantidade: ");
                        calca.setQuantidade(entrada.nextInt());
                        entrada.nextLine(); // Estou indo de inteiro para string, da erro
                        System.out.println("Digite a Cor: ");
                        calca.setCor(entrada.nextLine());

                        estoque.adicionaPecas(calca);
                        break;

                    // SAIA
                    case 3:

                        System.out.println("Nome: ");
                        saia.setNome(entrada.nextLine());
                        System.out.println("Digite o preco: ");
                        saia.setPreco(entrada.nextFloat());
                        entrada.nextLine();
                        System.out.println("Digite o tamanho: ");
                        saia.setTamanho(entrada.nextLine());
                        System.out.println("Digite a quantidade: ");
                        saia.setQuantidade(entrada.nextInt());
                        entrada.nextLine(); // Estou indo de inteiro para string, da erro
                        System.out.println("Digite a Cor: ");
                        saia.setCor(entrada.nextLine());

                        estoque.adicionaPecas(saia);
                        break;

                    // BLUSA
                    case 4:

                        System.out.println("Nome: ");
                        blusa.setNome(entrada.nextLine());
                        System.out.println("Digite o preco: ");
                        blusa.setPreco(entrada.nextFloat());
                        entrada.nextLine();
                        System.out.println("Digite o tamanho: ");
                        blusa.setTamanho(entrada.nextLine());
                        System.out.println("Digite a quantidade: ");
                        blusa.setQuantidade(entrada.nextInt());
                        entrada.nextLine(); // Estou indo de inteiro para string, da erro
                        System.out.println("Digite a Cor: ");
                        blusa.setCor(entrada.nextLine());

                        estoque.adicionaPecas(blusa);
                        break;

                    default:
                        System.out.println("Valor invalido");
                        break;
                }
             }
            // REMOVER PEÇA
            else if(menu2 == 2)
            {
                System.out.println("1 - Vestido");
                System.out.println("2 - Calca");
                System.out.println("3 - Saia");
                System.out.println("4 - Blusa");

                menu = entrada.nextInt();
                entrada.nextLine();

                switch (menu)
                {
                    case 1:

                        estoque.tiraPeca(vestido);
                        break;

                    case 2:

                        estoque.tiraPeca(calca);
                        break;
                    case 3:

                        estoque.tiraPeca(saia);
                        break;
                    case 4:

                        estoque.tiraPeca(blusa);
                        break;
                }

            }
            else if (menu2 == 3){

                try {
                    estoque.verificaQuantidadePecas();
                } catch (EstoqueEsgotadoException e){
                    System.out.println("Estoque Esgotado");
                }

            }
            else
                System.out.println("Valor invalido");
        }
        while(!(menu2 == 0));

        // Fechando entrada de dados
        entrada.close();
    }
}


