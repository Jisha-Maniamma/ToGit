package Day17.program2;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/26 13:54
 */
public class subString {
    public static final String nameMain="ascascasdasdascascasdasdascascasdasd";
    public static void main(String[] args) {
        int a="ascascasdasd".length();
        String Croppedname= nameMain.substring(a);
        System.out.println(Croppedname);

        String name="Jisha";
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
    }
}
class getname{
    String name;

}
