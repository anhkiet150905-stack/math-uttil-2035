package com.giaolang.mathutil.core;

public class MathUtil {

    private MathUtil() {
        // Utility class; no instances needed.
    }

    public static long getFactorial(int n) {
        // Lỗi cũ: illegalArgumentException (chữ i thường)
        // Đã sửa: IllegalArgumentException (chữ I hoa)
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }
}