public class SecondOcurrence {
    public static void main(String[] args) {

    }
    public static int secondSymbol(String str, char c) {
        return str.indexOf(c,str.indexOf(c)+1);
    }
}