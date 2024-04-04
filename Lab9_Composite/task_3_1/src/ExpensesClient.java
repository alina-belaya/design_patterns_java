public class ExpensesClient {

  public static void main(String[] args) {
    Manager director = new Manager("Director", 1000);

    Manager meatDeptManager = new Manager("Meat Dept Manager", 500);
    meatDeptManager.addSubordinate(new Salesperson("Meat Salesperson 1", 300));
    meatDeptManager.addSubordinate(new Salesperson("Meat Salesperson 2", 300));
    meatDeptManager.addSubordinate(new Salesperson("Meat Salesperson 3", 300));

    Manager dairyDeptManager = new Manager("Dairy Dept Manager", 500);
    dairyDeptManager.addSubordinate(new Salesperson("Dairy Salesperson 1", 300));
    dairyDeptManager.addSubordinate(new Salesperson("Dairy Salesperson 2", 300));
    dairyDeptManager.addSubordinate(new Salesperson("Dairy Salesperson 3", 300));

    Manager bakeryDeptManager = new Manager("Bakery Dept Manager", 500);
    bakeryDeptManager.addSubordinate(new Salesperson("Bakery Salesperson 1", 300));
    bakeryDeptManager.addSubordinate(new Salesperson("Bakery Salesperson 2", 300));
    bakeryDeptManager.addSubordinate(new Salesperson("Bakery Salesperson 3", 300));

    director.addSubordinate(meatDeptManager);
    director.addSubordinate(dairyDeptManager);
    director.addSubordinate(bakeryDeptManager);

    SalesTeam team = new SalesTeam();
    team.addEmployee(director);

    team.payExpenses();
  }
}
