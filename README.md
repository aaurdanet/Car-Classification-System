Car Classification System

This Java program implements a simple car classification system using interfaces and abstract classes. It categorizes cars based on weight, size, and cylinder count. The system defines interfaces for weight, size, and cylinder classifications, and it includes an abstract class Car that serves as the base for specific car implementations.
Interfaces
CarWeightClassification and CarWeight

CarWeightClassification provides a method carWeight() for classifying cars based on their weight.
CarWeight defines constants for light, mid, and heavy weight classifications.

CarSizeClassification and CarSize

CarSizeClassification provides a method carSize() for classifying cars based on their size.
CarSize defines constants for SUV, hatchback, coupe, and sedan size classifications.

ClassCylinderClassification and CarCylinder

ClassCylinderClassification provides a method carCylinder() for classifying cars based on their cylinder count.
CarCylinder defines constants for four-cylinder, V6, and V8 cylinder classifications.

Classes
Car

An abstract class representing a generic car with a color attribute.
Provides abstract methods for producing car sound, weight classification, size classification, and cylinder classification.

CarKind

Extends Car and implements the various interfaces for weight, size, and cylinder classifications.
Includes attributes for brand, model, weight, height, and cylinder count.
Overrides methods to provide specific implementations for weight, size, and cylinder classifications.
Includes a toString method for displaying car details.

TestClass

Contains the main method to test the car classification system.
Creates instances of CarKind representing different types of cars and prints their details along with classification information.

How to Use

Run the TestClass to see the classification of different types of cars.
The program will display information about each car, including brand, model, weight, height, and cylinder count.
The classification information will indicate the weight, size, and cylinder classification of each car.

Feel free to explore and modify the code according to your needs or extend the classification system with additional features.
