
package quiz2;

class Animal {
    
    public String name;
    public static int age;
    
    public Animal (String name){
        this.name = name;
        
    }
    public void introduceYourself(){
        System.out.println("Morr. I am an Animal");
        System.out.println("and I am " + this.age + " years old.");
        
    }  
}
