public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline initialization of all banner lines
        String[] lines = {
            String.join(" ", "   ***   ", "   ***   ", "  ******  ", "  *****  "),
            String.join(" ", "  **  ** ", "  **  ** ", "  **   ** ", " **   ** "),
            String.join(" ", " **    **", " **    **", "  **   ** ", " **      "),
            String.join(" ", " **    **", " **    **", "  ******  ", "  *****  "),
            String.join(" ", " **    **", " **    **", "  **      ", "      ** "),
            String.join(" ", "  **  ** ", "  **  ** ", "  **      ", " **   ** "),
            String.join(" ", "   ***   ", "   ***   ", "  **      ", "  *****  ")
        };

        // Loop to print banner lines
        for (String line : lines) {
            System.out.println(line);
        }
    }
}