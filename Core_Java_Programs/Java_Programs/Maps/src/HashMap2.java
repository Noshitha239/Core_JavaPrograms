import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(5,"Sai");
		hm.put(2,"Noshitha");
		hm.put(1,"Ramya");
		hm.put(3,"Bhavana");
		System.out.println(hm);
		HashMap<String, String> hm1=new HashMap<String, String>();
		hm1.put("Sai","Sai");
		hm1.put("Noshitha","Noshitha");
		hm1.put("Ramya","Ramya");
		hm1.put("Bhavana","Bhavana");
		hm1.put("Bindhu","Bindhu");
		System.out.println(hm1);
	}

}
