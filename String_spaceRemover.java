class String_spaceRemover{
public static void main(String[]args){
String_spaceRemover obj=new String_spaceRemover();
obj.spaceRemove();
}
void spaceRemove(){
String name="manjunathan is a good boy   ";
		  String name2="";
		  boolean first=false;
		  for(int i=0;i<name.length();i++) {
		   if(name.charAt(i)!=' ') {
		    first=true;
		   }
		   if(first==true) {
			   name2 = name2 + name.charAt(i);
		   // System.out.print(name.charAt(i));
		   }
		  }  
		  System.out.println(name2);
		  
		  }}

