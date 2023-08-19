public class Control 
{
    public static void main(String[] args) 
    {
        SportsPlayer EmmaRaducanu = new TennisPlayer(1990, "Women", "Canada", 1.75, new Born("Toronto", "Canada"), "Andrew Richardson", 23, 2803376, "Right-handed");
        System.out.println(EmmaRaducanu.toString() + "\n");

        SportsPlayer DaniilMedvedev = new TennisPlayer(1996, "Men", "Russia", 1.98, new Born("Moscow", "Russia"), "Gilles Cervara", 1, 19793705, "Right-handed");
        System.out.println(DaniilMedvedev.toString() + "\n");

        // Show interfaces
        DaniilMedvedev.ShowNationality();
        EmmaRaducanu.ShowAge();

        // show how many players created
        SportsPlayer.getCount();
    }
}
