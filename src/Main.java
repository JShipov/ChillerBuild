public class Main {
    public static void main(String[] args) {

            Director director = new Director();
            director.setBuilder(new ScrewBuilder());
            Chiller chiller1 = director.BuildChiller();
            System.out.println(chiller1);
            System.out.println(chiller1.write());


            director.setBuilder(new CentrifugalBuilder());
            Chiller chiller2 = director.BuildChiller();
            System.out.println(chiller2.write());
        }
    }
