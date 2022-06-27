package studentproject;

import java.util.Arrays;
import java.util.Comparator;


public class StudentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Student1 st1 = new Student1("John", 88, 76, 90);
		
		Student1 st2 = new Student1("David", 75, 68, 95);
		
		Student1 st3 = new Student1("Anna", 60, 74, 94);
		
		Student1 st4 = new Student1("Maria", 98, 90, 85);
		
		Student1 st5 = new Student1("Chris", 89, 79, 69);
		

		Student1[] listOfStudent = { st1, st2, st3, st4, st5 };

		int engMaxScore = 0;
		Student1 engMaxScoreStudent = null;

		for (Student1 s : listOfStudent) {
			if (engMaxScore < s.englishscore) {
				engMaxScore = s.englishscore;
				engMaxScoreStudent = s;
			}
		}
		System.out.println("english maximum score");
		System.out.println("---------------------------------------");
		System.out.println("Student Name:" + engMaxScoreStudent.sname);
		System.out.println("Score:" + engMaxScoreStudent.englishscore);
		System.out.println();

		
		
		// ------Top student-----

		int MaxScore = 0;
		Student1 MaxScoreStudent = null;

		for (Student1 s : listOfStudent) {
			if (MaxScore < s.totalscores) {
				MaxScore = s.totalscores;
				MaxScoreStudent = s;
			}
		}
		System.out.println("Maximum Score");
		System.out.println("---------------------------------------");
		System.out.println("Student Name: " + MaxScoreStudent.sname);
		System.out.println("Score: " + MaxScoreStudent.totalscores);
		System.out.println();

		
		
		// ------bottom student-----

		int MinScore = MaxScore;
		Student1 minScoreStudent = null;

		for (Student1 s : listOfStudent) {
			if (MinScore > s.totalscores) {
				MinScore = s.totalscores;
				minScoreStudent = s;
			}
		}
		System.out.println("Minimum Score");
		System.out.println("---------------------------------------");
		System.out.println("Student Name: " + minScoreStudent.sname);
		System.out.println("Score: " + minScoreStudent.totalscores);
		System.out.println();

		
		
		// ----Total of marks----
		int sum = 0;
		int[] totalSum = new int[listOfStudent.length];
		int i = 0;
		for (Student1 s : listOfStudent) {

			String name = s.sname;
			int math = s.mathscore;
			int eng = s.englishscore;
			int sci = s.sciencescore;

			sum = math + eng + sci;

			System.out.println("Total score of " + name + " = " + sum);

			totalSum[i] = sum;
			i++;

		}
		System.out.println();

		
	//-------Rank------------------
		
	Arrays.sort(listOfStudent,Comparator.comparing(Student1::getTotalScores));
	
	int j=1;
	
	for(int r=listOfStudent.length-1; r>=0;r--)
	{
		
		Student1 s = listOfStudent[r];
		System.out.println("("+ j + ")" + s.sname);
		System.out.println("Score:" + s.totalscores);
		System.out.println();
		j++;
	}

	}

}
