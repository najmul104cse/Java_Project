package encapsulationtest;

class Student {

    private String name = " ";
    private double cgpa = 0.0;

      public void setName(String x)
         {

           name = x;
         }
      public String getName()
         {

           return name;
         }
}
class Test {

    public static void main(String[] args) {

       Student xyz = new Student();
       Student pqr = new Student();

       xyz.setName(" Najmul ");
       pqr.setName(" Ovi ");

       System.out.println(xyz.getName());
       System.out.println(pqr.getName());


    }

}
