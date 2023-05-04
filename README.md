# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
When designing the game, there were a lot of decisions to make regarding how the gameplay mechanics would work. In the case of the game I worked on for my final project, I had to choose between allowing the player to choose a random place for their game piece to land or using a random number generator to select for them. While the former option seemed like a fun and interactive idea, it quickly became apparent that it would be too complicated to implement in a text-based game like this one. There would have been too many variables to consider, and it would have been difficult to ensure that the game remained fair for all players involved. Therefore, I decided to use a random number generator to give the user a random question to respond to and determine where their game piece would land on the game board. This approach still keeps the user engaged with the game since the questions range from easy to hard. To keep the game fun, engaging, and challenging, I challenged myself to create a random number generator that eventually reached a certain number and allowed the user to keep track of their location on the game board. That's why I chose this option.

The other alternative I considered was to have a set number of questions to answer instead of a specific location to reach on the game board. This would have allowed the user to collect a certain number of points and made the game more even among all players since the number of questions given could greatly vary. However, I ultimately chose the option to get to a certain place on the game board as it made the game more realistic and resembled a traditional game. I also kept track of points to make it engaging for the user. Additionally, creating a random number generator added a fun element to the game and made it more engaging for the player.
 - A map of your game's layout (if applicable)
As attached as CSC final proj game board.
 - `cheatsheet.md`
 - Completed `rubric.md`
  
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?
My main approach to tackling this project was figuring out how to match the questions with the correct responses and ensure that the points were allocated accordingly. This turned out to be the most challenging aspect of designing the game, as I had to make sure that users were giving replies that matched the correct answers. I created a 'map' idea to connect the game's spots, questions, and answers to each other, much like the earlier projects we had discussed in class and in homework assignments. This approach allowed me to connect all parts of my project and create an interactive text-based game that visually shows the user how their game piece was moving while also ensuring that the correct answers were given. I also incorporated points into all the questions to determine the user's level at the end of the game by calculating the number of correct versus incorrect answers they had.

- What **new thing(s)** did you learn / figure out in completing this project?
The first thing I learned how to do in this project was to create ASCII art. I hadn't done this before, but I observed how other groups did it during the final project reviews and found it incredibly fun.

I also figured out how to create the multiple-choice response from the map by calculating whether a question was correct or incorrect. I assigned a value to both the correct and incorrect answers and allotted the user a certain point value based on their response to the question. This game had randomization in the order of questions, which made it difficult to assign values.
 - Is there anything that you wish you had **implemented differently**?
I wish I could have implemented more visual elements in this game, such as showing the user how their piece moved after each question was prompted and visually walking them through their gameboard. If I had done this, I would have created a system where each map piece aligned with a certain image that showed the piece's location on the gameboard. However, this would have been an intensive process since I would have needed to create images for all individual map pieces.

I am not sure if I could have implemented this differently, but I wanted to address an issue that arose when categorizing players based on their level of competence. It was challenging to determine the exact number of points required for a player to reach a certain level because questions were given at random intervals, and the number of questions could vary greatly among players. For instance, some players could have far fewer questions than others due to the random nature of the game. As a result, it was possible for a player to achieve a master status without necessarily answering all the questions correctly, including the Olympics master level. Ideally, I would have preferred to implement a system where a player could only reach the Olympics master status by answering all the questions correctly. However, I was unable to figure out how to achieve this given the random nature of the game. Since there was no set maximum number of points that a player could earn, I chose to use the destination tile as the goal rather than a maximum point threshold.

 - If you had **unlimited time**, what additional features would you implement?
Above, I mentioned something I would have liked to implement and learn how to connect. I wasn't sure how to get a location on the map to connect to an image or ASCII art, but it's something I would have liked to learn. Additionally, I had a very difficult time creating a "redo" feature to allow a user to redo a question prompted by the game, and I would have liked to learn how to do this to create a more interactive game. However, I ultimately decided not to include this feature since a player can't "re-roll" or choose a different tile on the gameboard. Even if the user doesn't know how to answer the question, they must answer it and continue playing the game.

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
There were several pieces of feedback I received from my peers and professors while working on this final project. One piece of feedback I received during class discussion and review was to print out the correct answer for a user after they have already selected their answer so they can keep track of what's right and wrong. Another piece of feedback I received was to use a list feature (map) to allow randomization of the components of the game, such as randomly landing on a spot that correlates with a question and an incorrect or correct response.

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
To go to office hours and be open to suggestions from peers both in and outside of class. It is hard to ask for help, but it is also important to in working through this problem. Getting stuck on parts was frusrating when coding, especailly this text-based project, and it's important to remember to take a step back and then get back to coding when your head is clear. 

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
inapplicable. 


