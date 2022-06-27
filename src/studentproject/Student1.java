package studentproject;

public class Student1 {
	
	String sname;
	int mathscore;
	int englishscore;
	int sciencescore;
	int totalscores;
	

	public Student1(String sname, int mathscore, int englishscore, int sciencescore) {

		this.sname = sname;
		this.mathscore = mathscore;
		this.englishscore = englishscore;
		this.sciencescore = sciencescore;
		this.totalscores = this.mathscore + this.englishscore + this.sciencescore;
		
		}
	
	public int getTotalScores()
	{
		return totalscores;
	}

	@Override
	public String toString() {
		return "Student1 [sname=" + sname + ", mathscore=" + mathscore + ", englishscore=" + englishscore
				+ ", sciencescore=" + sciencescore + ", totalscores=" + totalscores + "]";
	}

	

	}


