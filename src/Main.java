public class Main {

    public static int average(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static double harmonicNumber(int n){
        double sum =  0;
        for(double i = 1; i <= n; i++){
            sum += (1/i);
        }
        return sum;
    }
    public static void main(String[] args) {

        int[] arr1 = {23, 4, 56, 78, 98, 102, -42, 78};
        int[] arr2 = {-67, -45, 12, 4, 9};

        System.out.println("İlk arrayin ortalamas : " + average(arr1));
        System.out.println("İkinci arrayin ortalaması : " + average(arr2));

        double harmonic = harmonicNumber(arr1.length);

        System.out.println("İlk Arrayin Harmonic Ortalaması : " + arr1.length/harmonic);
        harmonic = harmonicNumber(arr2.length);
        System.out.println("İkinci Arrayin Harmonic Ortalaması : " + arr2.length/harmonic);
    }
}
