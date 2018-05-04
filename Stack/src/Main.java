/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wladislaw
 */
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean loop = true;
        int eingabe;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //System.out.println("Geben Sie die Groesse des Stacks an:");
        int size;
        // size= Integer.parseInt(br.readLine());
        // Stack s= new Stack(size);
        StackU su = new StackU(6, 10);
        while (loop == true) {

            System.out.println("Menue:");
            System.out.println("1: fuer Push Operation");
            System.out.println("2: fuer Pop Operation");
            System.out.println("3: fuer printen des StackInhaltes");
            System.out.println("4: stack leer?");
            System.out.println("5: fuer pushen eines arrays");
            System.out.println("6:erweirte pop methode ");
            System.out.println("7:fuer das Beenden des Programms");

            eingabe = Integer.parseInt(br.readLine());
            switch (eingabe) {
                case 1: {
                    int temp;
                    System.out.println("Geben Sie einen Wert ein welcher in den Stack eingeragen werden soll:");
                    int x = Integer.parseInt(br.readLine());
                    temp = su.push(x);
                    if (temp == -1) {
                        System.out.println("Die Stackgroesse wurde ueberschritten!");
                    }
                    break;
                }
                case 2: {
                    int temp = su.pop();
                    if (temp == -1) {
                        System.out.println("Der Inhalt war Leer");
                        break;
                    }
                    System.out.println("Der Inhalt war: " + temp);
                    break;
                }
                case 3: {
                    su.print();
                    break;
                }
                case 4: {
                    if (su.stackEmpty()) {
                        System.out.println("Stack ist Leer");
                        break;
                    } else {
                        System.out.println("Stack ist NICHT Leer");
                        break;
                    }
                }
                case 5: {
                    int temp;
                    System.out.println("Geben Sie die Groesse des Arrays ein:");
                    size = Integer.parseInt(br.readLine());
                    int array[] = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.println("Geben Sie den Wert für den " + (i + 1) + ". Wert ein:");
                        array[i] = Integer.parseInt(br.readLine());
                    }
                    temp=su.push(array);
                    if(temp==0){
                        System.out.println("Erfolgreich eingetragen");
                    }
                    else System.out.println("Nicht Erfolgreich");
                    break;
                }
                case 6:
                    int temp2;
                    
                    System.out.println("Geben sie einen Wert ein :");
                    temp2=Integer.parseInt(br.readLine());
                    temp2=su.pop(temp2);
                    if(temp2 ==-1)System.out.println("Ungültige Eingabe");
                    else System.out.println("letzter Pop-wert"+temp2);
                    break;
                
                case 7: {
                    loop = false;
                    break;
                }
                default: {
                    System.out.println("Falsche Eingabe!");
                    break;
                }
            }
        }
    }

}
