import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class FinchMovement {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        // Move forward
        myFinch.setWheelVelocities(100, 100, 2000); // Move forward for 2 seconds

        // Zig-zag movement
        for (int i = 0; i < 3; i++) {
            myFinch.setWheelVelocities(100, 50, 1000); // Turn right
            myFinch.setWheelVelocities(50, 100, 1000); // Turn left
        }

        // Spin in place
        myFinch.setWheelVelocities(100, -100, 2000); // Spin for 2 seconds

        // Stop Finch
        myFinch.stop();
        myFinch.quit();
    }
}



