# Chap18TicTacToeGame
Chap 18 Tic Tac Toe Game

The chapter discusses a Tic Tac Toe game. You need to implement that project and enhance it. The basic code is available in the chapter files.

The enhancements you need to add are: checking if the user clicks on a square that has already been clicked; checking if game is over because there are no more moves (a tie); checking if game is over because a player got 3 marks in a row; resetting the board after a game is over so the user can play again.

You will need to use a 3x3 array for the buttons to be able to check them to determine if the game is over.

The code provided in the book checks if the button clicked is empty and if so, applies a mark to that button. Expand that to display a message if the button clicked is NOT empty. Tell the user the button has already been clicked and let them try again (don’t switch to the other player’s turn). Identify which player clicked a non-empty button in the message. Here is a sample session when player X clicked on the center button that was already marked with an “O”:

Ch 18 Tic Tac Toe spot taken

You will need to add helper methods to check if the game is over either because the last player got 3 in a row or because the last spot was selected so there are no other possible moves. The book suggests several ways to check if a player got 3 in a row. Here is a sample session:

Ch 18 Tic Tac Toe game over

Here is a sample session if there is no winner:

Ch 18 Tic Tac Toe no moves

Once the game is over, whether because there is a winner or because there are no more moves, clicking on the OK button clears the board and restarts the game. No matter which player won or had the last turn, the first player of every game is player X.

Play the game and take 6 screenshots: (1) when player X tried to use an already-used spot, (2) when player Y tried to use an already-used spot, (3) when player X wins, (4) when player Y wins, (5) when the game is over because there are no more moves, (6) the clean board after a game ends, before the next game begins.

 

Submission: the specified screenshots and the root folder for the project

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
email me at **bellKevin@pm.me** for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
