# Strategy pattern.

Strategy pattern comes in handy when inheritance is used extensively to redefine the behaviour of the child classes 
importing functionality from the parent class and overriding them in the child class.

To avoid such pit falls for the overridden functionality an interface is extracted as made as a has a dependency in the 
parent class.

In this illustration we can observe that rather than overriding the drive() function in each child class because the 
requested behaviour is different it has extracted to an interface with multiple implementations for the strategy.