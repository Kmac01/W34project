package week34main;

public class ProjectMain {
	
			public static void main(String[] args) {
				//1. 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

				//allows length of array to be dynamic.
				int ns = 8;
				//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
				int[] ages = new int [ns];
				ages[0] = 3;
				ages[1] = 9;
				ages[2] = 23;
				ages[3] = 64;
				ages[4] = 2;
				ages[5] = 8;
				ages[6] = 28;
				ages[7] = 93;
				//1 a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
				int i = (ages[0] - ages[ns - 1]);
				System.out.println("1 A. " + i);
				//1 b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
				ns ++;
				ages[ages.length - 1] = 88;
				int j = (ages[0] - ages[ages.length - 1]);
				System.out.println("1 B. " + j);
				//1 c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
				int sum = 0;
				for(int k = 0; k < (ns - 1); k++) {
					sum = sum + ages[k];
				}
				int average = (sum / ns);
				System.out.println("1 C. " + average);
				//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
				//allows length of array to be dynamic.
				int z = 6;
				//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
				String[] names = new String [z];
				names[0] = "Sam";
				names[1] = "Tommy";
				names[2] = "Tim";
				names[3] = "Sally";
				names[4] = "Buck";
				names[5] = "Bob";
				//2 a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
				String check = "";
				for (int twoa = 0; twoa < names.length; twoa++) {
					check += names[twoa];
				}
					double chlong = check.length();
					System.out.println("2 A. " + (chlong / names.length));
			
				
				//2 b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
				String nameconc = "";
				String space = " ";
				for(int twob = 0; twob <= (z - 1); twob++) {
					nameconc += names[twob];
					nameconc += space;
				}
				System.out.println("2 B. " + nameconc);
				//3.	How do you access the last element of any array?
				System.out.println("3. You access the last element of an array by utilizing array.length -1.");
				//4.	How do you access the first element of any array?
				System.out.println("4. You access the first element of an array by utilizing array[1].");
				//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
				String flipper = "";
				String flopper = "";
				int[] nameLengths = new int[z];
				for(int re = 0; re < nameLengths.length; re++) {
					flopper = names[re];
					nameLengths[re] = flopper.length();
					flopper = flipper;
				}
				//6.   Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
				int notFunny = 0;
				for(int funny = 0; funny < nameLengths.length; funny++) {
					notFunny += nameLengths[funny];
				}
				System.out.println("6. " + notFunny);
				
				//beginning of separate methods' calls.
				
				//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
				//7. call
				String sevon = "four";
				int setimes = 4;
				String vii = Queseven(sevon, setimes);
				System.out.println("7. " + vii);
				
				//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
				//8.call
				String efirstName = "Jerry";
				String elastName = "Formattingerror";
				String viii = eightName( efirstName, elastName);
				System.out.println("8. " + viii);
				
				//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
				//9. call
				int[] Ques = new int[10];
				Ques[0] = 10;
				Ques[1] = 1;
				Ques[2] = 2;
				Ques[3] = 3;
				Ques[4] = 4;
				Ques[5] = 5;
				Ques[6] = 6;
				Ques[7] = 7;
				Ques[8] = 8;
				Ques[9] = 9;
				boolean ix = nineArr();
				System.out.println("9. " + ix);
				
				//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
				//10. call
			 	double Ques10[] = new double[5];
			 	Ques10[0] = 2.1;
			 	Ques10[1] = 10.7;
			    Ques10[2] = 14.1;
			 	Ques10[3] = 17.02;			
			 	Ques10[4] = 74.88;
				double x = tenD(Ques10);
				System.out.println("10. " + x);
				
				//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
				//11. call
			 	double checkI[] = new double[5];
			 	checkI[0] = 2.1;
			 	checkI[1] = 10.7;
			 	checkI[2] = 14.1;
			 	checkI[3] = 17.02;			
			 	checkI[4] = 74.88;
			 	
			 	double checkII[] = new double[4];
			 	checkII[0] = 2.1;
			 	checkII[1] = 10.7;
			 	checkII[2] = 14.1;
			 	checkII[3] = 17.02;
			 	
				boolean xi = calleven(checkI, checkII );
				System.out.println("11. " + xi);
				
				//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				//12. call
				boolean hotOutside = true;
				double pocketChange = 11.25;
				boolean xii = willBuyDrink(hotOutside, pocketChange);
				System.out.println("12. " + xii);
				
				//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
				//13. call 
				String question = "Am I done working?";
				String xiii = enterQuestion(question);
				System.out.println("13. " + xiii);
				
			}
			//7. method
			public static String Queseven(String word, int n) {
				String total = "";
				for (int i = 0; i < n; i++) {
					total += word;
				}
				return total;
			}
			//8. method
				public static String eightName(String firstName,String lastName) {
					 	String fullName = (firstName + " " + lastName);
					 			return fullName;
				 }
			//9. method
				public static boolean nineArr() {
					 int i = 10;
					 int Ques[] = new int[i];
					 if(Ques.length > 100){
						 
						 return true;
						 } else {
							 return false;
						 }
				}
			//10. method
				 public static double tenD(double Ques10[]) {
					 int j = 5;
					 int doublecheck = j;
					 	double sum10 = 0;
					 	for(int i = 0; i < doublecheck; i++) {
					 		sum10 = (sum10 + Ques10[i]);
					 	}
					 	return (sum10 / 5);
				}
			//11. method
				 //establishing method
				 public static boolean calleven (double[] firs, double[] seco) {
				//and variables
					double sum = 0.0;
					double som = 0.0; 
					double lengthi = firs.length;
					double lengthii = seco.length;
					//argument finds sum of array 1
							for (double firs1 : firs) {
								sum += firs1;
							}
						//argument finds average of array 1
							double checki = (sum / lengthi);
					//argument finds sum of array 2
							for (double seco1 : seco) {
								som += seco1;
							}
						//argument finds average of array 2
							double checkii = (som / lengthii);
				//argument returns if array 1 average is larger than array 2 average
					    if(checki > checkii) {
					    	return true;
					    } else {
					    	return false;
					    }
				}
			//12. method
				public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
					if((isHotOutside = true) && (moneyInPocket > 10.50)) {
						 return true;
						} else {
							return false;
							
						}
				}
			//13. method annoying magic 8 ball
				public static String enterQuestion(String question) {
					String answer = "Ask again later.";
					String enter = "Enter valid question";
					if (question.length() > 0) {
					return answer;
					} else {
					return enter;
					}
				}
			}