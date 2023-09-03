public class Constructor7 {
    Constructor7(int n, String name) {
        System.out.println("Constructor will be invoked");
        int num = n;
        String str = name;
        char c = 'K';
        System.out.println("Class variables are initialized");
        System.out.println(num);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Constructor7 tc = new Constructor7(12, "Vinesh");
        Constructor7 tc2 = new Constructor7(15, "Karan");
    }
}
