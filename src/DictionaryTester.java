/*
Trent Blair
2/15/22
The purpose of this program is to test the dictionary class
 */
public class DictionaryTester {
    public static void main(String[] args) {
        Dictionary tester = new Dictionary();

        System.out.println(tester.size()+ "  testing size, should be zero");
        tester.put("abcdef", "A");
        System.out.println(tester.isEmpty()+ "  testing isEmpty should say false");
        System.out.println(tester.contains("bcd")+ "  Should say false for contains");
        System.out.println(tester.contains("abcdef")+ "  Should say true for contains");
        tester.put("12345", "B");

        System.out.println(tester.size()+ "  Should say 2");
        System.out.println(tester.get("abcdef")+ "  should get A");
        System.out.println(tester.get("12345")+ "  should get B");

        System.out.println(tester.values()+ "  Should give A and B");
        System.out.println(tester.keys()+ "  Should give both abcdef and 12345");

        tester.remove("abcdef");
        System.out.println(tester.keys()+ "  should get rid of the abcdef");

        tester.remove("12345");
        System.out.println(tester.isEmpty()+ "  should return true because everything is removed");
    }
}
