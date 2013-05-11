CodeJam Qualification Round Problem Solutions
------------
The Qualification Round for Code Jam 2013 kicked off on April 12. 
Here are my submissions for Google's CodeJam problems, written in Java.

------------



**Tic-Tac-Toe-Tomek**

Tic-Tac-Toe-Tomek is a game played on a 4 x 4 square board. The board starts empty, except that a single 'T' symbol may appear in one of the 16 squares. There are two players: X and O. They take turns to make moves, with X starting. In each move a player puts her symbol in one of the empty squares. Player X's symbol is 'X', and player O's symbol is 'O'.

After a player's move, if there is a row, column or a diagonal containing 4 of that player's symbols, or containing 3 of her symbols and the 'T' symbol, she wins and the game ends. Otherwise the game continues with the other player's move. If all of the fields are filled with symbols and nobody won, the game ends in a draw. See the sample input for examples of various winning positions.

Given a 4 x 4 board description containing 'X', 'O', 'T' and '.' characters (where '.' represents an empty square), describing the current state of a game, determine the status of the Tic-Tac-Toe-Tomek game going on. The statuses to choose from are:

"X won" (the game is over, and X won)
"O won" (the game is over, and O won)
"Draw" (the game is over, and it ended in a draw)
"Game has not completed" (the game is not over yet)
If there are empty cells, and the game is not over, you should output "Game has not completed", even if the outcome of the game is inevitable.


**Lawnmower**

Alice and Bob have a lawn in front of their house, shaped like an N metre by M metre rectangle. Each year, they try to cut the lawn in some interesting pattern. They used to do their cutting with shears, which was very time-consuming; but now they have a new automatic lawnmower with multiple settings, and they want to try it out.

The new lawnmower has a height setting - you can set it to any height h between 1 and 100 millimetres, and it will cut all the grass higher than h it encounters to height h. You run it by entering the lawn at any part of the edge of the lawn; then the lawnmower goes in a straight line, perpendicular to the edge of the lawn it entered, cutting grass in a swath 1m wide, until it exits the lawn on the other side. The lawnmower's height can be set only when it is not on the lawn.

Alice and Bob have a number of various patterns of grass that they could have on their lawn. For each of those, they want to know whether it's possible to cut the grass into this pattern with their new lawnmower. Each pattern is described by specifying the height of the grass on each 1m x 1m square of the lawn.

The grass is initially 100mm high on the whole lawn.

**Fair and Square**

Little John likes palindromes, and thinks them to be fair (which is a fancy word for nice). A palindrome is just an integer that reads the same backwards and forwards - so 6, 11 and 121 are all palindromes, while 10, 12, 223 and 2244 are not (even though 010=10, we don't consider leading zeroes when determining whether a number is a palindrome).

He recently became interested in squares as well, and formed the definition of a fair and square number - it is a number that is a palindrome and the square of a palindrome at the same time. For instance, 1, 9 and 121 are fair and square (being palindromes and squares, respectively, of 1, 3 and 11), while 16, 22 and 676 are not fair and square: 16 is not a palindrome, 22 is not a square, and while 676 is a palindrome and a square number, it is the square of 26, which is not a palindrome.

Now he wants to search for bigger fair and square numbers. Your task is, given an interval Little John is searching through, to tell him how many fair and square numbers are there in the interval, so he knows when he has found them all.


