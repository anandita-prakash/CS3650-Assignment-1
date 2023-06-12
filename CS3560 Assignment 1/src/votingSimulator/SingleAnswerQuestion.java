package votingSimulator;

/*
 * Anandita Prakash
 * CS3560
 * 
 */

public class SingleAnswerQuestion implements Question 
{
	
	private String sQuestion;
	private String[] sChoices;
	
	public SingleAnswerQuestion(String sQuestion, String[] sChoices)
	{
		this.sQuestion = sQuestion;
		this.sChoices = sChoices;
	}
	
	
	public String getQuestion() 
	{
		return sQuestion;
	}

	
	public String[] getChoices() 
	{
		return sChoices;
	}

	
	public boolean isSingleAnswer() 
	{
		return true;
	}

}
