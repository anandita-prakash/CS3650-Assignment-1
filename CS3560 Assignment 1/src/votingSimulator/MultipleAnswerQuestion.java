package votingSimulator;

/*
 * Anandita Prakash
 * CS3560
 * 
 */

public class MultipleAnswerQuestion implements Question 
{
	
	private String mQuestion;
	private String[] mChoices;
	
	public MultipleAnswerQuestion(String mQuestion, String[] mChoices)
	{
		this.mQuestion = mQuestion;
		this.mChoices = mChoices;
	}

	
	public String getQuestion() 
	{
		return mQuestion;
	}

	
	public String[] getChoices() 
	{
		return mChoices;
	}

	
	public boolean isSingleAnswer() 
	{
		return false;
	}

}
