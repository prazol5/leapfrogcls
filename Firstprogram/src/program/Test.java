/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Prazol
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 10; (j+i)) {
                System.out.println(j+(j+i));
            }
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+");
        }
    }
}
