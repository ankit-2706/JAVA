package java_from_scatch;

public class p31 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.reverse();

        System.out.println(builder);

    }
}
/*
    There are many format specifiers we can use. Here are some common ones:

        %c - Character
        %d - Decimal number (base 10)
        %e - Exponential floating-point number
        %f - Floating-point number
        %i - Integer (base 10)
        %o - Octal number (base 8)
        %s - String
        %u - Unsigned decimal (integer) number
        %x - Hexadecimal number (base 16)
        %t - Date/time
        %n - Newline
*/
