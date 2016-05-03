/*
 * Factory is a design pattern in common usage. Implement a ShapeFactory that can generate correct shape.

You can assume that we have only tree different shapes: Triangle, Square and Rectangle.

Example
ShapeFactory sf = new ShapeFactory();
Shape shape = sf.getShape("Square");
shape.draw();
>>  ----
>> |    |
>> |    |
>>  ----

shape = sf.getShape("Triangle");
shape.draw();
>>   /\
>>  /  \
>> /____\

shape = sf.getShape("Rectangle");
shape.draw();
>>  ----
>> |    |
>>  ----
 */
/**
 * Your object will be instantiated and called as such:
 * ShapeFactory sf = new ShapeFactory();
 * Shape shape = sf.getShape(shapeType);
 * shape.draw();
 */
interface Shape {

    void draw();

}

class Rectangle implements Shape {

    public void draw() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 6; ++j) {
                if (i == 0 || i == 2) {
                    if (1 <= j && j <= 4) {
                        System.out.print("-");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 0 || j == 5) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}

class Square implements Shape {

    public void draw() {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 6; ++j) {
                if (i == 0 || i == 3) {
                    if (1 <= j && j <= 4) {
                        System.out.print("-");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 0 || j == 5) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}

class Triangle implements Shape {

    public void draw() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 6; ++j) {
                if (i + j == 2) {
                    System.out.print("/");
                }
                if (j - i == 3) {
                    System.out.print("\\");
                }
                if (i == 2 && 1 <= j && j <= 5) {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }

}

public class ShapeFactory {

    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public Shape getShape(String shapeType) {
        if (shapeType.equals("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equals("Square")) {
            return new Square();
        } else if (shapeType.equals("Triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }

}
