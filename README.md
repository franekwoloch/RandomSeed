# RandomSeed
My own application generating a random integer. True randomness was obtained using unsynchronized multithreading and time variable.
##Principles of operation
The application generates a random grain as a result of dividing two numbers. The first number is the value of time at the moment of calling the function counted in nanoseconds. The value of the time variable is not random in any way, but the moment it is called and its accuracy makes it pseudo-random.  

The divisor is a random number from a specific pool. The randomness of the divider results from the multithreaded operation of the application. The function calls a series of unsynchronized threads. Each of the conversations is assigned a number. The number assigned to the conversation that last ended is the divider. Because the threads are unsynchronized and each of them performs time-consuming mathematical operations, the result is actually random.
