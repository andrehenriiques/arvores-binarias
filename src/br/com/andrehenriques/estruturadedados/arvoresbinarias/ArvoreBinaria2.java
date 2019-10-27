package br.com.andrehenriques.estruturadedados.arvoresbinarias;

/**
 *
 * @author Andre Henriques
 */
public class ArvoreBinaria2 {

    static No raiz2;

    public boolean ehVazia() {
        if (raiz2 == null) {
            return true;
        } else {
            return false;
        }
    }

    private int getAltura(No raiz) {
        if (raiz == null) {
            return 0;
        }
        int altEsq = getAltura(raiz.getNoEsquerdo());
        int altDir = getAltura(raiz.getNoDireita());
        if (altEsq > altDir) {
            return altEsq + 1;
        } else {
            return altDir + 1;
        }
    }

    public int getAltura() {
        return getAltura(this.raiz2);
    }

    private int getQtNo(No raiz) {
        if (raiz == null) {
            return 0;
        }
        int qtNoEsq = getQtNo(raiz.getNoEsquerdo());
        int qtNoDir = getQtNo(raiz.getNoDireita());

        return qtNoEsq + qtNoDir + 1;
    }

    public int getQtNo() {
        return getQtNo(this.raiz2);
    }

    private void imprimirArvoreOrdem(No no) {
        if (no.getNoEsquerdo() != null) {
            imprimirArvorePosOrdem(no.getNoEsquerdo());
        }
        System.out.println("No: " + no.getValor());
        if (no.getNoDireita() != null) {
            imprimirArvorePosOrdem(no.getNoDireita());
        }
    }

    public void imprimirArvoreOrdem() {
        if (this.raiz2 == null) {
            System.out.println("Arvore Vazia");
        } else {
            imprimirArvoreOrdem(this.raiz2);
        }
    }

    private void inserir(No no, int valor) {
        if (this.raiz2 == null) {
            this.raiz2 = new No(valor);
        } else {
            if (valor < no.getValor()) {
                if (no.getNoEsquerdo() != null) {
                    inserir(no.getNoEsquerdo(), valor);
                } else {
                    no.setNoEsquerdo(new No(valor));
                }
            } else if (valor > no.getValor()) {
                if (no.getNoDireita() != null) {
                    inserir(no.getNoDireita(), valor);
            } else {
                no.setNoDireita(new No(valor));
            }
        }

    }
        
    }

    public void inserir(int valor) {
        inserir(this.raiz2, valor);
    }
    
     public boolean localizar (No no, int valor){
		if(no == null){
			return false;
		}
		if(no.getValor() == valor){
			return true;
		} else{
			if(no.getValor() < valor){
				return localizar(no.getNoDireita(), valor);
			}else{
				return localizar(no.getNoEsquerdo(), valor);
			}
		}
	}

    public void localizar(int valor) {
        if (this.raiz2 == null) {
            System.out.println("Arvore Vazia");
        }  if (localizar(this.raiz2, valor) == true) {
            System.out.println("Valor existe na árvore !");
        } else {
            System.out.println("Valor não existe na árvore");
        }
    }

    private No MaiorValor(No no) {  
        if (no != null) {  
            while (no.getNoDireita() != null) {  
                no = no.getNoDireita();  
            }  
        }
        return no;  
    }
	
    public void MaiorValor (){
		if (ehVazia()){
			System.out.println("A Arvore está vazia");
		} else {
		System.out.println("Maior: " + MaiorValor(raiz2).getValor());
		}
	}
    
    private No MenorValor(No no) {  
        if (no != null) {  
            while (no.getNoEsquerdo() != null) {  
                no = no.getNoEsquerdo();  
            }  
        }
        return no;  
    }
	
    public void MenorValor (){
		if (ehVazia()){
			System.out.println("A Arvore está vazia");
		} else {
		System.out.println("Menor: " + MenorValor(raiz2).getValor());
		}
	}
    
    public int SomarNos(No no){
		if (no != null){
			return no.getValor() + SomarNos(no.getNoEsquerdo()) + SomarNos(no.getNoDireita());
		} else{
			return 0;
		}
	}
	
    public void SomarNos(){
		if (SomarNos(raiz2) == 0){
			System.out.println("Arvore está vazia");
		} else{
			System.out.println("Soma:" + SomarNos(raiz2));
		}
	}
    
        
    public void MediaNos (){
		if (ehVazia()){
			System.out.println("A Arvore está vazia");
		} else {
		int media = SomarNos(raiz2)/getQtNo(raiz2);
		System.out.println("Média dos Nos: " + media);
		}
	}    
    
