
package quiz2;

class Cat extends Animal {
    
    Cat(String name){
        super(name);
    }

    @Override
    public void introduceYourself(){
        System.out.println("Meow. I am a Cat. My name is " + name);
        System.out.println("and I am " + this.age + " years old.");
    }    
}
