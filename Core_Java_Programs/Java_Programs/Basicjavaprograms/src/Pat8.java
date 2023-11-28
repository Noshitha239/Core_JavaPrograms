public class Pat8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        for (int i=1;i<=n;i++) {
        	for(int j=1;j<=2*i-1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        int a=4;int k=7;
	    for (int i=1;i<=a;i++) {
    	   for(int j=k;j>=2*i-1;j--) {
        	  System.out.print("*");
       	}
        System.out.println();
	   }  
	}
}
