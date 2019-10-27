package br.com.andrehenriques.estruturadedados.arvoresbinarias;

import java.util.Scanner;

/**
 *
 * @author Andre Henriques
 */
public class Main {
    public static void main(String args[]) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        ArvoreBinaria2 arvore2 = new ArvoreBinaria2();
        Scanner novo = new Scanner(System.in);
        int opcao = 88;
        int valor;
        while (opcao != 0) {
            System.out.println("\n___________________________________________"
                    + "\nDigite 1 - Inserir"
                     +"\nDigite 2 - Imprimir Pre Ordem		 Digite 11 - Somar todos os nodos da arvore		Digite 20 - Grau da Arvore"	
                    + "\nDigite 3 - Imprimir Ordem		 Digite 12 - Calcular a média dos elementos		Digite 21 - Imprimir apenas as folhas"
                    + "\nDigite 4 - Imprimir Pos Ordem		 Digite 13 - Excluir Arvore				Digite 22 - Imprimir todos os nos com apenas 1 filho"
                    + "\nDigite 5 - Verificar Vazia		 Digite 14 - Grau de um no				Digite 23 - Imprimir todos os nos com 2 filhos"
                    + "\nDigite 6 - Verificar altura da árvore	 Digite 15 - Verificar Nivel do no			Digite 24 - Imprimir um No candidato a ser pai, caso o no seja excluido"
                    + "\nDigite 7 - Quantidade de nos		 Digite 16 - Somar numeros pares			Digite 25 - Remover um No da Arvore"
                    + "\nDigite 8 - Localizar Elemento		 Digite 17 - Somar numeros impares			Digite 26 - Remover um No com 1 filho"
                    + "\nDigite 9 - Localizar Maior Elemento	 Digite 18 - Calcular a quantidade de nos com 2 filhos  Digite 27 - Remover um No com 2 filhos"
                    + "\nDigite 10 - Localizar Menor Elemento	 Digite 19 - Encontrar o pai de um determinado no	Digite 28 - Inserir No na Arvore 2"
                    + "\n                                                                                                Digite 29 - Remover No na Arvore 2"
                    + "\n                                                                                                Digite 30 - Imprimir Arvore 2"
                    + "\n                                                                                                Digite 31 - Verificar se Duas Arvores sao iguais"
                    + "\n                                                                                                Digite 32 - Verificar se um elemento esta presente nas Duas Arvores"
                    + "\n______________________________");
            opcao = novo.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite um inteiro para a arvore");
                    valor = novo.nextInt();
                    arvore.inserir(valor);
                    break;
                case 2:
                    arvore.imprimirArvorePreOrdem();
                    break;
                case 3:
                    arvore.imprimirArvoreOrdem();
                    break;
                case 4:
                    arvore.imprimirArvorePosOrdem();
                    break;
                case 5:
                    if(arvore.ehVazia() == true){
                        System.out.println("A arvore está vazia");
                    }else{
                        System.out.println("A arvore não está vazia");
                    }
                    break;
                case 6:
                    System.out.println("Altura: " + arvore.getAltura());
                    break;
                case 7:
                    System.out.println("Quantidade de nos: " + arvore.getQtNo());
                    break;
                case 8:
                    System.out.println("Deseja localizar que elemento ?");
                    int localizar = novo.nextInt();
                    arvore.localizar(localizar);
                    break;
                case 9:
                    arvore.MaiorValor();
                    break;
                case 10:
                    arvore.MenorValor();
                    break;
                case 11:
                    arvore.SomarNos();
                    break;
                case 12:
                    arvore.MediaNos();
                    break;
                case 13:
                    arvore.ExcluirArvore();
                    System.out.println("Arvore excluida !");
                    break;
                case 14:
                    System.out.println("Digite o número que deseja verificar o grau");
                    int grauno = novo.nextInt();
                    arvore.GrauNo(grauno);
                    break;
                case 15:
                    System.out.println("Digite o número que deseja verificar o nivel");
                    int nivelno = novo.nextInt();
                    arvore.NiveldoNo(nivelno);
                    break;
                case 16:
                    arvore.SomarPar();
                    break;
                case 17:
                    arvore.SomarImpar();
                    break;
                case 18:
                    arvore.QuantidadeNosComDoisFilhos();
                    break;
                case 19:
                    System.out.println("Digite o valor que deseja procurar o pai");
                    int procurarpai = novo.nextInt();
                    arvore.ProcurarPai(procurarpai);
                    break;
                case 20:
                    arvore.GrauArvore();
                    break;
                case 21:
                    arvore.ImprimirFolhas();
                    break;
                case 22:
                    arvore.ImprimirNoUmFilho();
                    break;
                case 23:
                    arvore.ImprimirNoDoisFilho();
                    break;
                case 24:
                    System.out.println("Digite o no");
                    int candidatopai = novo.nextInt();
                    arvore.CandidatoPai(candidatopai);
                    break;
                case 25:
                    System.out.println("Digite o no a ser removido");
                    int removerno = novo.nextInt();
                    arvore.RemoverNo(removerno);
                    break;
                case 26:
                    System.out.println("Digite o no que deseja remover");
                    int removerno1 = novo.nextInt();
                    arvore.RemoverNoUmfilho(removerno1);
                    break;
                case 27:
                    System.out.println("Digite o no que deseja remover");
                    int removerno2 = novo.nextInt();
                    arvore.RemoverNoDoisfilhos(removerno2);
                    break;
                case 28:
                    System.out.println("Digite um inteiro para a arvore");
                    valor = novo.nextInt();
                    arvore2.inserir(valor);
                    break;
                case 29:
                    System.out.println("Digite o no a ser removido");
                    int removernoA2 = novo.nextInt();
                    arvore2.RemoverNo(removernoA2);
                    break;
                case 30:
                    arvore2.imprimirArvoreOrdem();
                    break;
                case 31:
                    arvore.ArvoresIguaiz(arvore.raiz, arvore2.raiz2);
                    break;
                case 32:
                    System.out.println("Digite o valor");
                    int presentenas2 = novo.nextInt();
                    if(arvore.PresenteNas2(arvore.raiz, presentenas2) == true && (arvore2.PresenteNas2(arvore2.raiz2, presentenas2))== true){
                        System.out.println("O valor está presente nas duas arvores");
                    }else{
                        System.out.println("O valor nao esta presente em uma das arvores ou nao existe");
                    }
            } 
        }
    }
}
