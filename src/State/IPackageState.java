package State;

public interface IPackageState {
    void next(PackageContext pkg);
    void pre(PackageContext pkg);
    void printStatus();
}
