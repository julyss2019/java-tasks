public interface UnitCar {
    Car getCar();

    // 获取车辆牌照号码
    String getLicensePlateNumber();

    // 获取保险单号码
    String getInsurancePolicyNumber();

    // 获取使用单位
    String getUsageUnit();

    // 获取资产所属单位
    String getAssetOwnershipUnit();

    // 获取购车日期
    String getPurchaseDate();

    // 获取销售单位
    String getSalesUnit();

    // 获取购车费用总额
    double getPurchaseCostTotal();
}
