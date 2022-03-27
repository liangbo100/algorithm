package liangb.jetbrains.space.algorithm.chapter03;

import java.util.LinkedList;

public class A05链表_棒球比赛 {

    public static int calPoints(String[] ops){

        LinkedList<Integer> list = new LinkedList<>();

        int result = 0;
        for (int i = 0; i < ops.length; i++) {


            if ( "C".equals(ops[i])){
                list.removeLast();
            }else if ("D".equals(ops[i])){
                Integer last = list.getLast();
                list.add(last*2);
            }else if ("+".equals(ops[i])){
                int size = list.size();
                list.add(list.get(size-1) + list.get(size-2));
            }else {
                list.add(Integer.parseInt(ops[i]));
            }
        }

        for (Integer i:list) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
}
