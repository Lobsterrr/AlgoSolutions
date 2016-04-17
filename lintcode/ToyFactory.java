/*
 * Factory is a design pattern in common usage. Please implement a 
 * ToyFactory which can generate proper toy based on the given type.

Example
ToyFactory tf = ToyFactory();
Toy toy = tf.getToy('Dog');
toy.talk(); 
>> Wow

toy = tf.getToy('Cat');
toy.talk();
>> Meow
 */
/**
 * Your object will be instantiated and called as such:
 * ToyFactory tf = new ToyFactory();
 * Toy toy = tf.getToy(type);
 * toy.talk();
 */
interface Toy {
    void talk();
}

class Dog implements Toy {
    // Write your code here
}

class Cat implements Toy {
    // Write your code here
}
public class ToyFactory {


}