    private void imprimirArvorePreOrdem(No no) {
        System.out.println("No: " + no.getValor());
        if (no.getNoEsquerdo() != null) {
            imprimirArvorePreOrdem(no.getNoEsquerdo());
        }
        if (no.getNoDireita() != null) {
            imprimirArvorePreOrdem(no.getNoDireita());
        }
    }

    public void imprimirArvorePreOrdem() {
        if (this.raiz2 == null) {
            System.out.println("Arvore Vazia");
        } else {
            imprimirArvorePreOrdem(this.raiz2);
        }
    }
    
    private void imprimirArvorePosOrdem(No no) {
        if (no.getNoEsquerdo() != null) {
            imprimirArvorePosOrdem(no.getNoEsquerdo());
        }
        if (no.getNoDireita() != null) {
            imprimirArvorePosOrdem(no.getNoDireita());
        }
        System.out.println("No: " + no.getValor());
    }

    public void imprimirArvorePosOrdem() {
        if (this.raiz2 == null) {
            System.out.println("Arvore Vazia");
        } else {
            imprimirArvorePosOrdem(this.raiz2);
        }
    }
    
    public void ExcluirArvore(){
        raiz2 = null;
    }
    
    public int GrauNo (No no, int valor){
        int contadorgrau = 0;
        if (no.getNoDireita() != null){
            contadorgrau ++;
        }
        if (no.getNoEsquerdo() != null){
            contadorgrau ++;
        }
        return contadorgrau;
    }
    
    public void GrauNo (int valor){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            System.out.println("O grau do nome é: " + GrauNo(this.raiz2, valor));
        }
    }
    
    public int NiveldoNo(No no, int elemento){
        int nivel = 0;
        while (no != null && no.getValor()  != elemento){
                if (elemento < no.getValor()) {
                        no = no.getNoEsquerdo();
                } else{
                        no = no.getNoDireita();
                }
                nivel++;
        }
             return nivel+1;
     }
    
    public void NiveldoNo (int valor){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            System.out.println("O nivel do no é: " + NiveldoNo(this.raiz2, valor));
        }
    }
    
    public int SomarPar(No no){
        int par = 0;
		if (no != null){
                    if ((no.getValor() % 2) == 0){
			par += no.getValor() + SomarPar(no.getNoEsquerdo())+ SomarPar(no.getNoDireita());
		} else{
			return SomarPar(no.getNoEsquerdo()) + SomarPar(no.getNoDireita());
		}
	}
       return par;
    }
    
    public void SomarPar (){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            System.out.println("A soma dos numeros pares: " + SomarPar(this.raiz2));
        }
    }
    
    public int SomarImpar(No no){
        int impar = 0;
		if (no != null){
                    if ((no.getValor() % 2) != 0){
			impar += no.getValor() + SomarImpar(no.getNoEsquerdo())+ SomarImpar(no.getNoDireita());
		} else{
			return SomarImpar(no.getNoEsquerdo()) + SomarImpar(no.getNoDireita());
		}
	}
       return impar;
    }
    
    public void SomarImpar (){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            System.out.println("A soma dos numeros impares: " + SomarImpar(this.raiz2));
        }
    }
    
    public int ProcurarPai (No no, int valor){
        no = raiz2;
        No perc = null;
        while(no != null && !(no.getValor() == valor)){
            perc = no;
            if (no.getValor() > valor){
                no = no.getNoEsquerdo();
            }else{
                no = no.getNoDireita();
            }
        }
        if (no!=null && no.getValor() == valor){
	    	   return perc.getValor();  
        }
        return 0;
    }
    
    public void ProcurarPai(int valor){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            System.out.println("O pai do valor é: " + ProcurarPai(raiz2, valor));
        }
    }
    
    public int QuantidadeNosComDoisFilhos(No no){
        while (no != null){
            if (no.getNoEsquerdo() != null && no.getNoDireita() != null){
                return 1+QuantidadeNosComDoisFilhos(no.getNoEsquerdo()) + QuantidadeNosComDoisFilhos(no.getNoDireita());
            }else{
                return 0+ QuantidadeNosComDoisFilhos(no.getNoEsquerdo()) + QuantidadeNosComDoisFilhos (no.getNoDireita());
            }
        }
        return 0;
    }
    
    public void QuantidadeNosComDoisFilhos(){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            System.out.println("Quantidade de nos com 2 filhos: " + QuantidadeNosComDoisFilhos(raiz2));
        }
    }
    
    public int GrauArvore(No no){
		if (no != null){
			if (no.getNoEsquerdo() == null && no.getNoDireita() == null){
				return 0;
			} else if (QuantidadeNosComDoisFilhos(no) > 0){
				return 2;
			} else if (QuantidadeNosComDoisFilhos(no) == 0){
				return 1;
			}
		}
		return -1;
	}
    
    public void GrauArvore(){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            System.out.println("O grau da arvore e: "+GrauArvore(raiz2));
        }
    }
    
    public void ImprimirFolhas (No no){
        if (no != null) {
                if (GrauNo(no, no.getValor()) == 0) {
                        System.out.print(no.getValor() + " ");
                        ImprimirFolhas(no.getNoDireita());
                        ImprimirFolhas(no.getNoEsquerdo());
                } else if (GrauNo(no, no.getValor()) != 0) {
                        ImprimirFolhas(no.getNoDireita());
                        ImprimirFolhas(no.getNoEsquerdo());

                }
        }
	}
    
    public void ImprimirFolhas(){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            ImprimirFolhas(raiz2);
        }
    }
    
    public void ImprimirNoUmFilho (No no){
		if (no != null) {
			if (GrauNo(no, no.getValor()) == 1) {
				System.out.print(no.getValor()+ " ");
				ImprimirNoUmFilho(no.getNoDireita());
				ImprimirNoUmFilho(no.getNoEsquerdo());

			}else if (GrauNo(no, no.getValor()) != 1) {
				ImprimirNoUmFilho(no.getNoDireita());
				ImprimirNoUmFilho(no.getNoEsquerdo());
			}
		}
    } 
    
    public void ImprimirNoUmFilho(){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            ImprimirNoUmFilho(raiz2);
        }
    }
    
