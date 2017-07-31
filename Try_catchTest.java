
package try_catchtest;


class Exception {

    public static void main(String[] args) {

         int a,b=0,i;
         a=10;
         System.out.print("Najmul Ovi 1\n");

         for(i=10;i>=0;i--)
         {
             try
             {
                 b=a/i;
             }
             catch(Exception err)
             {
                 System.out.print(err);
             }
             System.out.print(b+":"+i+" ");
         }
         System.out.print("\n");
         System.out.print("Najmul Ovi 2\n");
    }

}
