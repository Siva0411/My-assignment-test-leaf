package week3;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(07);
	}
	
	public void getStudentInfo(String name, int id) {
		System.out.println("sankari, 07");
	}
	
	public void getStudentInfo(long phoneNumber, String email) {
		System.out.println("654567876L, siva0411@gmail.com");
	}

	public static void main(String[] args) {
		
		Students stud = new Students();
		stud.getStudentInfo(07);
		stud.getStudentInfo("sankari", 07);
		stud.getStudentInfo(65456789L, "siva0411@gmail.com");
		

	}

}
