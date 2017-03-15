public class stack
{
private int size;
private long [] stackarray;
private int top;
public stack (int s) 
size=s; 
{
stackrray=new long[size];
top=-1;
}
public void push (long j)
{
stackarray[++top]=j;
}
public long pop()
{
return stackarray[--top];
}
public bolean isempty()
{
return (top==-1);
}
public static void main(string [] args)
stack thestack=new stack(10);
thestack.push(10);
thestack.push(20);
thestack.push(30);
thestack.push(40);
thestack.push(50);
while(thestack.isempty())
{
long value =thestack.pop();
system.out.println(values);
system.out.println("");
}
system.out.println("");
}
}
