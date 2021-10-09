#Handling Exceptions
####● Two ways of handling exception
#####○ try-catch-finally
#####○ throws keyword
#####● Try-catch-finally handles exception where it occurs



#Try-Catch-Finally
####Consists of Three parts
######1.Try Block
######Risky codes goes here eg: System.out.println(5/0);
######2.Catch block
######   Handler code goes here eg:  System.out.println(e.getMessage());
######3.Finally Block
######This will executed even though exception occurred or not Only JVM shutdown stop executing this part

#####● Try block can’t exist without catch block or finally block
#####● Catch or finally blocks cannot exist without try block