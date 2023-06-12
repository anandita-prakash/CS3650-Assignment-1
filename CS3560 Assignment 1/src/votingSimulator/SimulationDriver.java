package votingSimulator;

/*
 * Anandita Prakash
 * CS3560
 * 
 */

public class SimulationDriver 
{
	
	private final static int NUMSTUDENTS = (int)(Math.random() * 30 + 10); // generate 10 to 30 students
	private static Student[] students = new Student[NUMSTUDENTS]; // create array to store student info
	private static Question singleAnsQ, multipleAnsQ; // single answer question and multiple answer question
	private static int questionType; // integer to determine question type

	public static void main(String[] args) 
	{
		singleAnsQ = createSingleAnswerQuestion(); // create single answer question and choices
		multipleAnsQ = createMultipleAnswerQuestion(); // create multiple answer question and choices
		
		generateStudentInfo(); // generate students and ID Numbers
		
		VotingService votingService = new VotingService(); // create votingService object
		
		takeStudentResponses(votingService); // start voting service and simulaate taking student responses
		
		displayStudentResponses(votingService); // display simulated student results
	}
	
	public static Question createSingleAnswerQuestion()
	{
		String sQuestion = "Are you an undergraduate student?";
		String[] sChoices = {"Yes", "No"};
		SingleAnswerQuestion SAQ = new SingleAnswerQuestion(sQuestion, sChoices);
		return SAQ;
	}
	
	public static Question createMultipleAnswerQuestion()
	{
		String mQuestion = "What are your favorite TV Shows?";
		String[] mChoices = {"Supernatural", "Sherlock", "Doctor Who", "Hannibal", "Succession", 
				"Community", "New Girl", "Arrested Development", "The Office", 
				"Psych", "Bones", "Lucifer"};
		MultipleAnswerQuestion MAQ = new MultipleAnswerQuestion(mQuestion, mChoices);
		return MAQ;
	}
	
	// generate student ID information for amount of students participating in the vote
	public static Student[] generateStudentInfo()
	{
		for (int i = 0; i < NUMSTUDENTS; i++)
		{
			students[i] = new Student(i + 10011000);
		}
		return students;
	}
	
	public static void takeStudentResponses(VotingService vs)
	{
		questionType = (int)(Math.random() * 2 + 1); // choose whether single answer question (1) or multiple answer question (2) is asked
		
		if (questionType == 1) // single answer question
		{
			System.out.println(singleAnsQ.getQuestion() + "\n");
			vs.createStudentResponses(students, NUMSTUDENTS, singleAnsQ); // generate student responses for question
		}
		if (questionType == 2) // multiple answer question
		{
			System.out.println(multipleAnsQ.getQuestion() + "\n");
			vs.createStudentResponses(students, NUMSTUDENTS, multipleAnsQ); // generate student responses for question
		}
	}
	
	public static void displayStudentResponses(VotingService vs)
	{
		if (questionType == 1)
		{
			vs.displayResultsSAQ();
		}
		else
		{
			vs.displayResultsMAQ();
		}
	}

}
