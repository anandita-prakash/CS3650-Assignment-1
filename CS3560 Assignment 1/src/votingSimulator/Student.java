package votingSimulator;

/*
 * Anandita Prakash
 * CS3560
 * 
 */

import java.util.*;

public class Student 
{
	private int idNum;
	
	// array with student answers
	private ArrayList<String> finalAnswer = new ArrayList<String>();
	
	// constructor
	public Student(int idNum)
	{
		this.idNum = idNum;
	}
	
	// get Student ID Number
	public int getIDNum()
	{
		return idNum;
	}
	
	// get Student Response
	public ArrayList<String> getAnswer()
	{
		return finalAnswer;
	}
	
	public void questionType(Question question)
	{
		if (question.isSingleAnswer()) // if the question is a single answer question
		{
			Answers saqAnswer = new SaqAnswers(); // create new object for the single answer
			finalAnswer = saqAnswer.getAnswers(question); // assign the single answer to the final student answer variable
		}
		else // if the question is a multiple answer question
		{
			Answers maqAnswers = new MaqAnswers(); // create new object for the multiple answers
			finalAnswer = maqAnswers.getAnswers(question); // assign the answers to the final student answer variable
		}
	}
}
