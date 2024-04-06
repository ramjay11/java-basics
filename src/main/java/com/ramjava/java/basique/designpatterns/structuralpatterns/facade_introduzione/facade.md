The Facade Pattern makes a complex interface easier to use, using a Facade class. The Facade Pattern provides a unified interface
to a set of interface in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
The Facade unifies the complex low-level interfaces of a subsystem in-order to provide a simple way to access that interface. It
just provides a layer to the complex interfaces of the sub-system which makes it easier to use.
The Facade do not encapsulate the subsystem classes or interfaces; it just provides a simplified interface to their functionality. A
client can access these classes directly. It still exposes the full functionality of the system for the clients who may need it.
A Facade is not just only able to simplify an interface, but it also decouples a client from a subsystem. It adheres to the Principle
of Least Knowledge, which avoids tight coupling between the client and the subsystem. This provides flexibility: suppose in the
above problem, the company wants to add some more steps to start or stop the Schedule Server, that have their own different
interfaces. If you coded your client code to the facade rather than the subsystem, your client code doesn’t need to be change, just
the facade required to be changed, that’s would be delivered with a new version to the client.