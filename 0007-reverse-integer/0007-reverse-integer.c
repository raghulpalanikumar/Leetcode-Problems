int reverse(int x) {
    int rev = 0;
    while (x != 0) {
        int digit = x % 10;
        x /= 10;

        // If rev will overflow after rev * 10 + digit, return 0
        if (rev > 214748364 || (rev == 214748364 && digit > 7)) return 0;
        if (rev < -214748364 || (rev == -214748364 && digit < -8)) return 0;

        rev = rev * 10 + digit;
    }
    return rev;
}
