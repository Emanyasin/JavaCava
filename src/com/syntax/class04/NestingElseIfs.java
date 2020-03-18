package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if the student completed the quiz, we will check for a score
		//If score >90-->great Job
		//if score >80-->well done
		//if score>70-->you could have done better
		//
		//if student did not complete the quiz--> you failed
		//please do homework on time
		
		boolean quizCompleted=true;
		int score=60;
		
		if(quizCompleted) {
			System.out.println("Let's check your score");
			
			if(score>90) {
				System.out.println("Great Job");
			}else if(score>80){
				System.out.println("Well done");
			}else if(score>70) {
				System.out.println("You could have done better");
			}else {
				System.out.println("You failed");
			}
			
		}else {
			System.out.println("Please do HW on time");
		}
		
		
		
	}

}
