package CraftyCake.java;

public class QualityController extends Employee {
    //Constructor for Quality Controller object which inherits all employee attributes
    public QualityController(String name, int cakesMade) {
        super(name, cakesMade);
    }

    //Override of the getWage method in employee class to add 12% to wages
    @Override
    public double getWage() {
        return super.getWage() * 1.12;
    }

    //Override of print employee method to print quality controller
    @Override
    public String printEmployee() {
        return String.format("|%-10s| %10s | %12s|\n",
                this.getName() + " QC", this.getCakesMade(), util.getMoney(this.getWage()));
    }
}
