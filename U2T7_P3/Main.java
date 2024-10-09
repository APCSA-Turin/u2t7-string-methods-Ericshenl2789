public class Main {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        String str = "Mango";
        System.out.println(methods.longerThan(str,4));
        System.out.println(methods.funnyString(str,3));
        System.out.println(methods.halvesReversed(str));
        System.out.println(methods.pigLatin(str));
        System.out.println(methods.removeCharacter(str, 1));
        System.out.println(methods.insertAt(str, "fruit flies like a ", "M"));
        System.out.println(methods.endUp(str, 2));
        System.out.println(methods.yellOrWhisper(str));
    }
}