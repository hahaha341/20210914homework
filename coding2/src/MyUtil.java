public class MyUtil {
    public static void if_Fun(){
        stackHeap.push("if");
        System.out.println("是if");
    }
    public static void elseif_Fun(){
        stackHeap.push("else if");
        System.out.println("是else if");}
    MyUtil(){}
    public static int else_Fun(int count1){
        System.out.println("是else");
        String x=null;
        x=stackHeap.pop();
        if(x.equals("else if")){
            count1++;
            do{
                x=stackHeap.pop();
            }
            while(!x.equals("if"));
        }
        return count1;
    }
}
