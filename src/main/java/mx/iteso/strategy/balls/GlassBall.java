package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class GlassBall extends Ball {
    public GlassBall() {
        bounceBehavior =  new Crash();
        deflateBehavior = new NotDeflatable();
        type = "Glass ball";
    }
}
