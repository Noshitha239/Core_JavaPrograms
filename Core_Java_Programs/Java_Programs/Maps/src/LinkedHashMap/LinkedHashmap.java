package LinkedHashMap;
import java.util.LinkedHashMap;
public class LinkedHashmap{
	public static void main(String[] args){
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer, String>();
		hm.put(5,"Sai");
		hm.put(2,"Noshitha");
		hm.put(1,"Ramya");
		hm.put(3,"Bhavana");
		System.out.println(hm);
		LinkedHashMap<String, String> hm1=new LinkedHashMap<String, String>();
		hm1.put("Sai","Sai");
		hm1.put("Noshitha","Noshitha");
		hm1.put("Ramya","Ramya");
		hm1.put("Bhavana","Bhavana");
		hm1.put("Bindhu","Bindhu");
		System.out.println(hm1);
		System.out.println(hm1.get("Noshitha"));
		System.out.println(hm1.equals("Noshitha"));
		System.out.println(hm.get(5));
		System.out.println(hm.putIfAbsent(2, "Noshitha"));
		System.out.println(hm1.remove("Bindhu"));
		System.out.println(hm1);
		System.out.println(hm1.replace("Ramya", "Neeha"));
		System.out.println(hm.replace(1, "Neeha"));
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.entrySet());
		System.out.println(hm.containsValue("Ramya"));
		System.out.println(hm.getOrDefault(5, "Sai"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
	}
}
