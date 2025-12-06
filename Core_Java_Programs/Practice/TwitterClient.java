/**
 * Created by Prasad Gali on 12-02-2018.
 */
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public final class TwitterClient {

    public static void main(String[] args) {

        try {

            ConfigurationBuilder cb = new ConfigurationBuilder();
            cb.setDebugEnabled(true).setOAuthConsumerKey("Zvg4tfwOeG1OmhpyXIOTkLgin").setOAuthConsumerSecret("B5NqJBNB4etyIbsmH2BGZMsJhbgmrThHptC4SnMuyQC8tcRgph").setOAuthAccessToken("958943789321768960-F3pkaie1kPJ3okVAfmfbssnJDpXho2w").setOAuthAccessTokenSecret("o4VfuOuZdxrxwwSSlYZXzSZZqUXelTPgaWA9FqS7h5jFp");

            TwitterFactory tf = new TwitterFactory(cb.build());
            Twitter twitter = tf.getInstance();

            ResponseList<Location> locations;
            locations = twitter.getAvailableTrends();

            Integer idTrendLocation = getTrendLocationId("India");

            if (idTrendLocation == null) {
                System.out.println("Trend Location Not Found");
                System.exit(0);
            }

            Trends trends = twitter.getPlaceTrends(idTrendLocation);
            for (int i = 0; i < trends.getTrends().length; i++) {
                System.out.println(trends.getTrends()[i].getName());
            }

            System.exit(0);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get trends: " + te.getMessage());
            System.exit(-1);
        }
    }

    private static Integer getTrendLocationId(String locationName) {

        int idTrendLocation = 0;

        try {

            ConfigurationBuilder cb = new ConfigurationBuilder();
            //cb.setDebugEnabled(true).setOAuthConsumerKey("yourConsumerKey").setOAuthConsumerSecret("yourConsumerSecret").setOAuthAccessToken("yourOauthToken").setOAuthAccessTokenSecret("yourOauthTokenSecret");
            cb.setDebugEnabled(true).setOAuthConsumerKey("Zvg4tfwOeG1OmhpyXIOTkLgin").setOAuthConsumerSecret("B5NqJBNB4etyIbsmH2BGZMsJhbgmrThHptC4SnMuyQC8tcRgph").setOAuthAccessToken("958943789321768960-F3pkaie1kPJ3okVAfmfbssnJDpXho2w").setOAuthAccessTokenSecret("o4VfuOuZdxrxwwSSlYZXzSZZqUXelTPgaWA9FqS7h5jFp");

            TwitterFactory tf = new TwitterFactory(cb.build());
            Twitter twitter = tf.getInstance();

            ResponseList<Location> locations;
            locations = twitter.getAvailableTrends();

            for (Location location : locations) {
                if (location.getName().toLowerCase().equals(locationName.toLowerCase())) {
                    idTrendLocation = location.getWoeid();
                    break;
                }
            }

            if (idTrendLocation > 0) {
                return idTrendLocation;
            }

            return null;

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get trends: " + te.getMessage());
            return null;
        }

    }
}