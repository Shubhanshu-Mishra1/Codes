class Sum {

static void sumOf(int a){

int s = 0;
for(;a!=0;){

    s += a%10;
    a /=10;
}
System.out.println(s);
}
public static void main(String[] args){

    int a= 123;
    sumOf(a);
}
    
}
