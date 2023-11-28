import java.util.Arrays;
import java.util.Scanner;
public class MaxnoofChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s1=sc.nextLine();
		char str[]=s1.toCharArray();
		int len[]=new int[s1.length()];
		for(int i=0;i<s1.length();i++){
			len[i]=1;
			for(int j=i+1;j<s1.length();j++){
				if(str[i]==str[j]) {
					len[i]++;
					str[j]=0;
				}
			}
		}
		for(int i=0;i<len.length;i++){
			if(str[i]==' '||str[i]==0){	
			}
			else{
				System.out.println(str[i]+"---"+len[i]);
			}
		}
       /* for(int i=0;i<=len.length;i++) {
        	for(int j=i+1;j<len.length;j++) {
        	int temp=0;
        		if(len[i]>len[j]){
        		   temp=len[i];
        		   len[i]=len[j];
        		   len[j]=temp;
        		}
        	}
        }
		for(int i=0;i<len.length;i++){
		if(len[i]>1){
			System.out.println(len[i]);
		}
	}*/
		int max=0;
		int index=0;
		for(int i=0;i<len.length;i++){
			if(len[i]>max) {
				max=len[i];
				index=i;
				if(index>0) {	
				}
				else {	
				}
			}
			else {	
			}
		}
		System.out.println(str[index]);
	}
}


