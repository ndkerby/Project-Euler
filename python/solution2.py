# PROBLEM 2:
#    Each new term in the Fibonacci sequence is generated by adding 
#    the previous two terms. By starting with 1 and 2, the first 10 
#    terms will be:
#
#        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
#
#    By considering the terms in the Fibonacci sequence whose values 
#    do not exceed four million, find the sum of the even-valued 
#    terms.
#
# ANSWER: 
#    The sum is: 4613732
#
# @author ndkerby
#

max = 4000000

currentNumber = 1
previousNumber = 1

sum = 0

while True:
	newNumber = currentNumber + previousNumber
	previousNumber = currentNumber
	currentNumber = newNumber
	if currentNumber%2 == 0:
		sum += currentNumber
	if currentNumber >= max:
		break

print("The sum is: " + sum )