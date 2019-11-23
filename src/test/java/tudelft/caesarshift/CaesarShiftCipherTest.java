package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "message = {0}, shift = {1}, result = {2}")
    @CsvSource({"abc, 3, def", "xyz, 3, abc", "d, 2, f", "rty, 0, rty"})
    public void TestCaesar(String message, int shift, String expectedResult){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult,result);
    }
}
