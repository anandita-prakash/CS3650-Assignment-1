package votingSimulator;

/*
 * Anandita Prakash
 * CS3560
 * 
 */

public class VotingService 
{
	// counters for number of yes answers and number of no answers (single answer question)
	private int numYes, numNo = 0;
	
	// counters for number of answers for multiple answer question
	private int numA, numB, numC, numD, numE, numF, numG, numH, numI, numJ, numK, numL = 0;
	
	public void createStudentResponses (Student[] students, int numStudents, Question question)
	{
		System.out.println("Format: Student ID Number - Answer ");
		System.out.println();
		System.out.println();
		System.out.println("Student responses:");
		
		// display student ID Number and student answer(s)
		for (int i = 0; i < numStudents; i++)
		{
			students[i].questionType(question);
			System.out.println(students[i].getIDNum() + " - " + students[i].getAnswer());
			
		}
		
		// generate random int for number of students who are submitting again
		int repeatSubmissions = (int)(Math.random() * (numStudents) + 0);
		
		// display student ID Number and student answers(s) for any repeat submissions
		for (int i = 0; i < repeatSubmissions; i++)
		{
			int repeatStudentIndex = (int)(Math.random() * (numStudents - 1) + 0);
			students[repeatStudentIndex].questionType(question);
			System.out.println("Resubmission: " + students[repeatStudentIndex].getIDNum() + " - " + students[repeatStudentIndex].getAnswer());
		}
		
		System.out.println();
		System.out.println();
		
		if (question.isSingleAnswer())
		{
			finalResultSAQ(students, numStudents);
		}
		else
		{
			finalResultsMAQ(students, numStudents);
		}
	}
	
	// goes through all student answers for single answer question and 
	// counts how many "yes" and "no" answers there are
	public void finalResultSAQ(Student[] students, int numStudents)
	{
		for (int i = 0; i < numStudents; i++)
		{
			if (students[i].getAnswer().get(0).equals("Yes"))
			{
				numYes++;
			}
			if (students[i].getAnswer().get(0).equals("No"))
			{
				numNo++;
			}
		}
	}
	
	// goes through all student answers for the multiple answer question and 
	// counts how many of each type of answer there is
	public void finalResultsMAQ(Student[] students, int numStudents)
	{
		for (int i = 0; i < numStudents; i++)
		{
			for (int j = 0; j < students[i].getAnswer().size(); j++)
			{
				if (students[i].getAnswer().get(j).equals("Supernatural"))
				{
					numA++;
				}
				if (students[i].getAnswer().get(j).equals("Sherlock"))
				{
					numB++;
				}
				if (students[i].getAnswer().get(j).equals("Doctor Who"))
				{
					numC++;
				}
				if (students[i].getAnswer().get(j).equals("Hannibal"))
				{
					numD++;
				}
				if (students[i].getAnswer().get(j).equals("Succession"))
				{
					numE++;
				}
				if (students[i].getAnswer().get(j).equals("Community"))
				{
					numF++;
				}
				if (students[i].getAnswer().get(j).equals("New Girl"))
				{
					numG++;
				}
				if (students[i].getAnswer().get(j).equals("Arrested Development"))
				{
					numH++;
				}
				if (students[i].getAnswer().get(j).equals("The Office"))
				{
					numI++;
				}
				if (students[i].getAnswer().get(j).equals("Psych"))
				{
					numJ++;
				}
				if (students[i].getAnswer().get(j).equals("Bones"))
				{
					numK++;
				}
				if (students[i].getAnswer().get(j).equals("Lucifer"))
				{
					numL++;
				}
			}
		}
	}
	
	// prints single answer question results
	public void displayResultsSAQ()
	{
		System.out.println("Final Result Counts");
		System.out.println("Yes: " + numYes);
		System.out.println("No: " + numNo);
	}
	
	// prints multiple answer question results
	public void displayResultsMAQ()
	{
		System.out.println("Final Result Counts");
		System.out.println("Supernatural: " + numA);
		System.out.println("Sherlock: " + numB);
		System.out.println("Doctor Who: " + numC);
		System.out.println("Hannibal: " + numD);
		System.out.println("Succession: " + numE);
		System.out.println("Community: " + numF);
		System.out.println("New Girl: " + numG);
		System.out.println("Arrested Development: " + numH);
		System.out.println("The Office: " + numI);
		System.out.println("Psych: " + numJ);
		System.out.println("Bones: " + numK);
		System.out.println("Lucifer: " + numL);
	}
	
}
