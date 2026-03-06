public class OOPSBannerApp {

    /**
     * Static Inner Class to store character and pattern
     */
    public static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method for O
    public static String[] getOPattern() {
        return new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
    }

    // Utility method for P
    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        };
    }

    // Utility method for S
    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                "      ** ",
                " *****   "
        };
    }

    public static void main(String[] args) {

        CharacterPatternMap o = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap p = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap s = new CharacterPatternMap('S', getSPattern());

        String[] oPattern = o.getPattern();
        String[] pPattern = p.getPattern();
        String[] sPattern = s.getPattern();

        for (int i = 0; i < oPattern.length; i++) {

            StringBuilder line = new StringBuilder();

            line.append(oPattern[i]).append(" ")
                .append(oPattern[i]).append(" ")
                .append(pPattern[i]).append(" ")
                .append(sPattern[i]);

            System.out.println(line);
        }
    }
}