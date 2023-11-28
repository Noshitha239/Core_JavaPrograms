
class M2{
 private String name;
	    private String color;
	    private int age;
	    private int cost;
	    M2(){
	    	super();
	        this.name="Tommy";
	    	this.color="Black";
	    	this.age=7;
	        this.cost=4500;
	    }
	    M2(String name){
	    	this();
	    	this.name=name;
	    }
	    M2(String name, String color){
	    	this("Ramu");
	    	this.name=name;
	    	this.color=color;
	    }
	    M2(String name, String color,int age){
	    	this("Rocky","White");
	    	this.name=name;
	    	this.color=color;
	    	this.age=age;
	    }
	    M2(String name, String color, int age,int cost){
	    	this("Jipcy","Brown");
	    	this.name=name;
	    	this.color=color;
	    	this.cost=cost;
	    	this.age=age;
	    }
	    String getName() {
	    	return name;
	    }
	    String getColor(){
	    	return color;
	    }
	    int getAge() {
	    	return age;
	    }
	    int getCost() {
	    	return cost;
	    }
}
public class thismethod123{
	public static void main(String[] args) {	
  M2 t=new M2("Jockey","Grey",6,8000);
  System.out.println(t.getName());
  System.out.println(t.getColor());
  System.out.println(t.getCost());
  System.out.println(t.getAge());
	}
}
