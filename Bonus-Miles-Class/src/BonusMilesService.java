public class BonusMilesService {
    public int calculate (int cost) {
        int moneyForMile = 20;
        int bonusMiles = cost / moneyForMile;
        return bonusMiles;
    }
}
