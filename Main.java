// Использование абстрактной фабрики
public class Main {
    public static void main(String[] args) {
        // Создание фабрики для роботов A1 и B1
        Fabric Fabric1 = new FabricRobot1();

        // Использование фабрики для создания роботов A1 и B1
        CreateRobot1 robotA1 = Fabric1.RobotA1();
        CreateRobot2 robotB1 = Fabric1.RobotB1();

        // Создание фабрики для роботов A2 и B2
        Fabric Fabric2 = new FabricRobot2();

        // Использование фабрики для создания роботов A2 и B2
        CreateRobot1 robotA2 = Fabric2.RobotA1();
        CreateRobot2 robotB2 = Fabric2.RobotB1();

        // Использование абстрактной фабрики
        robotA1.doSomething1();
        robotB1.doSomething2();
        robotA2.doSomething1();
        robotB2.doSomething2();
    }
}