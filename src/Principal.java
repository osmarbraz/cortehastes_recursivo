/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplina: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 *
 * Página 265 Thomas H. Cormen 3 ed
 *
 * Corte de Hastes Recursivo/Cut Rod Recursive
 *
 * Atenção:
 * Vetor em java inicia em 0, os algoritmos consideram início em 1.
 * A subtração de -1 ocorre somente no local de acesso ao vetor ou matriz 
 * para manter a compatibilidade entre os algoritmos.
 * 
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {
    
    /**
     * Retorna o maior valor entre dois valores inteiros.
     * 
     * Em java pode ser utilizando Math.max(int a, int b)
     *
     * @param a primeiro valor inteiro.
     * @param b segundo valor inteiro.
     * @return o maior valor entre os a e b
     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Cortes de Hastes/Cut Rod.     
     * 
     * @param p Preços das hastes.     
     * @param n Tamanho da haste.  
     * @return Máxima receita possível para uma haste de comprimento n.
     */
    public static int corteDeHastes(int[] p, int n) {
         if(n==0){
             return 0;
         } 
         int q = Integer.MIN_VALUE;
         for(int i=1; i<=n;i++){
             q = max(q,p[i-1]+corteDeHastes(p,n-i));
         }
         return q;
    }

    public static void main(String args[]) {
        
        //Vetor dos dados com os preços das hastes   
        int p[] = {1,5,8,9,10,17,17,20,24,30};

        //Tamanho da astes
        int n = 10;

        System.out.println(">>> Corte de Hastes Recursivo/Cut Rod Recursive <<<");       
               
        int q = corteDeHastes(p, n);        
        System.out.println("Receita máxima para n=" + n + " é " + q);        
        
        n = 7;
        q = corteDeHastes(p, n);        
        System.out.println("\nReceita máxima para n=" + n + " é " + q);        
    }
}