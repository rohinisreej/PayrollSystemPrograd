import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

class SalariedEmployee{
    String name;

    public void calculatePay(double salary)
    {
        System.out.println(salary);
    }
    public void calculatePay(double hourlyRate,double hoursWorked)
    {
        System.out.println(hourlyRate*hoursWorked);
    }


}

public class Main {

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee();
        salariedEmployee.calculatePay(640000);
        salariedEmployee.calculatePay(500,135);



    }
}
