package l_9_ex_1;

public class Use {
	
	private String coursename;

	Use(String coursename) 
		{
		this.coursename = coursename;
		}
	public String getName() 
		{
		return coursename;
		}
	public void setName(String coursename) 
		{
		this.coursename = coursename;
		}
	public static void main(String[] args) 
		{
		System.out.println("Adding Previous Course Book Name !");
		Use obj = new Use("Khalil's Psychotic Adventure");
		System.out.println("" +obj.getName()+"\n");

		// update the name, this object is mutable
		System.out.println("Updating Current Course Book Name !");
		obj.setName("Umair OCD Problem Experience");
		System.out.println("" +obj.getName());


}
}	
