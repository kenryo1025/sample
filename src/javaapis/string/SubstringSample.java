package javaapis.string;

public class SubstringSample {
    public static void main(String[] args) {
        String str = "100ドル";
        String sub = str.replaceAll("ドル","円");
        System.out.println(sub);
    }
}
