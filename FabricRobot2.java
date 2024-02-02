// Конкретная реализация абстрактной фабрики для роботов A2 и B2
class FabricRobot2 implements Fabric {
    @Override
    public CreateRobot1 RobotA1() {
        return new RobotA2();
    }

    @Override
    public CreateRobot2 RobotB1() {
        return new RobotB2();
    }
}
