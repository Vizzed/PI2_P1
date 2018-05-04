/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wladislaw
 */
public class Stack {

    private final int a[];
    private int top ;

    public Stack(int t) {
        a = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = 0;
        }
        top=-1;
    }

    int push(int x) {
        if ((top+1) == a.length) {
            return -1;
        } else {
             top++;
            a[top] = x;
           
            return 0;
        }
    }
    int pop(){
        if(top==-1){
            return -1;
        }
        else{
            top--;
            return a[(top+1)];
        }
    }
    void print(){
        System.out.println("Der Stackinhalt ist:");
        for(int i=0;i<=top;i++){
            System.out.println(a[i]);
        }
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getA() {
        return a;
    }

    public int getTop() {
        return top;
    }
}
