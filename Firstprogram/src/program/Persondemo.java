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
public class Persondemo {

    public static void main(String[] args) {
        Person ramPerson, shyamPerson;

        ramPerson = new Person("Ram", "Kharel", "male", 20, " 20 biscot road ", "Current Account");
        ramPerson.displayMessage();

        shyamPerson = new Person("Shyam", " katel", " male ", 40, " 34 warden road ", "Cash account");
        shyamPerson.displayMessage();
    }
}
