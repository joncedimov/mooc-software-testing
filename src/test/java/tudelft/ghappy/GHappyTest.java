package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    private GHappy gHappy;

    @BeforeEach
    public void initializeClass(){
        this.gHappy = new GHappy();
    }

    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({
            //testing true cases
            "testggtrue,true", "testgg, true", "ggtestgg, true", "test, true", "tegggst, true",
            //testing false cases
            "testg, false", "gtest, false", "ggtestg, false", "gtestg, false", "gtg, false"
    })
    public void Test(String input, boolean expectedResult){
        boolean result = gHappy.gHappy(input);
        Assertions.assertEquals(expectedResult, result);
    }
}
