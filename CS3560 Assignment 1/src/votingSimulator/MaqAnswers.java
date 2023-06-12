package votingSimulator;

/*
 * Anandita Prakash
 * CS3560
 * 
 */

import java.util.*;

public class MaqAnswers implements Answers 
{
	
	private String[] studentAnswers;
	private ArrayList<String> mAnswers = new ArrayList<String>();

	
	public ArrayList<String> getAnswers(Question question) 
	{
		studentAnswers = question.getChoices(); // fills array with all possible answer choices
		List<String> studentAnswersList = Arrays.asList(studentAnswers); // turns array of choices into List to shuffle choices
		Collections.shuffle(studentAnswersList); // shuffle list
		studentAnswersList.toArray(studentAnswers); // shuffled list gets stored in original array
		
		int numChoices = (int)(Math.random() * 12 + 1); // generate a number of choices student submits from 1-5
		
		for (int i = 0; i < numChoices; i++) // loop to add random number of choices to array with final student answers
		{
			mAnswers.add(studentAnswers[i]);
		}
		
		return mAnswers;
		
	}

}
