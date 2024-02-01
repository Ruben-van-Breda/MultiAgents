# Part 4: Introducing players with different strategies. 

Introducing players with `different strategies.` 

To achieve this, you need to use the inheritance mechanism of ASTRA. Start by creating a new program called `LinearPlayer.astra.` This program should look as follows:

        agent LinearPlayer extends Player {
        }
Copy all the strategy rules (the +!move() rules) into the new program and delete them from Player.astra. 

Modify the Main agent to use LinearPlayer instead of Player. The game outcome should be the same.
Create another program called `Opponent.astra` and implement an alternative strategy that can beat the strategy specified in LinearPlayer.astra. Modify you Main rule to may player2 be the Opponent agent.

Finish by trying to create a` better strategy `in a file called Better.astra. 

![](../Doc/part4.png)


![](../Doc/part4-better.png)