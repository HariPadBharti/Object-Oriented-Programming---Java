//Day 4  Class vs. Instance

import java.io.*;
import java.util.*;
public class Person {
    private int age;	
  
	public Person(int initialAge) {
        if(initialAge<0){
                    System.out.println("Age is not valid, setting age to 0.");
         this.age = 0;
        }
        else
            this.age = initialAge;
            
  		// Add some more code to run some checks on initialAgeSystem.out.println("You are old.");
        }

        //System.out.println(/*Insert correct print statement here*/);
	}

	public void yearPasses() {
        ++age;
  		// Increment this person's age.
	}

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}



