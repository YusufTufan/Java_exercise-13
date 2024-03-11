public class Kesisim {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {2,4,7,5,6};
        int [] array3 = intersection(array1, array2);
        for (int k = 0; k < array3.length; k++) {
            System.out.print(array3[k]+" ");
        }   
    }
    public static int[] intersection (int[] array1, int [] array2){
        int[] birleşik_dizi = new int[array1.length];
        int index = 0;

        for (int i = 0; i<array1.length ; i++){
            int sayi1 = array1[i];
            for(int j = 0; j<array2.length ; j++){
                int sayi2 = array2[j];
                if (sayi1 ==sayi2){
                    birleşik_dizi[index++] = sayi1;
                    break;
                }
            }
        }
        int[] intersection = new int[index];
        for (int i = 0; i < index; i++) {
            intersection[i] = birleşik_dizi[i];
        }
        return intersection;
    }
}