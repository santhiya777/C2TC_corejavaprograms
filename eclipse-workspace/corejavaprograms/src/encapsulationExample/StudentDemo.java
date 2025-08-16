package encapsulationExample;

public class StudentDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Student s = new Student();
           
           s.setSid(101);
           s.setSname("sandy");
           s.setAvg(89.5f);
           System.out.println("Student id:" + s.sid);
           System.out.println("Student name:" + s.sname);
           System.out.println("Student Average:" + s.avg);
	}

}
