package votingSimulator;

/*
 * Anandita Prakash
 * CS3560
 * 
 */

public interface Question 
{
	// get the question
	public String getQuestion();
	
	// get array containing answer choices
	public String[] getChoices();
	
	// check if the question has a single answer
	public boolean isSingleAnswer();
}
