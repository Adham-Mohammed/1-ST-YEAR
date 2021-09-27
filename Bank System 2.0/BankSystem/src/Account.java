import java.time.LocalDate;

public class Account {
    private String clientName;
    private String password;
    private int ID;
    private String type;
    private boolean status;
    private double balance = 0;
    private double credit = 0;
    private LocalDate creditDate ;
    private LocalDate expirDate ;

    int i = 0;



    //set client name
    public void setName(String name) {
        this.clientName = name;
    }
    //set client pw
    public void setPassword(String pw) {
        this.password = pw;
    }
    // set client type
    public void setType(String type) {
        this.type = type;
    }
    // set client status
    public void setStatus(boolean status) {
        this.status = status;
    }
    // set client balance
    public void setBalance(double balance){
        this.balance = balance;
    }
    // set client ID
    public void setID(int id){
        ID = id;
    }
    // set client credit
    public void setCredit(double amount) {
        this.credit = amount;
    }
    // set client credit
    public void setCreditDate(){
        this.creditDate = LocalDate.now();
    }
    // set expire credit date
    public void setExpirDate(){
        // this.expirDate = this.creditDate;
        this.expirDate = this.creditDate.plusMonths(2);
    }
    

    //get client credit
    public double getCredit() {
        return credit;
    }
    // get credit date
    public LocalDate getCreditDate(){
        return this.creditDate;
    }
    // get expire credit date
    public LocalDate getExpirDate(){
        return this.expirDate;
    }
    //get client name
    public String getName() {
        return this.clientName;
    }
    //get client password
    public String getPassword() {
        return this.password;
    }
    // set customer status
    public String getType() {
        return this.type;
    }
    //get client status
    public boolean getStatus() {
        return this.status;
    }
    //get client balance
    public double getBalance() {
        return this.balance;
    }
    //get client ID
    public int getID() {
        return this.ID;
    }


    public boolean isBlocked() {
        boolean result = false;
        if (this.expirDate.compareTo(LocalDate.now()) == 0) {
            result = true;
        } else {
          result = false;  
        }
        return result;
    }
}
