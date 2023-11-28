
public class Pat2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stu
        int n=5;
        int count=25;
        for (int i=1;i<=n;i++) {
        	for(int j=n;j>=i;j--) {
        		System.out.print(count+" ");
        		count--;
        	}
        System.out.println();
       }
	}

}
