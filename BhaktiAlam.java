import java.util.Scanner;

public class BhaktiAlam {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Silahkan pilih cottage : harga (weekday)(weekend)(holiday)");
        System.out.println("Duku : Rp.915000,Rp.1025000,Rp.1225000");
        System.out.println("Jeruk : Rp.915000,Rp.1025000,Rp.1225000");
        System.out.println("Alpukat : Rp.575000,Rp.695000,Rp.895000");
        System.out.println("Jambu air : Rp.575000,Rp.695000,Rp.895000");
        System.out.println("Durian : Rp.595000,Rp.715000,Rp.915000");
        System.out.println("Melon : Rp.595000,Rp.715000,Rp.915000");
        System.out.println("Belimbing : Rp.495000,Rp.575000,Rp.755000");
        System.out.println("Kedondong : Rp.495000,Rp.575000,Rp.755000");
        System.out.println("---Contoh : Mangga (enter(nextline)) weekend---");

        int harga=0;
        String cottage = data.next();
        String day = data.next();

        if(cottage.equals("Duku")|| cottage.equals("Jeruk")){
            switch(day){
                case "weekday":
                harga = 915000;
                break;
                
                case "weekend":
                harga = 1025000;
                break;

                case "holiday":
                harga = 1225000;
                break;

                default:
                harga = 0;
            }
        }else if(cottage.equals("Alpukat")|| cottage.equals("Jambu air")){
            switch(day){
                case "weekday":
                harga = 575000;
                break;
                
                case "weekend":
                harga = 695000;
                break;

                case "holiday":
                harga = 895000;
                break;

                default:
                harga = 0;
                break;
            }
        } else if(cottage.equals("Durian")|| cottage.equals("Melon")){
            switch(day){
                case "weekday":
                harga = 595000;
                break;
                
                case "weekend":
                harga = 715000;
                break;

                case "holiday":
                harga = 915000;
                break;

                default:
                harga = 0;
                break;
            }
        } else if(cottage.equals("Belimbing")|| cottage.equals("Mangga")|| cottage.equals("Kedondong")){
            switch(day){
                case "weekday":
                harga = 495000;
                break;
                
                case "weekend":
                harga = 575000;
                break;

                case "holiday":
                harga = 755000;
                break;

                default:
                harga = 0;
                break;
            }
        } else{
            System.out.println("Maaf inputan anda tidak valid !!");
        }

        System.out.println("Cottage yang anda pesan adalah: " + cottage);
        System.out.println("Hari yang anda pilih adalah: " + day);
        System.out.println("Total biaya: Rp." + harga);


    }
    
}
