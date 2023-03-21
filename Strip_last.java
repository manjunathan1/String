class Strip_last{
public static void main(String[]args){
Strip_last obj=new Strip_last();
obj.strip_last();
}
private void strip_last() {
		// TODO Auto-generated method stub
		//striptrailing
				String name = "dhinakaran   ";
				name.stripLeading();
				System.out.println(name.length());
				name = name.stripTrailing();
				System.out.println(name.length());
				
				String name2 = "";
				for(int i=0;i<name.length();i++)
				{
					if(name.charAt(i)!=' ')
					{
						name2 = name2 + name.charAt(i);
					}
				}
				System.out.println(name2.length());
}}
