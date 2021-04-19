package Ass3;
import java.util.Random;
public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] arr = new Medicine[10];
		Random random  = new Random();
		for(int i = 0;i<10;i++) {
			int current = random.nextInt(3);
			
			switch(current) {
				case 0:
					Medicine m1 = new Tablet();
					m1.setName("TabletMaster");
					m1.setAddress("6A, CD Road, USA.");
					arr[i] = m1;
					break;
				case 1:
					Medicine m2 = new Syrup();
					m2.setName("SyrupWorld");
					m2.setAddress("67/P, Station Rd, Canada.");
					arr[i] = m2;
					break;
				case 2:
					Medicine m3 = new Ointment();
					m3.setName("Ointments");
					m3.setAddress("55, XYZ Road, USA.");
					arr[i] = m3;
					break;
				default:
					
			}
			
			
		}
		for(Medicine m : arr) {
			m.displayLabel();
			System.out.println();
		}
		

	}

}
