
public class Unaryope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=43;
        int b= ++a + a-- + a++ - a-- - --a + a++ - a-- - --a - ++a - ++a - a-- - a-- + a++ + ++a + --a;
        System.out.println(a);
        System.out.println(b);
	}

}
