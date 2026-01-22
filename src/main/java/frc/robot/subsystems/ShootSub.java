
package frc.robot.subsystems;


import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShootSub extends SubsystemBase {

  private final SparkMax motor1;
  private final SparkMax motor2;

  public ShootSub() {
    motor1 = new SparkMax(Constants.MotorCANConsants.NEO_1_CAN_ID, MotorType.kBrushless);
    motor2 = new SparkMax(Constants.MotorCANConsants.NEO_2_CAN_ID, MotorType.kBrushless);
  }
  
  public void runShooterMotor(double speed1, double speed2){

    motor1.set(speed1);
    motor2.set(speed2);
  }

}

