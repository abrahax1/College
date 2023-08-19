import java.text.DecimalFormat;

public class TennisPlayer extends SportsPlayer
{
    private double height;
    private Born born;
    private String coach;
    private int atpRanking;
    private int prizeMoney;
    private String plays;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    // Constructor
    public TennisPlayer(int YearOfBirth, String Category, String Country, double height, Born born, String coach, int atpRanking, int prizeMoney, String plays)
    {
        super(YearOfBirth, Category, Country);
        this.height = height * 3.281;
        this.born = born;
        this.coach = coach;
        this.atpRanking = atpRanking;
        this.prizeMoney = prizeMoney;
        this.plays = plays;

    }

    // Print
    public String toString()
    {
        String TennisPlayer = ", height: " + df2.format(this.getHeight()) + " feet, born: " + this.getBorn() + ", coach: " + this.getCoach()
                            + ", ATP Ranking: " + this.getAtpRanking() + ", Prize Money: " + this.getPrizeMoney()
                            + ", plays: " + this.getPlays();

        return super.toString() + TennisPlayer;
    }

    // Getter & Setters
    public double getHeight() 
    {
      return this.height;
    }

    public void setHeight(double height) 
    {
      this.height = height;
    }

    public Born getBorn() 
    {
      return this.born;
    }

    public void setBorn(Born born) 
    {
      this.born = born;
    }

    public String getCoach() 
    {
      return this.coach;
    }

    public void setCoach(String coach) 
    {
      this.coach = coach;
    }

    public int getAtpRanking() 
    {
      return this.atpRanking;
    }

    public void setAtpRanking(int atpRanking) 
    {
      this.atpRanking = atpRanking;
    }

    public int getPrizeMoney() 
    {
      return this.prizeMoney;
    }

    public void setPrizeMoney(int prizeMoney) 
    {
      this.prizeMoney = prizeMoney;
    }

    public String getPlays() 
    {
      return this.plays;
    }

    public void setPlays(String plays) 
    {
      this.plays = plays;
    }

}
