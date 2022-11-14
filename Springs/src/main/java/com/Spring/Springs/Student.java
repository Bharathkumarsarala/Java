package com.Spring.Springs;

public class Student {

	int id;
	MathCheat mathcheat;

	public void setId(int id) {
		this.id = id;
	}

	

	


	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}



	public void cheating() {
		mathcheat.mathCheat();
		System.out.println("my id:" +" "+ id + "tak it" );
	}

}
