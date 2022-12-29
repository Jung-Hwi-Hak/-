package Chapter3객체지향핵심.ch02상속;

/**
 * VIPCustomer.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class VIPCustomer extends Customer {

    double saleRatio;
    String agentID;

    public double getSaleRatio() {
        return saleRatio;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
}
