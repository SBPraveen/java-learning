public class Les4 {
    public static void main(String[] args) {
        String name = "yesbee";
        name = "Hii " + name;

        String s1 = "sb";
        String s2 = "sb";

        System.out.println(s1 == s2);
        // true

        //|| String buffer
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        // 16
        StringBuffer sb = new StringBuffer("yesBee");
        System.out.println(sb.capacity());
        //22
        sb.append("Hii");
        System.out.println(sb);

        //|| string buffer to string
        String str = sb.toString();
        System.out.println(str);
    }
}
