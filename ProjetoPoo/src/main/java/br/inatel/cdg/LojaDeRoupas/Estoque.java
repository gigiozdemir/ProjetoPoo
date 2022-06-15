package br.inatel.cdg.LojaDeRoupas;

import br.inatel.cdg.Exception.EstoqueEsgotadoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque
{

    List<Roupas> listDeRoupas = new ArrayList<Roupas>();
    Scanner in = new Scanner(System.in);
    private int encomenda = 0;


    public void adicionaPecas(Roupas roupa)
    {
        listDeRoupas.add(roupa);
    }

    public void tiraPeca(Roupas roupa)
    {
        if (roupa.getNome() == null) {
            System.out.println("Não é possivel remover");

        }else{
            listDeRoupas.remove(roupa);
        }

    }

    // mostra Info
    public void verificaQuantidadePecas() throws EstoqueEsgotadoException {

        if (listDeRoupas.size() == 0){
            throw new EstoqueEsgotadoException("Estoque esgotado");
        } else {
            System.out.println("Quantidade de peças no estoque: "+listDeRoupas.size());

            for (int i = 0; i < listDeRoupas.size(); i++)
            {
                System.out.println("Nome:"+listDeRoupas.get(i).getNome());
                System.out.println("Preco: " + listDeRoupas.get(i).getPreco());
                System.out.println("Tamanho: " + listDeRoupas.get(i).getTamanho());
                System.out.println("Quantidade: " + listDeRoupas.get(i).getQuantidade());
                System.out.println("Cor: " + listDeRoupas.get(i).getCor());

            }
        }

    }
}
