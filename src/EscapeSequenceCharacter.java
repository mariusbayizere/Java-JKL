public class EscapeSequenceCharacter {




    public static void main(String[] args) throws  InterruptedException{
        System.out.println("Marius \"Bayizere\"");
        System.out.println("C:\\Users\\Marius\\Documents\\Java");

        System.out.println("Progress.. \n");
        for (int i = 1; i <= 10; i++ ){
            System.out.print( i * 10 + "%");
            Thread.sleep(1000);
            System.out.println("\b\b\b\b");
        }
        System.out.println("Done !!");
    }
}
