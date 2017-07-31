
package polymorphism;


class Animal {
    void test(){

       System.out.println("No Parameters");
    }

    void test(int a){

       System.out.println("a: "+a)
    }

    void test(int a,int b){

       System.out.println("a and b are: "+a+" "+b);
    }


    public static void main(String[] args) {

        Animal x = new Animal();
        x.test();
        x.test(10);
        x.test(10,20);


    }

}
