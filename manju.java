class manju{
public static void main(String[]args){
char []name={'m','a','n','j','u'};
char []name2={'m','a','n'};
boolean correct=true;
for(int i=0;i<name2.length;i++){
if(name[i]==name2[i]){
continue;
}
else{
correct=false;
System.out.println("not match");
}
}




if(correct==true){
System.out.println("match");
}
}}




