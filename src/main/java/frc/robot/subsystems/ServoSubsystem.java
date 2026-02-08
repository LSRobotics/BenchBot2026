package frc.robot.subsystems;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ServoSubsystem extends SubsystemBase{
    private Servo s;;

  public ServoSubsystem(int pwmPort) {
    s = new Servo(pwmPort);
    // to a 500μs – 2500μs RC servo pulse
    s.setBoundsMicroseconds(2500, 2300, 1500, 700, 500);
  }

    public void run(double speed) {
        s.setSpeed(speed);
    }

    public void run(DoubleSupplier speed) {
        s.setSpeed(speed.getAsDouble());
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }

}
