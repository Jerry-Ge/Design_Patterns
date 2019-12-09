# Observer Pattern

## For each pattern, we have few question need to be asked?
- What's the name?
    - Observer 
- When to apply this pattern?
    - When you need many other objects to receive an update when another object changes
        - E.g. Stock market with thousands of stocks need to send updates to objects representing individual stocks
        - E.g. The Subject (publisher) sends many stocks to the Observers
        - E.g. The Observers (subscribers) takes the ones they want and use them  
- What's the solution? (Example Code)


## Advantages
- Loose Coupling: The subject (publisher) doesn't need to know anything about the Observers(subscribers)

## Disadvantages:
- The Subject(publisher) may send updates that don't matter to the Observer(subscriber)

