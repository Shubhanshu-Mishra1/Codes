class Hello{
    //static int a =12;
    // int a=10;
    // public static void main(String[] args) {
    //     Hello obj = new Hello();
    //     System.out.println(obj.a);
    // }

static int arrMax(int[] arr){

    int max= arr[0];
for(int i=0;i<arr.length;i++){

    if(arr[i]>arr[0]) max = arr[i];
}
return max;

}
static void arrPairMax(int[] arr){

    int max;
for(int i=0;i<arr.length;i++){

    if(arr[i]>arr[0]) max = arr[i];
}

}
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5};
        int m= arrMax(arr);
        System.out.println(m);
        
    }
}