/**
 * Created by tjc on 12/10/16.
 */

import java.math.*;

public class Main {
    public static void main(String[] args) {
        App app = new App();

        App app1 = new App(1, 2);
        System.out.printf("%d, %d\n", app1.x, app1.y);
        System.out.println(app.x + ", " + app.y);
    }
}
