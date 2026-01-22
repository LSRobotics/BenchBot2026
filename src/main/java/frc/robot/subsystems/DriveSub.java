
package frc.robot.subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSub extends SubsystemBase {

  private TalonFX myTalonA = new TalonFX(30);
  private TalonFX myTalonB = new TalonFX(31);
  
  public DriveSub() {

  // config A
    TalonFXConfiguration cfgA = new TalonFXConfiguration();

    cfgA.MotorOutput.Inverted = InvertedValue.CounterClockwise_Positive; 
    cfgA.MotorOutput.NeutralMode = NeutralModeValue.Brake;
    cfgA.CurrentLimits.SupplyCurrentLimitEnable = true;
    cfgA.CurrentLimits.SupplyCurrentLimit = 40.0;   // amps
    cfgA.CurrentLimits.StatorCurrentLimitEnable = true;
    cfgA.CurrentLimits.StatorCurrentLimit = 60.0;   // amps
    cfgA.OpenLoopRamps.DutyCycleOpenLoopRampPeriod = 0.25; // seconds from 0 to 100%
  
     myTalonA.getConfigurator().apply(cfgA);

    // config B
    TalonFXConfiguration cfgB = new TalonFXConfiguration();

    cfgB.MotorOutput.Inverted = InvertedValue.Clockwise_Positive; 
    cfgB.MotorOutput.NeutralMode = NeutralModeValue.Brake;
    cfgB.CurrentLimits.SupplyCurrentLimitEnable = true;
    cfgB.CurrentLimits.SupplyCurrentLimit = 40.0;   // amps
    cfgB.CurrentLimits.StatorCurrentLimitEnable = true;
    cfgB.CurrentLimits.StatorCurrentLimit = 60.0;   // amps
    cfgB.OpenLoopRamps.DutyCycleOpenLoopRampPeriod = 0.25; // seconds from 0 to 100%

     myTalonB.getConfigurator().apply(cfgB);

    myTalonA = new TalonFX(Constants.MotorCANConsants.TALON_A_CAN_ID);
    myTalonB = new TalonFX(Constants.MotorCANConsants.TALON_B_CAN_ID);    
  }
  
  public void runDriveMotors(double speed1, double speed2){

    myTalonA.set(speed1);
    myTalonB.set(speed2);
  }
}