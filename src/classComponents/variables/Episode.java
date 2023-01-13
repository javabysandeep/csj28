package classComponents.variables;

public class Episode {
    int episodeId;
    String episodeTitle;
    int episodeDuration;

    //method definition
    void addEpisode(int episodeId, String episodeTitle, int episodeDuration) {
        System.out.println(episodeId + "\t" +
                episodeTitle + "\t" +
                episodeDuration);
    }


}
