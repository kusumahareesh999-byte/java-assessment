import java.util.Scanner;
public class TaxCalculatorApplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TaxCalculator calculator = new TaxCalculator();

        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();
        System.out.print("Is the employee Indian? (true/false): ");
        String isIndianStr = scanner.nextLine();
        boolean isIndian = Boolean.parseBoolean(isIndianStr);
        System.out.print("Enter employee salary: ");
        double empSal = scanner.nextDouble();

        try {
            double tax = calculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + tax);
        }
         catch (CountryNotValidException e) 
         {
            System.out.println(e.getMessage());
        } 
         catch (EmployeeNameInvalidException e) 
        {
            System.out.println(e.getMessage());
        } 
         catch (TaxNotEligibleException e) 
         {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
class TaxCalculator
 {
    public double calculateTax(String empName, boolean isIndian, double empSal) 
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
        {
            if (!isIndian) 
          {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }
         if (empName == null || empName.isEmpty()) 
        {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }
        
        double taxAmount = 0.0;
        if (empSal > 100000) 
            {
            taxAmount = empSal * 8 / 100;
        } 
         else if (empSal >= 50000 && empSal <= 100000) 
            {
            taxAmount = empSal * 6 / 100;
        } 
        else if (empSal >= 30000 && empSal < 50000) 
            {
            taxAmount = empSal * 5 / 100;
        } 
        else if (empSal >= 10000 && empSal < 30000) 
            {
            taxAmount = empSal * 4 / 100;
        } 
        else 
            {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
        return taxAmount;
    }
}
class CountryNotValidException extends Exception 
{
    public CountryNotValidException(String message) 
    {
        super(message);
    }
}
class EmployeeNameInvalidException extends Exception 
{
    public EmployeeNameInvalidException(String message) 
    {
        super(message);
    }
}
class TaxNotEligibleException extends Exception 
{
    public TaxNotEligibleException(String message) 
    {
        super(message);
    }
}