/*    public int ImprimirNoDoisFilho (No no){
        if (no != null){
                if (no.getNoEsquerdo()!= null && no.getNoDireita()!= null){
                        return 1 + ImprimirNoDoisFilho(no.getNoDireita()) + ImprimirNoDoisFilho(no.getNoEsquerdo());

                } else{
                        return 0+ ImprimirNoDoisFilho(no.getNoDireita()) + ImprimirNoDoisFilho(no.getNoEsquerdo());
                }
        } else{
                return 0;
        }
    }*/
    
    public void ImprimirNoDoisFilho (No no){
        if (no != null) {
                if (GrauNo(no, no.getValor()) == 2) {
                        System.out.print(no.getValor()+ " ");
                        ImprimirNoDoisFilho(no.getNoDireita());
                        ImprimirNoDoisFilho(no.getNoEsquerdo());
                }
                else if (GrauNo(no, no.getValor()) != 2) {
                        ImprimirNoDoisFilho(no.getNoDireita());
                        ImprimirNoDoisFilho(no.getNoEsquerdo());
                }
        }
	}
    
    public void ImprimirNoDoisFilho(){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            ImprimirNoDoisFilho(raiz2);
        }
    }
    
    public No CandidatoPai(No no, int valor) {
		if (this.raiz2 == null) {
			System.out.println("Arvore vazia");
		} else if (valor == raiz2.getValor() && raiz2.getNoEsquerdo()== null && raiz2.getNoDireita()== null) {
			System.out.println("O valor é a raiz");
		} else {
			if (valor < no.getValor()) {
				no.setNoEsquerdo(CandidatoPai(no.getNoEsquerdo(), valor));
			} else if (valor > no.getValor()) {
				no.setNoDireita(CandidatoPai(no.getNoDireita(), valor));
			} else if (no.getNoEsquerdo() != null && no.getNoDireita() != null) {
				System.out.println("O candidato a ser pai de " + no.getValor() + " e: " + EncontrarMax(no.getNoEsquerdo()).getValor());
			} else if (no.getNoEsquerdo() == null && no.getNoDireita() != null) {
				System.out.println("O candidato a ser pai de " + no.getValor() + " e: " + EncontrarMin(no.getNoDireita()).getValor());
			} else if (no.getNoEsquerdo() != null && no.getNoDireita() == null) {
				System.out.println("O candidato a ser pai de " + no.getValor() + " e: " + EncontrarMax(no.getNoEsquerdo()).getValor());
			} else {
				System.out.println("E um no folha! ");
			}
		}
		return no;
	}
    
    public No EncontrarMax(No no) {
		if (no != null) {
			while (no.getNoDireita() != null) {
				no = no.getNoDireita();
			}
		}
		return no;
    }
    
    public No EncontrarMin(No no) {  
        if (no != null) {  
            while (no.getNoEsquerdo() != null) {  
                no = no.getNoEsquerdo();  
            }  
        }  
        return no;  
    }
    
    public void CandidatoPai(int valor){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            CandidatoPai(raiz2, valor);
        }
    }
    
    public No RemoverNos (No no){
            No nos, aux;
            if(no.getNoEsquerdo() == null){
                    aux = no.getNoDireita();
                    return aux;
            }
            nos = no;
            aux = no.getNoEsquerdo();
            while(aux.getNoDireita() != null){
                    nos = aux;
                    aux = aux.getNoDireita();
            }
            if(nos != no){
                    nos.setNoDireita(aux.getNoEsquerdo());
                    aux.setNoEsquerdo(no.getNoEsquerdo());
            }
            aux.setNoDireita(no.getNoDireita());
            return aux;
    }
    
    public int RemoverNo(No no, int valor){
            if(ehVazia()){
                    return 0;
            }
            No anterior = null;
            No nos = raiz2;
            while(nos != null){
                    if(valor == nos.getValor()){
                            if(nos == raiz2){
                                    raiz2 = RemoverNos(nos);
                            }else{
                                    if(anterior.getNoDireita() == nos)
                                    anterior.setNoDireita(RemoverNos(nos));					
                                    else{
                                            anterior.setNoEsquerdo(RemoverNos(nos));					}
                                    }
                            return 1;
                    }
                    anterior = nos;
                    if(valor > nos.getValor()){
                            nos = nos.getNoDireita();
                    }else{
                            nos = nos.getNoEsquerdo();
                    }
            }
            return -1;
    }
    
    public void RemoverNo(int valor){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            RemoverNo(raiz2,valor);
            System.out.println("No Removido !");
        }
    }
    
    public boolean RemoverNoUmFilho(No no, int valorno){
        if(ehVazia()){
            return false;
        }
        if (GrauNo(no, valorno) == 1){
            RemoverNo(no,valorno);
            return true;
        }else if(GrauNo (no, valorno) == 2){
            System.out.println("Este no tem dois filhos");
            return false;
        }else if(GrauNo (no, valorno) == 0){
            System.out.println("Este no nao tem filhos");
            return false;
        }
        return false;
    }
    
    public void RemoverNoUmfilho(int valor){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            if(RemoverNoUmFilho(raiz2,valor)== true){
                System.out.println("No com um filho removido com sucesso");
            }else{
                System.out.println("No nao removido");
            }
        }
    }
    
    public boolean RemoverNoDoisFilhos(No no, int valorno){
        if(ehVazia()){
            return false;
        }
        if (GrauNo(no, valorno) == 2){
            RemoverNo(no,valorno);
            return true;
        }else if(GrauNo (no, valorno) == 1){
            System.out.println("Este no tem dois filhos");
            return false;
        }else if(GrauNo (no, valorno) == 0){
            System.out.println("Este no nao tem filhos");
            return false;
        }
        return false;
    }
    
    public void RemoverNoDoisfilhos(int valor){
        if (this.raiz2 == null){
            System.out.println("Arvore Vazia");
        }else{
            if(RemoverNoDoisFilhos(raiz2,valor)== true){
                System.out.println("No com um filho removido com sucesso");
            }else{
                System.out.println("No nao removido");
            }
        }
    }
    
    public boolean ArvoresIguais (No no, No nos){
        if(no == null && nos == null){
                        return true;
                }
                if(no == null || nos == null){
                        return false;
                }
                if(no.getValor() != nos.getValor()){
                        return false;
                }
                return ArvoresIguais(no.getNoEsquerdo(),nos.getNoEsquerdo()) && ArvoresIguais(no.getNoDireita(),nos.getNoDireita());
        }
    
    public void ArvoresIguaiz(No no, No no2){
		  if (ArvoresIguais(no, no2)){
			  System.out.println("As Arvores são iguais");
		  } else{
			  System.out.println("As Arvores são diferentes");
		  }
	  }
    
    public boolean PresenteNas2(No no, int valor){
        if (localizar(no, valor) == true){
            return true;
        }else{
            return false;
        }
    }
    
    }