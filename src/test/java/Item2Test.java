import org.junit.jupiter.api.Test;
import venson.Item2Builder;

public class Item2Test {
    @Test
    public void test(){
        Item2Builder testBuilder = Item2Builder.builder()
                .id(42L)
                .name("test builder")
                .build();
        System.out.println(testBuilder);
    }
}
