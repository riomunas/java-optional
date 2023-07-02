# java-optional
What and how to use optional

source : https://www.youtube.com/watch?v=uEe1S21vSus

orElse : return the value if option is present otherwise returns other

ifPresent : Executed only if optional has a value

ifPresentOrElse : if value is present, performs the given action with the value, otherwise performs the given empty-base action 

avoid using option in:
- method parameter
- class properties

avoid using 3 method:
- isPresent
- isEmpty
- get