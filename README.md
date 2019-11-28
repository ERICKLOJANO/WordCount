# WordCount


PROBLEM:
In this program I had a text file as an input and had to find the amount of times a word repeated in the text file


SOLUTION:
In order to find the solution to the problem, I used a hashmap... this allowed me to insert words and pairing it with a number(Key & Value).

At first, I created the hashmap, and then initialized the BufferedReader so it can read the "file.txt"
The bufferedReader will then take care of reading each line in the text file
In my code, I made sure to lower case each word, and to split each sentence into multiple strings when the code detected a space in between

Then, I made sure to put each string in the array Words,
and used a for loop to check whether the word being checked, has already been repeated.

If the word has been repeated then the value gets increased by 1, if not then the value gets set at 1.

I then, put the values from the word count hashmap into a set, so i can organize them from Highest to Lowest by using collection sort
I compare both the values from each entry, and then organize them.

INSTRUCTIONS:

1. Download the WordCountProgram.java 
2. Download "file.txt" and drag it into "C:\\" folder
3. run program

TOOLS USED:


java.io.BufferedReader
java.io.FileReader
java.io.IOException;
java.util.ArrayList;
java.util.Collections;
java.util.Comparator;
java.util.HashMap;
java.util.List;
java.util.Map.Entry;
java.util.Set;



INPUT/ OUPUT:

Input:

'Cause it's too cold for you here
And now, so let me hold
Both your hands in the holes of my sweater
And if I may just take your breath away
I don't mind if there's not much to say
Sometimes the silence guides a mind
To move to a place so far away
The goosebumps start to raise
The minute that my left hand meets your waist
And then I watch your face
Put my finger on your tongue

Ouput:

Words and how often they repeated:
5 : your
4 : the
4 : to
3 : my
3 : and
3 : i
2 : if
2 : away
2 : so
2 : mind
2 : a
1 : hands
1 : don't
1 : sometimes
1 : put
1 : 'cause
1 : hold
1 : that
1 : guides
1 : far
1 : me
1 : raise
1 : let
1 : sweater
1 : silence
1 : you
1 : there's
1 : meets
1 : now,
1 : in
1 : it's
1 : then
1 : both
1 : take
1 : left
1 : goosebumps
1 : waist
1 : much
1 : here
1 : tongue
1 : for
1 : cold
1 : breath
1 : not
1 : too
1 : of
1 : place
1 : just
1 : holes
1 : hand
1 : on
1 : finger
1 : move
1 : may
1 : start
1 : say
1 : minute
1 : face
1 : watch
