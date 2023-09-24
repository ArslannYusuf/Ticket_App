import java.util.Scanner;

public class Ticket_Service {
    Ticket ticket = new Ticket();
    double totalPrice = 0;
    Scanner scan = new Scanner(System.in);
    double price = 1;

    public void start() {

        System.out.println("Welcome to Ticket Service");
        System.out.println("Please select the city you want to go to : " + "\nB , C, D");
        ticket.setCity(scan.next().toUpperCase());
        switch (ticket.getCity()) {
            case "B":
                price = 500 * ticket.getUnitPrice();
                discount();
                break;
            case "C":
                price = 700 * ticket.getUnitPrice();
                discount();
                break;
            case "D":
                price = 900 * ticket.getUnitPrice();
                discount();
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
                start();
                break;
        }
    }


    public void discount() {
        ticket.setTotalPrice(price);
        System.out.println("Lütfen Yaşınızı giriniz");
        try {
            int age = scan.nextInt();
            if (age > 0 && age < 12) {
                ticket.setTotalPrice(ticket.getTotalPrice() * 0.5);
            } else if (age >= 12 && age <= 24) {
                ticket.setTotalPrice(ticket.getTotalPrice() * 0.9);
            } else if (age > 65) {
                ticket.setTotalPrice(ticket.getTotalPrice() * 0.7);
            }

            System.out.println("Lütfen Yolculuk tipini seçiniz");
            ticket.setType(scan.nextInt());
            if (ticket.getType() == 1) {
                System.out.println("$" + ticket.getTotalPrice());
            } else if (ticket.getType() == 2) {
                ticket.setTotalPrice(ticket.getTotalPrice() * 0.8);
            }
            printTicket();
        } catch (Exception e) {
            System.err.println("Bu nedir yaaa? :)  Sayı girmeyi dener misin canım ;)");
            scan.next();
            start();
            return;
        }
    }

    public void printTicket() {
        System.out.println("----------------------- ");
        System.out.println("*** Biletiniz ***");
        System.out.println("Gidilecek Şehir : " + ticket.getCity());
        System.out.println("Yolculuk Tipi : " + ticket.getType());
        System.out.println("Toplam Tutar : $" + ticket.getTotalPrice());
        System.out.println("İndirim Tutarı= $" + (price - ticket.getTotalPrice()));
    }
}