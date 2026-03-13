package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import runners.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HomePageRunner.class,
        KreditlerRunner.class,
        KartlarRunner.class,
        EmanetlerRunner.class,
        HesablarRunner.class,
        KesbekRunner.class,
        KocurmelerRunner.class,
        BiznesRunner.class,
        HaqqimizdaRunner.class,
        OnlaynXidmetlerRunner.class
})
public class ABBweb {
}
