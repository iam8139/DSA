class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
            } else {
                if (stack.isEmpty()) return false;
                char temp2 = stack.pop();
                if ((temp == ')' && temp2 != '(') || (temp == '}' && temp2 != '{') || (temp == ']' && temp2 != '[')) return false;
            }
        }

        return stack.isEmpty();
    }
}