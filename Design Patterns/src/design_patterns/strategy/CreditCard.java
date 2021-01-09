package design_patterns.strategy;

public class CreditCard {

    private int amount;
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number, String date, String cvv){
        this.amount = 100000;
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
