class Employee {
  /*  Необходимо создать класс Employee со следующими методами:
    getName - получить имя
    setName
    getBaseSalary - базовая ставка
    setBaseSalary */

    private String name;

     private int baseSalary;

     public Employee(String name, int baseSalary) {
         this.name = name;
         this.baseSalary = baseSalary;
     }

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setBaseSalary(int b) {
        baseSalary = b;
    }

    int getBaseSalary() {
        return baseSalary;
    }


}
