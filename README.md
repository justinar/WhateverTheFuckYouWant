# WhateverTheFuckYouWant

Tetris	Difficult - 736a69	ACM Weekly Chal. Oct 21-Oct 31

Games are fun. Winning is more fun. So why don’t we write a program to play the perfect round of tetris? The first 3 lines of input represent the dropped square as 9 characters (3 characters per line, 3 lines). An X character represents a block, while a _ character represents empty space. The only Tetrominoes used will be the classic 4 used in Tetris, the 4-block bar being excluded because it does not fit within a 3x3 grid. Shown below are our ASCII representations:
___ ___ ___ ___
X__ XX_ _XX _X_
XXX XX_ XX_ XXX
Note that these may appear rotated or reversed when read in.
The next 3 lines of input represent the bottom 3 layers of a tetris board. These will always be 6 characters wide.
Example:
______
XXX___
XXXX_X
Your program’s output will consist of 2 numbers: the first is the offset, the number of characters to move the given block away from the left wall. The second is the rotation, which may only be 0, 90, 180, or 270. Rotation happens counterclockwise, as seen in the example below where the given block is rotated 90 degrees. Both numbers should appear on the same line, separated by a space.
XX_   _X_
_XX   XX_
___   X__
Remember that gravity applies in this game - you cannot fit a piece someplace it cannot fall into.
Also note that due to the symmetry of some pieces it appears that there could be multiple correct solutions - this is solved by defining the “best” solution as the one which rotates the piece by the fewest degrees (See the first example, which could be solved incorrectly by rotating by 270 degrees), which nicely solves many edge case problems.


Example Input
XX_
_XX
___
______
__XXXX
_XXXXX


Example Output
0 90


Example Input
XXX
_X_
___
______
XX___X
XXX_XX


Example Output
2 0


Example Input
_XX
__X
__X
______
XX___X
XX___X


Example Output
2 90
