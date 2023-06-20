import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 10) + 1;
            list.add(randomNumber);
        }
        System.out.println("Dãy số random được là: "+list);
        int temp =0;
        for (int e : list) {
            if (e>temp){
                temp = e;
            }
        }
        System.out.println("số lớn nhất trong dãy số là: "+ temp);
    }
}