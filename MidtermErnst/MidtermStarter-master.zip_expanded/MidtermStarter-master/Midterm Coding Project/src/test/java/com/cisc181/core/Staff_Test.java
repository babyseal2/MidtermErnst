package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
public void testStaffSalary() throws PersonException {
	    
	    ArrayList<Staff> staffs = new ArrayList<Staff>(5);
        Staff staff1 = new Staff("Kyle", "J", "Ernst", new Date(1993, 5, 7), 
                "71 Street B", "123-456-7890", "kje@a.com", "1:00 - 5:00", 1, 7000, 
                new Date(2018, 03, 18), eTitle.MR);
        Staff staff2 = new Staff("John", "D", "Doe", new Date(1994, 4, 5), 
                "6 Street A", "987-654-3210", "jdd@a.com", "1:00 - 5:00", 2, 5500, 
                new Date(2018, 03, 18), eTitle.MR);
        Staff staff3 = new Staff("Jane", "A", "Doe", new Date(1994, 8, 9), 
                "12 Street B", "302-867-5309", "jad@a.com", "1:00 - 5:00", 3, 3800, 
                new Date(2018, 03, 18), eTitle.MRS);
        Staff staff4 = new Staff("Mark", "A", "West", new Date(1996, 3, 2), 
                "32 Street B", "203-333-3920", "maw@a.com", "1:00 - 5:00", 4, 6500, 
                new Date(2018, 03, 18), eTitle.MR);
        Staff staff5 = new Staff("Nancy", "N", "North", new Date(1998, 3, 6), 
                "1 Street A", "231-121-5095", "nnn@a.com", "1:00 - 5:00", 5, 3000, 
                new Date(2018, 03, 18), eTitle.MS);
        staffs.add(staff1);
        staffs.add(staff2);
        staffs.add(staff3);
        staffs.add(staff4);
        staffs.add(staff5);
        
        double average = 0;
        for (Staff staff : staffs) {
            average += staff.getSalary();
        }
        average /= staffs.size();
        
        // expected average salary is 5160.
        assertEquals(average, 5160, 0.00001);
	}	

    @Test 
    public void testInvalidPhoneNumber() {
        try { Staff wrongNum =  new Staff("John", "D", "Doe", new Date(1994, 4, 5), 
                "6 Street A", "987-654-321", "jdd@a.com", "1:00 - 5:00", 2, 5500, 
                new Date(2017, 11, 11), eTitle.MR);
    }
        catch(PersonException e) {
        	assertEquals(1,1);}
        }

    @Test 
    public void testInvalidDOB() throws PersonException {
                                                    //! invalid !
       try {  Staff wrongNum =  new Staff("John", "D", "Doe", new Date(1894, 4, 5), 
                 "6 Street A", "987-654-3210", "jdd@a.com", "1:00 - 5:00", 2, 5500, 
                 new Date(2017, 11, 11), eTitle.MR);
	}	
       catch(PersonException e) {
    	   System.out.println("Age is greater than one hundred years");
    	   assertEquals(1,1);
       }
    

    }}
