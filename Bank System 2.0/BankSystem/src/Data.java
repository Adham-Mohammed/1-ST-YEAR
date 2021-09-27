import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Data {
    Account accounts[] = new Account[1000] ;
    private boolean indebted = true;
    private boolean not_indebted = false;
    int i = 0; //counter of accounts

    public void intiAccount() {
        Account acc = new Account();
        accounts[0]= acc;
        
    }


    public void createAcc(String name,String pw,String type){
        Account acc = new Account();
        accounts[i]= acc;
        acc.setName(name);
        acc.setPassword(pw);
        acc.setType(type);
        acc.setID(i+1);
        acc.setCreditDate();
        acc.setExpirDate();
        i++; 
    }

    public boolean isExist(String name){
        boolean result = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                String username = accounts[i].getName();
                if (username.equals(name)) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            } else {
                break;
            }
        }
        return result;
    }

    public boolean isAuthorized(String name,String pw) {
        boolean result = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                String username = accounts[i].getName();
                String password = accounts[i].getPassword();
                if (username.equals(name) && password.equals(pw)) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            } else {
                break;
            }
        }
        return result;
    }

    public void deposit(int id, double money) {
        Account acc = accounts[id];
        double currentBalance = acc.getBalance();
        if (money > 0) {
            if(currentBalance == 0){
                acc.setBalance(money); 
            }else{
                acc.setBalance( currentBalance + money); 
            }
        } else {
            infoMess("Invalid entry!", "Error");
        }
          
    }

    public void withdrawal(int id, double money) {
        Account acc = accounts[id];
        double currentBalance = acc.getBalance();
        String accType = acc.getType();
        if (currentBalance != 0 && money <= currentBalance) { //check if balance is empty or not and money is less than the balance 
            if (money >= 5) { // check entry validation
                if (accType.equals("Personal")) {// for personal accounts
                    if ( money <= 5000) {
                        currentBalance -= money;
                        acc.setBalance(currentBalance);
                        infoMess("Your current balace is: "+ (int) currentBalance + "$", "Done");
                    } else {
                        infoMess("The maximum withdrawal limit is 5000$", "Error");
                    }
                } else {//for vip accounts
                    if ( money <= 20000) {
                        currentBalance -= money;
                        acc.setBalance(currentBalance);
                        infoMess("Your current balace is: "+ (int) currentBalance + "$", "Done");
                    } else {
                        infoMess("The maximum withdrawal limit is 20000$", "Error");
                    }
                }
            } else {
                infoMess("Invalid entry, Please enter number more than 5$", "Error");
            }
        } else {
            infoMess("Invalid entry, Your balance is: " + (int) currentBalance + "$", "Error");
        }
        
    }
   
    public void creditCard(int id, double money){
        Account acc = accounts[id];
        String accType = acc.getType();
        double currentCredit = acc.getCredit();
        double limit = currentCredit + money;
        if (money > 0) {
            if (accType.equals("Personal")) { //for personal accounts
                if (limit <= 10000 ) {
                    currentCredit += money;
                    acc.setCredit(currentCredit); 
                    acc.setStatus(indebted);
                    infoMess("Done, Your credit balance is: $" +(int) currentCredit, "Done");
                } else {
                    infoMess("Sorry you have reached credit limit", "Error");                
                }
            } else {// for vip accounts
                if (limit <= 100000) {
                    currentCredit += money;
                    acc.setCredit(currentCredit); 
                    acc.setStatus(indebted);
                    infoMess("Done, Your credit balance is: $" +(int) currentCredit, "Done");
                } else {
                    infoMess("Sorry you have reached credit limit", "Error");                
                } 
            }
        } else {
            infoMess("Invalid entry", "Error");
        }
        
    }

    public void transfer(int sID, int rID, double money) {
        Account sAcc = accounts[sID];
        Account rAcc = accounts[rID];
        double sBalance = sAcc.getBalance();
        if(sAcc == rAcc){
            infoMess("Invalid entry", "Error");
        }else{
            try {
                double rBalance = rAcc.getBalance();
                if (money >= 50) {
                    if (money < sBalance) {
                        rBalance += money;
                        rAcc.setBalance(rBalance);
                        sBalance -= money;
                        sAcc.setBalance(sBalance);
                        infoMess("Your current balace is: "+ (int) sBalance + "$", "Transfer Complete");
                    } else {
                        infoMess("Invalid entry, Your balance is: " + (int) sBalance +"$", "Error");
                    }
                } else {
                    infoMess("Invalid entry, Please enter number more than 50$", "Error");
                }
            } catch (NullPointerException e) {
                infoMess("There is no account with this number", "Error");
            }
        }
        
        
    }
    
    public void payCredit(int id, double money) {
        Account acc = accounts[id];
        double balance = acc.getBalance();
        double credit = acc.getCredit();
        if (money > 0) {
            if(money <= balance && money <= credit){
                credit -= money;
                acc.setCredit(credit);
                acc.setBalance(balance - money);
            } else{
                String msg = String.format("Invalid entry, Your balance is: %d$\nYour credit balance is: %d$",(int) balance,(int) credit);
                infoMess(msg, "Error");
            }
            if (credit == 0) {
                acc.setStatus(not_indebted);
            }
        } else {
            infoMess("Invalid entry", "Error");
        }
        
    }



    public void creditMsg(int id) {
        Account acc = accounts[id];
        int credit = (int) acc.getCredit();
        LocalDate exDate = acc.getExpirDate();
        String msg = String.format("Your credit balance is: %d$\nYou have to pay it before %s", credit,exDate);
        infoMess(msg, "Alert");
    }

    public void infoMess(String message, String title){
        JOptionPane.showMessageDialog(null, message, title , JOptionPane.INFORMATION_MESSAGE);
    }
}
