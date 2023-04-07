class Worker extends Employee {
//  Необходимо создать класс Worker где метод getSalaryWorker  будет возвращать зарплату, базовую ставку.


     public Worker(String name, int baseSalary) {
         super(name, baseSalary);
     }

     public int getSalaryWorker(){
        return getBaseSalary();
    }


}
