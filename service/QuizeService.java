package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Question;

public class QuizeService {

        public static HashMap<String, List<Question>> loadQuestion() {
                HashMap<String, List<Question>> categoryQuestion = new HashMap<>();
                List<Question> javaQuestion = new ArrayList<>();
                

                HashMap<String, String> mcqQues1 = new HashMap<>();
                mcqQues1.put("a", " 0");
                mcqQues1.put("b", "null");
                mcqQues1.put("c", "undefined");
                mcqQues1.put("d", "1");

                Question q1 = new Question("❓Question 1 \nWhat is the default value of an int variable in Java?\n",
                                mcqQues1,
                                "a");

                javaQuestion.add(q1);

                HashMap<String, String> mcqQues2 = new HashMap<>();
                mcqQues2.put("a", " function");
                mcqQues2.put("b", " class");
                mcqQues2.put("c", " define");
                mcqQues2.put("d", " object");

                Question q2 = new Question("❓ Question 2\n Which keyword is used to create a class in Java?\n",
                                mcqQues2, "b");

                javaQuestion.add(q2);

                HashMap<String, String> mcqQues3 = new HashMap<>();
                mcqQues3.put("a", " start()");
                mcqQues3.put("b", " run()");
                mcqQues3.put("c", " main()");
                mcqQues3.put("d", " init()");

                Question q3 = new Question("❓ Question 3\n Which method is the entry point of a Java program ?",
                                mcqQues3,
                                "c");

                javaQuestion.add(q3);
                HashMap<String, String> mcqQues4 = new HashMap<>();
                mcqQues4.put("a", " int ");
                mcqQues4.put("b", " float");
                mcqQues4.put("c", " string ");
                mcqQues4.put("d", " boolean");

                Question q4 = new Question("❓ Question 4\n Which of the following is not a Java data type?\n", mcqQues4,
                                "c");

                javaQuestion.add(q4);
                HashMap<String, String> mcqQues5 = new HashMap<>();

                mcqQues5.put("a", " .");
                mcqQues5.put("b", " ,");
                mcqQues5.put("c", " :");
                mcqQues5.put("d", " ;");
                Question q5 = new Question(" ❓ Question 5\n Which symbol is used to end a statement in Java?\n",
                                mcqQues5, "d");

                javaQuestion.add(q5);
                HashMap<String, String> mcqQues6 = new HashMap<>();
                mcqQues6.put("a", " Console");
                mcqQues6.put("b", " Scanner");
                mcqQues6.put("c", " InputReader");
                mcqQues6.put("d", " DateInput");
                Question q6 = new Question(" ❓ Question 6\n Which of these is used to take input in Java?\n", mcqQues6,
                                "b");

                javaQuestion.add(q6);
                HashMap<String, String> mcqQues7 = new HashMap<>();
                mcqQues7.put("a", " =");
                mcqQues7.put("b", " ==");
                mcqQues7.put("c", " :=");
                mcqQues7.put("d", " !=");

                Question q7 = new Question(" ❓ Question 7\n Which operator is used for comparison?\n", mcqQues7, "b");

                javaQuestion.add(q7);
                HashMap<String, String> mcqQues8 = new HashMap<>();
                mcqQues8.put("a", " print()");
                mcqQues8.put("b", " echo()");
                mcqQues8.put("c", " System.out.println()");
                mcqQues8.put("d", " output()");

                Question q8 = new Question(" ❓ Question 8\n Which of the following is used to print output in Java?\n",
                                mcqQues8,
                                "c");
                javaQuestion.add(q8);

                HashMap<String, String> mcqQues9 = new HashMap<>();
                mcqQues9.put("a", " implement");
                mcqQues9.put("b", " extends");
                mcqQues9.put("c", " inharits");
                mcqQues9.put("d", " super");

                Question q9 = new Question("❓ Question 9\n Which keyword is used to inherit a class in Java?\n",
                                mcqQues9, "b");
                javaQuestion.add(q9);
                HashMap<String, String> mcqQues10 = new HashMap<>();
                mcqQues10.put("a", " for loop");
                mcqQues10.put("b", " while loop");
                mcqQues10.put("c", " do-while loop");
                mcqQues10.put("d", " foreach loop");

                Question q10 = new Question(" ❓ Question 10\n Which loop is guaranteed to execute at least once?\n",
                                mcqQues10,
                                "c");
                javaQuestion.add(q10);

                categoryQuestion.put("java", javaQuestion);



                List<Question> sciencQuestion = new ArrayList<>();
                HashMap<String, String> mcq1 = new HashMap<>();

                mcq1.put("a", " Mars");
                mcq1.put("b", " Mars");
                mcq1.put("c", " Earth");
                mcq1.put("d", " Jupiter");

                Question SQ1 = new Question("❓Question 1 \nWhat planet do we live on?", mcq1, "");
                sciencQuestion.add(SQ1);
                HashMap<String, String> mcq2 = new HashMap<>();
                mcq2.put("a", "Oxygen");
                mcq2.put("b", "Carbon Dioxide");
                mcq2.put("c", "Nitrogen");
                mcq2.put("d", "Hydrogen");

                Question SQ2 = new Question("❓Question  2\n What gas do plants absorb from the atmosphere?", mcq2, "b");
                sciencQuestion.add(SQ2);
                HashMap<String, String> mcq3 = new HashMap<>();
                mcq1.put("a", "50°C");
                mcq1.put("b", "75°C");
                mcq1.put("c", "100°C");
                mcq1.put("d", "150°C");

                Question SQ3 = new Question("❓Question 3 \n What is the boiling point of water?", mcq3, "c");
                sciencQuestion.add(SQ3);
                HashMap<String, String> mcq4 = new HashMap<>();
                mcq1.put("a", "Root");
                mcq1.put("b", "Stem");
                mcq1.put("c", "Leaf");
                mcq1.put("d", "Flower");

                Question SQ4 = new Question("❓Question 4 \n Which part of the plant makes food?", mcq4, "c");
                sciencQuestion.add(SQ4);
                HashMap<String, String> mcq5 = new HashMap<>();
                mcq1.put("a", "Magnetism");
                mcq1.put("b", "Friction");
                mcq1.put("c", "Gravity");
                mcq1.put("d", "Electricity");

                Question SQ5 = new Question("❓Question 5 \n What force pulls objects toward the Earth?", mcq5, "c");
                sciencQuestion.add(SQ5);
                HashMap<String, String> mcq6 = new HashMap<>();
                mcq1.put("a", "Heart");
                mcq1.put("b", "Brain");
                mcq1.put("c", "Lungs");
                mcq1.put("d", "Liver");

                Question SQ6 = new Question("❓Question 6 \n Which organ helps us breathe?", mcq6, "c");
                sciencQuestion.add(SQ6);
                HashMap<String, String> mcq7 = new HashMap<>();
                mcq1.put("a", "Oxygen");
                mcq1.put("b", "Hydrogen");
                mcq1.put("c", "Water");
                mcq1.put("d", "Salt");

                Question SQ7 = new Question("❓Question 7 \n What is H₂O commonly known as?\\n ", mcq7, "c");
                sciencQuestion.add(SQ7);
                HashMap<String, String> mcq8 = new HashMap<>();
                mcq1.put("a", "Ear");
                mcq1.put("b", "Nose");
                mcq1.put("c", "Eye");
                mcq1.put("d", "Skin");

                Question SQ8 = new Question("❓Question 8 \nWhich sense organ helps us see?", mcq8, "c");
                sciencQuestion.add(SQ8);
                HashMap<String, String> mcq9 = new HashMap<>();
                mcq1.put("a", " Moon");
                mcq1.put("b", "Earth");
                mcq1.put("c", "Sun");
                mcq1.put("d", "Mars");

                Question SQ9 = new Question("❓Question 9 \nWhat is the center of our solar system?\n", mcq9, "c");
                sciencQuestion.add(SQ9);
                HashMap<String, String> mcq10 = new HashMap<>();
                mcq1.put("a", " Tiger");
                mcq1.put("b", " Elephant");
                mcq1.put("c", "Lion ");
                mcq1.put("d", " Bear");

                Question SQ10 = new Question("❓Question 10 \nWhich animal is known as the “King of the Jungle", mcq10,
                                "d");

                sciencQuestion.add(SQ10);
                categoryQuestion.put("Science", sciencQuestion);

 




                List<Question> gkQuestion= new ArrayList<>();
                HashMap<String ,String> gmcq1= new HashMap<>();
                gmcq1.put( " a",  "Mumbai");
                gmcq1.put( "b",  "New Delhi");
                gmcq1.put( "c",  " Kolkata");
                gmcq1.put( "d",  "chennai");
                Question GkQ1=new Question( "❓Question 1 \n What is the capital of India?", gmcq1,  "b");
                gkQuestion.add(GkQ1);
 


                HashMap<String ,String> gmcq2= new HashMap<>();
                 gmcq1.put( " a",  "Jawaharlal Nehru");
                gmcq1.put( "b",  "Subhas Chandra Bose");
                gmcq1.put( "c",  "Mahatma Gandhi");
                gmcq1.put( "d",  "Bhagat Singh");
                Question GkQ2=new Question( "❓Question 2 \n Who is known as the Father of the Nation in India?", gmcq1,  "c");
gkQuestion.add(GkQ2);


 


                HashMap<String ,String> gmcq3= new HashMap<>();
                 gmcq1.put( " a",  "Venus");
                gmcq1.put( "b",  "Mars");
                gmcq1.put( "c",  "Jupiter");
                gmcq1.put( "d",  "Saturn");
                Question GkQ3=new Question( "❓Question 3 \n Which planet is known as the Red Planet?", gmcq3,  "b");
gkQuestion.add(GkQ3);




 
 


                HashMap<String ,String> gmcq4= new HashMap<>();
                 gmcq1.put( " a",  "5");
                gmcq1.put( "b",  "6");
                gmcq1.put( "c",  "7");
                gmcq1.put( "d",  "8");
                Question GkQ4=new Question( "❓Question 4 \n How many continents are there in the world?", gmcq4,  "c");


gkQuestion.add(GkQ4);


 

                 HashMap<String ,String> gmcq5= new HashMap<>();
                 gmcq1.put( " a",  "Atlantic Ocean");
                gmcq1.put( "b",  "Indian Ocean");
                gmcq1.put( "c",  "Pacific Ocean");
                gmcq1.put( "d",  " Arctic Ocean");
                Question GkQ5=new Question( "❓Question 5 \n What is the largest ocean on Earth?", gmcq5,  "c");

gkQuestion.add(GkQ5);


 
                 HashMap<String ,String> gmcq6= new HashMap<>();
                 gmcq1.put( " a",  "Isaac Newton");
                gmcq1.put( "b",  "Albert Einstein");
                gmcq1.put( "c",  "Thomas Edison");
                gmcq1.put( "d",  "Nikola Tesla");
                Question GkQ6=new Question( "❓Question 6 \n Who invented the light bulb?", gmcq6,  "c");

gkQuestion.add(GkQ6);



 

                 HashMap<String ,String> gmcq7= new HashMap<>();
                 gmcq1.put( " a",  "Lion");
                gmcq1.put( "b",  "Elephant");
                gmcq1.put( "c",  "Tiger");
                gmcq1.put( "d",  "Leopard");
                Question GkQ7=new Question( "❓Question 7 \n  What is the national animal of India?", gmcq7,  "c");


gkQuestion.add(GkQ7);

 

                 HashMap<String ,String> gmcq8= new HashMap<>();
                 gmcq1.put( " a",  "Oxygen");
                gmcq1.put( "b",  "Nitrogen");
                gmcq1.put( "c",  "Carbon Dioxide");
                gmcq1.put( "d",  "Hydrogen");
                Question GkQ8=new Question( "❓Question 8 \n Which gas do plants use during photosynthesis?", gmcq8,  "c");

gkQuestion.add(GkQ8);



 

                 HashMap<String ,String> gmcq9= new HashMap<>();
                 gmcq1.put( " a",  "Rabindranath Tagore");
                gmcq1.put( "b",  " Bankim Chandra Chatterjee");
                gmcq1.put( "c",  " Sarojini Naidu");
                gmcq1.put( "d",  " Premchand");
                Question GkQ9=new Question( "❓Question 9 \n Who wrote the Indian National Anthem?", gmcq9,  "a");


gkQuestion.add(GkQ9);



 
                 HashMap<String ,String> gmcq10= new HashMap<>();
                 gmcq1.put( " a",  "Doller");
                gmcq1.put( "b",  " Yen");
                gmcq1.put( "c",  "won");
                gmcq1.put( "d",  "Peso");
                Question GkQ10=new Question( "❓Question 10 \n  What is the currency of Japan?", gmcq10,  "b");


gkQuestion.add(GkQ10);



                categoryQuestion.put( "gk", gkQuestion);

                return categoryQuestion;
        }
}
