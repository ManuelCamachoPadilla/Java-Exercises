public class Main {
    public static void main(String[] args) {
        int myVariable=0;
        myVariable=10;
        myVariable=30;
        System.out.printf("Hello world! %d%n", myVariable); // System.out.printf(String.format(("Hello world! %d%n", myVariable));

        Person person=new Person("Manu", "Camacho", 22);
        Person person1=new Person("Victoria", "Vazquez", 22);
        //person.name="Manu";
        //person.secondName="Camacho";
        System.out.println(person.toString());

        //person1.name="Victoria";
        //person1.seconName="Vazquez";
        System.out.println(person1.toString());

        System.out.println(person1.equals(person));

        try {
            person1.setAge(22);
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        // Calculator
        //Calculator c = new Calculator();
        System.out.println(Calculator.sum(2,4));

        boolean active=true;
        if (active){

        } else if (true) {

        } else {

        }
        int option=1;
        switch (option){
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }

        do{

        } while(active);

        while(active){

        }

        for(int i=0; i<10;i++) {

        }

        // i++; se incrementa i antes de incremntar valor
        // ++i; se incrementa i despues de incrementar valor

        int n=1;
        int n2=n++; // Asigna antes de hacer el incremento
        int n3=++n; // Incrementa y luego asigna
        System.out.println(n+" "+n2+" "+n3+" ");



    }
}