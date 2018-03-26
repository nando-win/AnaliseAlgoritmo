package metodos;

import java.util.Random;

public class MergeSort {
	
	private int[] array;
    private int[] tempMergArr;
    private int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArr = new int[10]; //cria um array com 10 itens
		Random r = new Random();	//declara uma variável randômica
		for (int x = 0; x < 10; x++) { 
			inputArr[x] = r.nextInt();	//atribui uma variável randomica para cada espaço no array inputArr
		}
		
		MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        for(int x:inputArr){
            System.out.print(x);
            System.out.print(", ");
        
		}
    }
	
	public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
	
	private void doMergeSort(int lowerIndex, int higherIndex) {
        
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
	
	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }

}
//Fonte: http://www.java2novice.com/java-sorting-algorithms/merge-sort/
//http://www.guj.com.br/t/gerar-1000-numeros-aleatorios-em-um-array/75738/2