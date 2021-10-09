public class Sample {
    public static void main(String[] args){
        try
        {
            System.out.println(5/0);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final code");
        }
    }
    
}
