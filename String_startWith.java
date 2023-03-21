import java.util.*;
class String_startWith{
public static void main(String[]args){
char []name1={'s','a','k','t','h','i'};
char []name2={'s','a','k'};
boolean starts=true;
for(int i=0;i<name2.length;i++){
if(name1[i]==name2[i]){
continue;
}
else{
starts=false;
System.out.println("not match");
}
}



if(starts==true){
System.out.println("match");
}
}}

