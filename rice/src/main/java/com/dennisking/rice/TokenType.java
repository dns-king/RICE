@RequiredArgsConstructor
@Getter
public enum TokenType {
    Whitespace("[\\s\\t\\n\\r]"),
    Keyword("(if|then|end|print|input|struct|arg|new)"),
    GroupDivider("(\\[|\\])"),
    Logical("true|false"),
    Numeric("[0-9]+"),
    Text("\"([^\"]*)\""),
    Variable("[a-zA-Z_]+[a-zA-Z0-9_]*"),
    Operator("(\\+|\\-|\\>|\\<|\\={1,2}|\\!|\\:{2})");

    private final String regex;

    for (TokenType tokenType : TokenType.values()) {
        Pattern pattern = Pattern.compile("^" + tokenType.getRegex());
        Matcher matcher = pattern.matcher(sourceCode);
        if (matcher.find()) {
            // group(1) is used to get text literal without double quotes
            String token = matcher.groupCount() > 0 ? matcher.group(1) : matcher.group();
        }
    }
}