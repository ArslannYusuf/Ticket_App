/*
A şehrinden uçmak isteyen bir yolcu
B şehrine 500km
C şehrine  700km
D şehrine  900 km mesafededir.

Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

*/

public class Ticket {

    private String city;
    private double unitPrice=0.10;
private int type;
private double totalPrice;

    public Ticket(String city, double unitPrice, int type,double totalPrice) {
        this.city = city;
        this.unitPrice = unitPrice;
        this.type=type;
    }

    public Ticket() {
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "city='" + city + '\'' +
                ", unitPrice=" + unitPrice +
                ", type=" + type +
                ", totalPrice=" + totalPrice +
                '}';
    }
}