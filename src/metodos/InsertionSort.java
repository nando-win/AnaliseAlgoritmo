package metodos;

import java.util.Random;

public class InsertionSort {

//	private int v[];   
//    public void preencheV()  
//    {  
//        v = new int[100]; //inicializa o array com 100 posições
//        for(int i=0; i<v.length; i++)  
//        {  
//           v[i] = (int)(Math.random() *100); // atribui o valor aleatório à posição i      
//       }  
//   }  
//    
	public static void main(String[] args) {
		
		int[] arr1 = new int[10]; //cria um array com 100 itens
		Random r = new Random();	//declara uma variável randômica
		for (int x = 0; x < 10; x++) { 
		   arr1[x] = r.nextInt();	//atribui uma variável randomica para cada espaço no array arr1
		}
		
        int[] arr2 = doInsertionSort(arr1); //arr2 recebe variáveis do arr1
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        
		}
    }
     
    public static int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j]; //variável tempo recebe menor valor lido de j
                    input[j] = input[j-1];	//j recebe o menor valor consecutivo a ele
                    input[j-1] = temp; //temp começa a leitura logo após N-1
                }
            }
        }
        return input;

//		for (int i = 0; i < array.length; i++)  {
//		    int a = array[i];  
//		    for (int j = i - 1; j >= 0 & array[j] > a; j--)   {  // loop for utilizando o operador Condicional E comum (bitwise)
//		        array[j + 1] = array[j];  
//		        array[j] = a;  
//		    }                         
//		}
		
	}

}
//Fonte: http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
// http://www.guj.com.br/t/gerar-1000-numeros-aleatorios-em-um-array/75738/2