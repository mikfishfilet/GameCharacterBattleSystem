# Game Character Battle

## Description

This project is a Java program that demonstrates **inheritance, constructors, exception handling, method overriding, and object-oriented programming**.

The program creates different types of game characters and allows them to attack each other. Each character has a name, health, and attack power.

The project includes three character types:

* Warrior
* Mage
* Archer

Each character type has its own unique attack message while still using the same basic character functionality.

## Files

### GameCharacter.java

The parent class for all game characters.

It includes:

* Character name
* Health
* Attack power
* Constructor validation
* Getters
* `isAlive()` method
* `takeDamage()` method
* `attack()` method
* `displayInfo()` method

### Warrior.java

A subclass of `GameCharacter`.

The Warrior attacks another character using a sword.

### Mage.java

A subclass of `GameCharacter`.

The Mage attacks another character by casting a spell.

### Archer.java

A subclass of `GameCharacter`.

The Archer attacks another character by shooting an arrow.

### Main.java

Contains the main method and tests the game character classes.

It demonstrates:

* Creating characters
* Displaying character information
* Attacking other characters
* Updating character health
* Handling exceptions
* Testing invalid actions

## Exception Handling

The program uses exceptions to prevent invalid actions.

Examples include:

* Creating a character with a blank name
* Creating a character with zero or negative health
* Creating a character with zero or negative attack power
* Applying negative damage
* A defeated character trying to attack
* Attacking a character who is already defeated

These exceptions are handled using `try` and `catch` blocks in `Main.java`.

## Concepts Demonstrated

This project demonstrates several Java programming concepts:

* Classes and objects
* Inheritance
* Constructors
* `super()`
* Method overriding
* Encapsulation
* Getters
* Exception handling
* `try`/`catch`
* Conditional statements
* Method calls
* Object interaction

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure all five Java files are in the same project/package.
3. Open `Main.java`.
4. Run the `main()` method.
5. View the character information, battle actions, and exception messages in the console.

## Example Output

```text
=== GAME CHARACTERS ===

--- Starting Information ---
Name: Thor
Health: 100
Attack Power: 25
Alive: true

Name: Merlin
Health: 80
Attack Power: 30
Alive: true

Name: Robin
Health: 90
Attack Power: 20
Alive: true

--- Battle Begins ---
Thor attacks Merlin with a sword!
Merlin casts a spell at Thor!
Robin shoots an arrow at Thor!

--- Updated Health ---
Thor health: 50
Merlin health: 55
Robin health: 90

--- Testing Exceptions ---
Exception caught: Starting health must be greater than zero.
Exception caught: Character name cannot be blank.
Exception caught: Damage cannot be negative.
Exception caught: Thor is defeated and cannot attack.
Exception caught: Thor is already defeated and cannot be attacked.

=== GAME OVER ===
```

## Author

Created as a Java programming assignment demonstrating object-oriented programming and exception handling.
