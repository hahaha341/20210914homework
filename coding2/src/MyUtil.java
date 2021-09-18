public class MyUtil {
    MyUtil(){}
    public static void if_Fun(){
        System.out.println("shi if");
        stackHeap.push("if");//if入栈
    }
    public static void elseif_Fun(){
        System.out.println("shi else if");
        stackHeap.push("else if");//else if入栈
    }
    public static int else_Fun(int count1){
        System.out.println("shi else");
        String x=null;
        x=stackHeap.pop();
        if(x.equals("else if")){//如果是else if，则计数
            count1++;
            do{//之后不断抛出栈顶元素，并检验
                x=stackHeap.pop();
            }
            while(!x.equals("if"));//如果抛出的栈顶元素是if，抛出结束
        }
        return count1;
    }
    public static int elseFun(int count1){
        System.out.println("shi else");
        String x=null;
        x=stackHeap.pop();//栈顶出战
        if(x.equals("if")){//如果出栈的是if，则计数，如果不是，则不计数
            count1++;
        }
        return count1;
    }
}
