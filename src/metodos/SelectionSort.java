package metodos;

import java.util.Random;

public class SelectionSort {
	
	public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

	public static void main(String[] args) {

		int[] arr1 = new int[10]; //cria um array com 10 itens
		Random r = new Random();	//declara uma variável randômica
		for (int x = 0; x < 10; x++) { 
		   arr1[x] = r.nextInt();	//atribui uma variável randomica para cada espaço no array arr1
		}
		 int[] arr2 = doSelectionSort(arr1); //arr2 recebe variáveis do arr1
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(", ");
	        
			}
		
	}

}

// Fonte: http://www.java2novice.com/java-sorting-algorithms/selection-sort/
// http://www.guj.com.br/t/gerar-1000-numeros-aleatorios-em-um-array/75738/2