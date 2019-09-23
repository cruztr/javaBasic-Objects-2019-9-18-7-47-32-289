### should_customize_exception()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with throwing customized exceptions

2.Why the test failed at first?
* Because of the lacks the logic for throwing customized exception

3. Why you corrected the test that way?
* Because StringFormatException extends Exception 

4. Do you have further questions on this knowledge point?
* No questions so far.



### should_customize_exception_continued()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with throwing customized exceptions

2.Why the test failed at first?
* Because of the lacks the logic for throwing customized exception for the other constructor

3. Why you corrected the test that way?
* Because StringFormatException extends Exception and this time, StringFormatException has 2 parameters that was passed

4. Do you have further questions on this knowledge point?
* No questions so far.



### should_be_careful_of_the_order_of_finally_block()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with the finally block

2.Why the test failed at first?
* Because of the incorrect expected result

3. Why you corrected the test that way?
* Because a finally blocked is always executed after the try or catch block 

4. Do you have further questions on this knowledge point?
* No questions so far.



### should_use_the_try_pattern()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with the try block

2.Why the test failed at first?
* Because of the incorrect expected result

3. Why you corrected the test that way?
* Because of the existing logic for a try block

4. Do you have further questions on this knowledge point?
* No questions so far.



### should_call_closing_even_if_exception_throws()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with the try catch block

2.Why the test failed at first?
* Because of the incorrect expected result

3. Why you corrected the test that way?
* Because of the existing logic for a try block which executes the one inside the () and the one in the actual block

4. Do you have further questions on this knowledge point?
* No questions so far.



### should_get_method_name_in_stack_frame()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with StackTraceElement

2.Why the test failed at first?
* Because the expected result is empty

3. Why you corrected the test that way?
* Because we can get the className and methodName from the StackTraceElement

4. Do you have further questions on this knowledge point?
* No questions so far.