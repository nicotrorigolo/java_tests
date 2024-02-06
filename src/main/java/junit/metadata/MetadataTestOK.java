package junit.metadata;

import org.junit.jupiter.api.Assertions;

public class MetadataTestOK {

    @Test
    @TFMetadata ( key = "first_KEY", value = {"first_VALUE"})
    public void keyValue(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata ( key = "solo_KEY")
    public void keyOnly(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }





}