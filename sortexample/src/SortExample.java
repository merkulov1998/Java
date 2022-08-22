public class SortExample {
    public static void main(String[] args){
        int[] numbers = {40, 7, 59, 4, 1};//объявление массива чисел
        displayValues(numbers);//вызов метода displayValues
        //вызов метода последовательного поиска
        //sequentialSearch(numbers, 13);
       // sequentialSearch(numbers, 7);
        binarySearch(numbers, 7);
        selectionSort(numbers);//сортировка выбором
        int found = binarySearch(numbers, 7);
        if(found!=-1)
            System.out.println("The value is found at position "+found);
        else
            System.out.println("The value is not found");
        //binarySearch(numbers, 7);
        //bubbleSort(numbers);//сортировка пузырьком
        //displayValues(numbers);//отображение отсортированного массива
    }//end method main
    static int binarySearch(int[] numbers, int value){
        int low=0;
        int high=numbers.length-1;
        while(high>=low){
            int middle=(low+high)/2;//средний индекс
            if(numbers[middle]==value){
                //System.out.println("The number "+value+" is at position "+middle+" in the list");
                return middle;//искомое значение было найдено
            }//end if
            if(numbers[middle]<value){
                low=middle+1;
            }//end if
            if(numbers[middle]>value){
                high=middle-1;
            }//end if
        }//end while
        return -1;
        //System.out.println("The number "+value+" is not in the list");//значение не было найдено
    }//end method binarySearch
    static void sequentialSearch(int[] numbers, int value){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==value){
                System.out.println("The number "+value+" is at position "+i+" in the list");
                return;
            }//end if
        }//end for
        System.out.println("The number "+value+" is not in the list");
    }//end method sequentialSearch
    static void bubbleSort(int[] numbers){
        for(int j=0; j<numbers.length; j++){
            for(int i=0; i<numbers.length-1; i++){
                //если значения не отсортированы
                if(numbers[i]>numbers[i+1]){
                    //перестановка значений
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }//end if
            }//end for
        }//end for
    }//end method bubbleSort
    static void selectionSort(int[] numbers){
        int indexMin=0;//индекс минимального числа
        for(int i=0; i<numbers.length; i++){
            indexMin=i;
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[j]<numbers[indexMin]){//если находим меньшее число, принимаем его как минимальное
                    indexMin=j;
                }//end if
            }//end for
        //Имеется индекс наименьшего числа, и можно заменить значения
            int temp = numbers[i];//используем переменную temp для хранения значения
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }//end for
    }//end method selectionSort
    static void displayValues(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");//отображение содержимого
        }//end for
        System.out.println("\n");
    }//end method displayValues
}//end class SortExample
