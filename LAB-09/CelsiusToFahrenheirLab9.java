public class CelsiusToFahrenheirLab9{
    public static void main(String[] Umar) {

        System.out.println("Celsious     |     Faharenhite\n-------------+--------------------");
        int tc = 0;

         while (tc <= 100){
             System.out.println("\t"+tc+ "\t\t\t" +(tc* 9/5+32));
                tc +=10;
            }//while

	//same task with for loop
        System.out.println("Celsious     |     Faharenhite\n-------------+--------------------");
        for (int tmc = 0; tmc<=100; tmc +=10){
            System.out.println("\t"+tmc+ "\t\t\t" +(tmc* 9/5+32));
        }//for

    }
}
