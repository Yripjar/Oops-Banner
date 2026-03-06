import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Build the character pattern map
     */
    public static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        patternMap.put('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        });

        patternMap.put('S', new String[]{
                "  *****  ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                "      ** ",
                " *****   "
        });

        return patternMap;
    }

    /**
     * Render banner message
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : message.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatternMap();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }
}