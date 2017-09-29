
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
        public Problem1(int st, int av, Direction dir, int numBeepers) {
            super(st, av, dir, numBeepers);
    }
        public void sortBeepers() {
            int [] beeperList = new int[7];
            for (int index = 0; index < beeperList.length; index ++) {
                    
            }
    }
        public void collectBeepers() {
        int beeperCount = 0;
        for (int k = 0; k < 8; k++) {
            while(nextToABeeper()) {
                 pickBeeper();
                 move();
                 beeperCount++;
            }
            beeperList[0] = beeperCount;
            turnLeft();
            turnLeft();
            beeperCount = 0;
              while(frontIsClear()) {
               move();
            }
            if(!frontIsClear()) {
                    turnLeft();
                    move();
                    turnLeft();
            }
        }
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
}