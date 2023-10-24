public interface Car {
    // 获取原牌照号码
    String getOriginalLicensePlateNumber();

    // 获取车型
    String getVehicleType();

    // 获取制造厂家
    String getManufacturer();

    // 获取车型号
    String getModel();

    // 获取车身颜色
    String getBodyColor();

    // 获取燃料种类
    String getFuelType();

    // 获取发动机号码
    String getEngineNumber();

    // 获取车架号码
    String getChassisNumber();

    // 获取出厂日期
    String getManufacturingDate();

    // 获取轮胎数量
    int getTireCount();

    // 获取轮胎规格
    String getTireSpecification();

    // 获取驾驶室准乘人数
    int getDriverCabinCapacity();

    // 获取载客人数（或载货量）
    int getPassengerCapacity();
}
