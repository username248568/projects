package prelim;

public class student {
	     int id;
		 int credhours;
		 int points;
		 float gpa;
		 
		 public float getgpa() {
			 gpa=points/credhours;
			 return gpa;
		 }
		 public int getid() {
				return id;
			}
		 public int getcredhours() {
				return points;
			}
		 public int getpoints() {
				return points;
			}
		 
		 
}
