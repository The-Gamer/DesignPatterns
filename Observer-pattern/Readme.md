# Observer pattern

There are 2 main components in Observer patterm,
- Observable
- Observer

When there is a state change in the Observable then it will update all the observers subscribed to it.

It can be implemented using the Observable interface and the Observer interface.

Methods of Observable interface
- add
- remove
- notify

Methods of Observer interface
- update

The relationship Observable and Observer is of has a type.
Observable will have a list of Observers to notify.

