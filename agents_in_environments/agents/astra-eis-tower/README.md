# Part 4: Everythings Blockilicious!


The final task is to revise your program to work with towers of any size (so long as the blocks exist). 

Start by modifying the !tower(...) goal to reflect a tower of unknown height. Next, modify the deliberation rules so that they trigger the creation of towers of different heights (you can choose the specific tower configurations you use). 

Finally, when the g block is created, modify the agent to satisfy the goal
!random_tower(...) which creates and builds a random tower containing blocks a-g. 

Once the tower is built the agent should sleep for 20 seconds and then repeat (create and build another random tower, sleep and repeat again).


![](../../towers.gif)




# astra-eis-tower

This is a minimal implementation of an Environment Interface Standard (EIS) project
that is configured for the [tower](https://github.com/eishub/tower) environment.

#Requirements

To run this project, you must install the following:

* [Maven 3.3+](http://apache.maven.org
* A Java 1.8 JDK/JRE (required due to EIS)

Simply clone the project, go to the project root folder and type `mvn` to run the
project.

# NOTES

* To shutdown the environment, you must manually kill the associated Java process (at least in windows)
* A default goal has been set up for this project that includes the maven-dependencies-plugin.  This is necessary to copy the environment jar file into the `target/dependencies` folder of the ASTRA project.
