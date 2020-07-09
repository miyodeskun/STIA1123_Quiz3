
package quiz2;

class Dog extends Animal {
    
    Dog(String name){
        super(name);
    }
    @Override
    public void introduceYourself(){
        System.out.println("Woof. I am a Dog. My name is " + name);
        System.out.println("and I am " + this.age + " years old.");
    } 
}
