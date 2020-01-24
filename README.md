# Bank-Application
A simple Java bank account application that does the following:

  1. Read a .csv file of names, social security numbers, account type and initial deposit
  2. Use a proper data structure to hold all these accounts
  3. Both savings and checking accounts share the following properties:
          _deposit()_
          _withdraw()_
          _transfer()_
          _showInfo()_
          
        _11-Digit Account number (generated with the folowing process: 1 or 2 depending on Savings or Checking, last two digits of SSN,   unique 5-digit number and random 3-digit number)_ 
          
   4. Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accesed with a 4-digit code
   5. Checking Account holders are assigned a Debit Card with a 12-digit number and a 4-digit PIN
   6. Both accounts will use an interface that determines the base interests rate
   
       _Savings accounts will use .25 points less than base rate_
       
       _Checking accounts will use 15% of the base rate_
       
   7. The showInfo method should reveal relevant account information as well as information specific to the Checking account or Savings account
   
          
### What I've learnt
This is what I've learnt with this project:

  - Develop a robust aplication architecture
  - When to use abstract classes and abstract methods
  - Use and interface API to receive information from a developer's application
  - Explore access modifiers and when to use public, private or protected
  - Read data from a file and store in an appropriate data structure
  - Generate random numbers and work with String API
