This is my first year Software Design and Development Project

We were given the following problem and tasks to complete for the program.

Problem Statement
The Crafty Cake Company is a (fictional) local company that makes hand-made cakes. Cakes are
baked in high numbers but due to the delicate nature of the sprinkles, employees are recruited to
apply them by hand. Most of the cakes are finished correctly but a small percentage cannot be sold
due to the sprinkles being applied incorrectly. Each employee is paid for the number of cakes they
cover, their wage is reduced if a cake cannot be sold due to human error.
The company’s products are so popular that they have had to hire more staff, as a result, a
computerised system is required to store, manipulate, and present information about employees
and how many cakes have been covered.
Tasks
You are required to implement the system used to record and show statistics of the employees.
It is sufficient in the following to simply create the required objects in the programme you write.
There is no need to develop any sort of user interface (where the user might enter suitable values),
and there are no marks for doing so.
You should start by thinking about the problem, abstracting from it, and maybe considering whether
you have seen a similar problem anywhere else. The ideas and tools you have met in the Project 1
module will probably also help.
The following grading criteria indicate how marks will be awarded. Your submission will be
considered for a set number of marks up to that specified in each grade criterion. You will receive
marks for what you have done and how you have done it. You only need to submit one grade point,
if in doubt, ask!
Hint: The first two tasks below can be done with just one class. The other tasks will require more.
Up to 12 marks (40%).
Develop one or more classes that would provide a solution to this problem. Create a class to
represent a single employee called Bob, who has covered 100 cakes with sprinkles. Output Bob's
name and wages if they are paid 10p per cake covered (calculate the result, do not just print it out).
Submission of this programme only will likely demonstrate little knowledge of OO principles. Basic
OO principles will be required to achieve the minimum pass mark for the assessment.
Up to 15 marks (50%).
Modify your programme to reflect the following rules of payment. Employees are paid 10p for the
first 50 cakes they cover, and then 15p for all subsequent cakes covered. Show your programme in
operation by creating two employees with different numbers of cakes covered. Make sure that the
amounts to be paid to each are printed out correctly (two decimal places, rounded if needed, £ sign
included, i.e., £12.30). Hint: you now need at least one import.
Submission of this programme will demonstrate a good understanding of OO principles.
Up to 18 marks (60%).
Now, further, develop your programme to allow a team of employees with the following 6
individuals:
o Andrew, who has covered 162 cakes.
o Hafsa, who has covered 34 cakes.
o Ayub, who has covered 193 cakes.
o Amaan, who has covered 309 cakes.
o Gary, who has covered 49 cakes.
o Diane, who has covered 217 cakes.
Add each employee to the team and in a neat table, display the employees’ names, the number of
cakes covered and their wages.
Below the table, display a summary of the team’s performance with the total number of cakes
covered and the total amount of wages to be paid. (Hint: You now need a second class and at least
one import).
Submission up to this programme will demonstrate a very good understanding of OO principles.
Up to 21 marks (70%).
Enhance your programme to allow the number of cakes an employee covers to be increased,
additionally, the penalty for cakes not being suitable for sale due to human error is their total
number of cakes being reduced by the number of unsuitable cakes multiplied by two (i.e. if Bob
incorrectly covers 6 cakes, their new total would be 88). Add and subtract the following values to
the existing employees’ numbers ensuring that only sensible values can be accepted, and show an
error message if an unsuitable value is used:
o Andrew:
 32 additional cakes covered.
 16 cakes not suitable for sale.
o Hafsa:
 44 additional cakes covered.
 21 cakes not suitable for sale.
o Ayub:
 102 additional cakes covered.
 12 cakes not suitable for sale.
o Amaan:
 56 additional cakes covered.
 1 cake not suitable for sale.
o Gary:
 62 additional cakes covered.
 11 cakes not suitable for sale.
o Diane:
 10 additional cakes are covered.
 2 cakes are not suitable for sale.
then, display details of individual employees in a neat table as in the previous grade point.
Submission up to this programme will likely show an excellent understanding of OO principles.
Up to 24 marks (80%).
Further improve your programme to print the list of all the employees in the team, sorted firstly in
descending order of the number of cakes covered, if there are two employees with the same
number then additionally sort those employees by name.
Display the statistics as in the previous programme.
Submission up to this programme will use the correct imported classes and demonstrate an
exceptional understanding of OO principles.
Up to 27 marks (90%).
Some employees are also responsible for quality control, besides covering cakes, they have an extra
responsibility to periodically inspect the cakes covered by other employees. Quality controllers have
the same wage rates and rules as a standard employee plus earn an additional 12% for being a
quality controller.
Complete your programme by adding the functionality to add one or more quality controller(s) to
the same team used in the previous programme.
Create a quality controller called Rabia who has covered 385 cakes, add them to the team and
display the table and statistics as used in the previous programme. Add an identifier (such as ‘QC’) to
denote the quality controller.
If developed correctly, this programme will demonstrate an outstanding understanding of the OO
principles covered in the module.
