package Test;

public class DuplicatedClass {
    static int[] dup1 = {1, 2, 3, 4, 5};
    static int[] dup2 = {1, 2, 3, 1, 5};

    public static boolean duplicatesOnMass(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(duplicatesOnMass(dup2));
    }
}
