class StringAppend {
    public static void main(String[] args){

        StringBuilder str= new StringBuilder(5);
        str.append("Hello hiii byee");

        //old*2+2
        System.out.println(str.length());
        System.out.println(str.capacity());
    }
}
