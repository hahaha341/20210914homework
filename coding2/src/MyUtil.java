public class MyUtil {
    MyUtil(){}
    public static void if_Fun(){
        stackHeap.push("if");
    }
    public static void elseif_Fun(){
        stackHeap.push("else if");
    }
    public static int else_Fun(int count1){
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
