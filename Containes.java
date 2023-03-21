class Containes{
public static void main(String[]args){
Containes obj=new Containes();
obj.check_contains();
}
private void check_contains() {
		// TODO Auto-generated method stub
		
		String name1 = "manjunathan is a good boy"; 
		String name2 = "boy";
		char ch = name2.charAt(0); //a
		int j=0, count = 0; 
		boolean contains = false; 
for(int i=0; i<name1.length();i++)
{
	if(ch==name1.charAt(i)) //t
	{
		j++; //j = 3
		if(j<=name2.length()-1)
			{ch = name2.charAt(j); }// 't'
		count++; // 3
		if(count==name2.length())
		{
			contains = true; 
			System.out.println("Contains");
			break;
		}
	}}
	

if(contains==false)
{
	System.out.println("Not contains");
}
		
	}}
