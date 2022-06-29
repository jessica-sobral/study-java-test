package demogradle;

public class Account {
    private int id;
    private double balance;
    private double limit;

    public Account() {

    }

    public Account(int id, double limit) {
        this.setId(id);
        this.setLimit(limit);
    }

    public String checkBalance() {
        return "Account " + id + " has balance " + balance;
    }

    public boolean deposit(double value) {
        if(value > 0.0) {
            balance += value;
            return true;
        } else {
            return false;
        }
    }

    public boolean cashOut(double value) {
        if(balance >= value) {
            balance -= value;
            return true;
        }
        else if((balance + limit) >= value) {
            limit = (balance + limit) - value;
            balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(Account account, double value) {
        if(balance >= value) {
            balance -= value;
            account.balance += value;
            return true;
        }
        else if(balance + limit >= value) {
            limit = (balance + limit) - value;
            balance -= value;
            account.balance += value;
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0)
            this.id = id;
        else
            throw new IllegalArgumentException("Account code must be greater than zero.");
    }

    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        if(limit > 0)
            this.limit = limit;
        else
            throw new IllegalArgumentException("Account limit must be greater than zero.");
    }
}
