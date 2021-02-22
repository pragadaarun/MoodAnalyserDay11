import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD", mood);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    /*
     *This Test Case Excepts
     * Happy Mood
     */
    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in any Mood");
        String mood = null;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

   
    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    @Test
    public void givenNullMood_ShouldThrow_Exception() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (Exception e) {
            Assert.assertEquals("Please enter Proper Mood",e.getMessage());
        }
    }
}