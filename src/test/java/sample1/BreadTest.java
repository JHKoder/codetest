package sample1;

import org.junit.jupiter.api.Test;

public class BreadTest {

    @Test
    void bread(){
        Maker maker = new Maker();
        Waiter waiter = new Waiter();
        maker.allFactory(waiter.give("bread.json"));
        maker.history();
    }
}
