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
            a[i] = wert + i;
            top++;
        }
    }

    boolean stackEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    int push(int array[]) {
        if (top == -1) {
            if (array.length <= a.length) {
                for (int i = 0; i < array.length; i++) {
                    super.push(array[i]);

                }
                return 0;
            }
        } else {
            if (array.length <= (a.length - (top+1))) {
                for (int i = 0; i < array.length; i++) {
                    super.push(array[i]);
                }
                return 0;
            }

        }
        return -1;
    }
}
