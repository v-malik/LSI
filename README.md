LSI
===

Lean Startup Inc

Overview: The purpose of this is to provide insight in your understanding of Object Oriented Design (OOD) and SOLID principles. The solution needs to be built incremen-tally and to support all use cases. For example, Use Case #2 is an enhancement from User Case #1 including the Unit Test. Please allow yourself enough time to write main-tainable code that has adequate test coverage. During your 2nd interview you will be expected to present your working code and to explain your design decisions. 

Background: 
Lean Startup Inc has an application that allows vendors to monitor their construction projects. 

Use Case 1. 
There is a fee for using the application. The fee is calculated based on the invoices sent by the vendors using the following rules:
1. assess a 20% fee for any amount below $100,000. 
2. assess a 10% fee for any amount above $100,000. 

Calculate the fee for an arbitrary amount x. 
Examples: 
- Given a $50,000 invoice the fee should be $10,000. 
- Given a $200,000 invoice the fee should be $30,000.

Use Case 2. 
Requirements change. They always do. 
1. assess a 20% fee for any amount below $100,000. 
2. assess a 10% fee for any amount between $100,000 and $500,000. 
3. assess a 5% fee for any amount above $500,000

Calculate the fee for an arbitrary amount x. 
Example: Given a $600,000 invoice the fee should be $65,000. 

Use Case 3. 
Modify the solution for Use Case 2 to handle an arbitrary number of fee ranges.

Use Case 4. 
Total invoice amount paid to date is called cost basis. Calculate the fee for a new invoice assuming an existing cost basis.

Example (using fees from Use Case 2): 
Given a cost basis of $400,000 and a new invoice for $200,000, the fee for the new in-voice should be $15,000! 

Note: Some requirements are intentionally vague, please feel free to ask any relevant questions.
