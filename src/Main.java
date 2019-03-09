public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("Das ist ein String"));
    }
    //DailyCoding #1
    private static String reverse (final String input) {
        String output = "";
        int len = input.length();
        for (int x = (len - 1); -1 < x; x--) {
            output = output + input.charAt(x);
        }
        return (output);
    }
}