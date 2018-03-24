package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	private Enrollment()
	{ super();
	}
		public Enrollment(UUID StudentID, UUID SectionID)
		{
			super();
			this.StudentID = StudentID;
			this.SectionID = SectionID;
			this.EnrollmentID= UUID.randomUUID();
			
		}
		public void SetGrade(double Grade)
		{
			this.Grade = Grade;
		}
		 public double getGrade() {
		        return Grade;
		    }

		    }

