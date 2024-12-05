class Utils {
    static int sum(int n) {
        var sum = 0; // Will be updated during the computation of the sum
        for (var i = 1; i <= n; i = i + 1) {
            sum = sum + i;
        }
        return sum;
    }
}
