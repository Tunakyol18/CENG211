
/**
 * EquationReverser.java
 *
 * Your Name:        Tunahan Akyol
 * Your Student ID:  240446002
 * Your Date:        26.10.26
 */

public class EquationReverser {

    public static String reverseEquation(String equation) {

        TokenStack stack = new TokenStack();

        int i = 0;

        while (i < equation.length()) {

            char ch = equation.charAt(i);

            if (Character.isDigit(ch)) {
                int start = i;

                while (i < equation.length()
                        && Character.isDigit(equation.charAt(i))) {
                    i++;
                }

                String number = equation.substring(start, i);
                stack.push(number);

            } else {
                if (!Character.isWhitespace(ch)) {
                    stack.push(String.valueOf(ch));
                }

                i++;
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
