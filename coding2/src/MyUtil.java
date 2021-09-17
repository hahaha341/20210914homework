public class MyUtil {
    MyUtil(){}
    public static void if_Fun(){
        System.out.println("shi if");
        stackHeap.push("if");
    }
    public static void elseif_Fun(){
        System.out.println("shi else if");
        stackHeap.push("else if");
    }
    public static int else_Fun(int count1){
        System.out.println("shi else");
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
    public static int elseFun(int count1){
        System.out.println("shi else");
        String x=null;
        x=stackHeap.pop();
        if(x.equals("if")){
            count1++;
        }
        return count1;
    }
}
