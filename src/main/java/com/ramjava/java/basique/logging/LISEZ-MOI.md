Why log? Why not use System.out.println()?

Logging has the concept of levels of severity.
System.out.println() does not.

Logging can send output on multiple places.

Who ever looks at system.out.println() output?

Are you using System.out.println() instead of the debugger?

Log Level
OFF - Turn off all logging.
FATAL - The program will crash.
ERROR - An exception occurred.
WARN - Something doesn't feel right.
INFO - Normal course of business, but don't be too verbose!
DEBUG - Fine grained level for debugging.
TRACE - Very fine grained level for watching every step execute.
ALL - Show all logging messages.

Understanding Log4j
Log4j has 2 main concepts:
- Loggers: Gather logging information from code.
- Appenders: Write logs to an output source: file, console, database, etc.

Loggers can subscribe to multiple appenders.

Both loggers and appenders can set a filter level