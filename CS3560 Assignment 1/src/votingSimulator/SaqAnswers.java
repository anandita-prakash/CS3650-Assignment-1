package votingSimulator;

/*
 * Anandita Prakash
 * CS3560
 * 
 */

import java.util.*;

public class SaqAnswers implements Answers 
{
	
	private String[] studentAnswers;
	private ArrayList<String> sAnswer = new ArrayList<String>();
	
	public ArrayList<String> getAnswers(Question question) 
	{
		studentAnswers = question.getChoices(); // fills array with all possible answer choices
		List<String> studentAnswersList = Arrays.asList(studentAnswers); // turns array of choices into List to shuffle choices
		Collections.shuffle(studentAnswersList); // shuffle list
		studentAnswersList.toArray(studentAnswers); // shuffled list gets stored in original array
		
		sAnswer.add(studentAnswers[0]); // pick first answer after shuffling list and make it final student answer
		return sAnswer;
	}

}
