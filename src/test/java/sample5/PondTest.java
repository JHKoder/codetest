package sample5;

import org.junit.jupiter.api.Test;

public class PondTest {

    @Test
    void solve(){
        Pond pond = new Pond();
        pond.solve();
        pond.print();
    }
}
