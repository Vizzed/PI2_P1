/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wladislaw
 */
public class StackU extends Stack {

    public StackU(int t, int wert) {
        super(t);
        for (int i = 0; i < t; i++) {
            super.push(wert);
            wert++;
        }
    }

    boolean stackEmpty() {
        if (super.getTop()== -1) {
            return true;
        }
        return false;
    }

    int push(int array[]) {
        if (super.getTop() == -1) {
            if (array.length <= super.getA().length) {
                for (int i = 0; i < array.length; i++) {
                    super.push(array[i]);

                }
                return 0;
            }
        } else {
            if (array.length <= (super.getA().length - (super.getTop()+1))) {
                for (int i = 0; i < array.length; i++) {
                    super.push(array[i]);
                }
                return 0;
            }

        }
        return -1;
    }
    int pop(int n){
        int zahl=0;
        if((super.getTop()+1)>=n){
            for (int i = 0; i < n; i++) {
                zahl=super.pop(); 
            }
            return zahl;
        }
       // if (super.getTop() == -1)return -1;
       // if(super.getA().length<=n)return -1;
        return -1;
    }
}
