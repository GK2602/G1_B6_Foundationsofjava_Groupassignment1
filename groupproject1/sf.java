package groupproject1;

public class sf {
	String departmentName;
	String Admindepartment;
	String Hrdepartment;
	String Techdepartment;
	String gettodayswork;
	String getworkdeadline;
	String doactivity;
	String diff;
	
	String departmentName() {
		if(departmentName==Admindepartment) {
		System.out.println("Admindepartment");
	}
	else if(departmentName==Hrdepartment) {
		System.out.println("Hr department");
	}
	else{
		System.out.println("Tech department");
		}
		return departmentName;
	}
	String gettodayswork() {
		if(gettodayswork==Admindepartment) {
		System.out.println("Complete yout documents submission");
	}
	else if(gettodayswork==Hrdepartment) {
		System.out.println("Fill today's timesheet and mark your attendance");
	}
	else{
		System.out.println("Complete coding module 1");}
		return gettodayswork ;
	}
	String getworkdeadline() 
	{
		if(getworkdeadline==Admindepartment) {
			System.out.println("Complete by EOD");
	}
	else if(getworkdeadline==Hrdepartment) {
		System.out.println("Complete by EOD");
	}
	else{
		System.out.println("Complete by EOD");
	}
		return getworkdeadline;}
	String diff() {
		if(diff==Hrdepartment) {
			System.out.println("team lunch");
		}
		else if(diff==Techdepartment) {
			System.out.println("core java");
		}
		else {}
		return diff;
	}
	

}
