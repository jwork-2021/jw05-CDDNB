package world;

import java.awt.Color;
import java.util.Random;

public class Monster extends Creature {
    public Monster(World world, char glyph, Color color) {
        super(world, glyph, color);
        start();
    }

    public void run() {
        Random rand = new Random();
        while(true) {
            for(int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {}
                if(hp < 0) break;
            }
            this.moveBy(rand.nextInt(4));
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {}
                if(hp < 0)break;
            }
            if(hp < 0)break;
            attack(); 
        }
        this.world.killMonster(this);
    }
}
