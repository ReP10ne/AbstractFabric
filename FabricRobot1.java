// Конкретная реализация абстрактной фабрики для роботов A1 и B1
class FabricRobot1 implements Fabric {
    @Override
    public CreateRobot1 RobotA1() {
        return new RobotA1();
    }

    @Override
    public CreateRobot2 RobotB1() {
        return new RobotB1();
    }
}
