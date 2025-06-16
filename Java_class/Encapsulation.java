/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Java_class;

/**
 *
 * @author Nilal
 */
class Account {

    private int acc_no;
    private String name, email;
    private float amount;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAcc_no(12345);
        ac.setName("Nilaltech");
        ac.setEmail("nilaltechhub@gmail.com");
        ac.setAmount(12340);
       

    }
}
