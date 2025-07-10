public class printnuminincrease {
    
    public static void pritnInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        pritnInc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args){
        int n = 5;
        pritnInc(n);
    }

    
}
