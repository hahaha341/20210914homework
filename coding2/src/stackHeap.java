public class stackHeap {
    private static int index = -1;
    private static String [] obj = new String[10];
    public stackHeap()
    {}
    public static void push(String x){
        if(index<9){
            obj[++index]=x;
        }
        else{
            System.out.println("stack is full");
        }
    }
    public static void pop(){
        if(index>-1){
            obj[index--]=null;
        }
        else{
            System.out.println("stack is empty");
        }
    }
}
