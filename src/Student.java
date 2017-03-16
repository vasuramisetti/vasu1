
public class Student {
	
	private String name;
	private String grade;
	private char section;

	Marks mkr;

	Student(String name,String grade,char section, Marks mrk)
	    {
		this.name=name;
		this.grade=grade;
		this.section=section;
		this.mkr=mrk;
			
		}
	
	

	public void SetName(String name)
		{
		this.name=name;
		}

	
	public String getName()
		{
		return name;
		}


	public void setGrade(String grade)
		{
		this.grade=grade;
		}

	public String getGrade()
		{
		return grade;
		}
	
	public void SetSection(char section)
		{
		this.section=section;	
		}
	
	public char getSection()
		{
		return section;
		}
	
	
		
	public static void main(String args[])
		{
	       Marks mr = new Marks(85,87,82,91);
	       Student s1 = new Student("Vasudev","11th",'A',mr);
	       
	       System.out.println("********Student Details********");
	       
	       System.out.println("Student Name:"+" "+s1.getName());
	       System.out.println("Student Grade:"+" "+s1.getGrade());
	       System.out.println("Student Section:"+" "+s1.getSection());
	       
	       System.out.println("*****Student Marks In Each Subject Out of 100*****");
	       System.out.println("Hindi:"+" "+s1.mkr.getHindi());
	       System.out.println("English:"+ " "+s1.mkr.getEnglish());
	       System.out.println("Maths:"+" "+s1.mkr.getMaths());
	       System.out.println("Telugu"+" "+s1.mkr.getTelugu());
		}
	


}