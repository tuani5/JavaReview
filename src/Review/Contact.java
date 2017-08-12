/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

/**
 *
 * @author Tuan La
 */
public class Contact implements Comparable {
    private String firstName,lastName,phone;
    //constructor
    Contact(String first_Name,String last_Name,String phone_Number)
    {
        this.firstName=first_Name;
        this.lastName=last_Name;
        this.phone=phone_Number;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int compareTo(Object b)
    {
        int result;
        String bLastName=((Contact)b).getLastName();
        String bFirstName=((Contact)b).getFirstName();
        if (lastName.equals(bLastName))
        {
            result=firstName.compareTo(bFirstName);
        }
        else
            result=lastName.compareTo(bLastName);
        
        return result;

    }
    public String toString()
    {
        //lastName, firstName   phone#
        return lastName +", "+firstName+"\t"+phone;
    }
    
}
