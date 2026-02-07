// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
//Hello World

package frc.robot;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Constants.OperatorConstants;
import frc.robot.Constants.SpeedConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.ShootCommand;
import frc.robot.subsystems.DriveSub;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.ShootSub;




/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */

public class RobotContainer {

  //----------------------------
  // We have three subsystems
  //---------------------------- 
  private final ShootSub m_ShootSub = new ShootSub();
  private final DriveSub m_DriveSub = new DriveSub();
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();



  //-----[]\-----------------------
  // We have two xbox Controlers
  //---------------------------- 
    private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.DRIVER_CONTROL_PORT);

    private final CommandXboxController m_operatorController =
      new CommandXboxController(OperatorConstants.OPERATOR_CONTROL_PORT);    

  //-------------------------------------------------
  //  Setup A chooser for picking he auto   (Future)
  //-------------------------------------------------
     //private final SendableChooser<Command> autoChooser;

  //-------------------------------------
  //  Triggers go here   (Future)
  //-------------------------------------
     //Trigger runIndexerTrigger          = new Trigger(this::coralPresent);
     //Trigger manualClawTriggerUp        = new Trigger(() -> yOperator.getAsDouble() > 0);
     //Trigger manualClawTriggerDown      = new Trigger(() -> yOperator.getAsDouble() < 0);


  //===================================================================================
  /** The container for the robot. Contains subsystems, OI devices, and commands.    */
  //===================================================================================

  public RobotContainer() {
    
    // Configure the trigger bindings
    configureBindings();

    
  //----------
  //  Commands
  //----------

  // Drive motors come from the right axis
   DoubleSupplier speedX =()-> m_driverController.getRightX();
   DoubleSupplier speedY =()-> m_driverController.getRightY();

   m_DriveSub.setDefaultCommand (new DriveCommand(m_DriveSub, speedX, speedY)); 
   
   //  Shoot with the bumper control
   m_operatorController.rightBumper().whileTrue(new ShootCommand(m_ShootSub,SpeedConstants.FAST_FORWARD,SpeedConstants.FAST_FORWARD));
   m_operatorController.leftBumper().whileTrue(new ShootCommand(m_ShootSub,SpeedConstants.FAST_REVERSE,SpeedConstants.FAST_REVERSE));

   m_operatorController.a().whileTrue(new ShootCommand(m_ShootSub,SpeedConstants.FAST_FORWARD,SpeedConstants.FAST_FORWARD));
  }


  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */


  private void configureBindings() {
   
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    //new Trigger(m_exampleSubsystem::exampleCondition).onTrue(new ExampleCommand(m_exampleSubsystem));

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    //m_driverController.b().whileTrue(m_DriveSub.run(action)());
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() 
  {
   // An example command will be run in autonomous
   return Autos.exampleAuto(m_exampleSubsystem);
   //new DriveCommand(m_DriveSub, speedX, speedY);
  }}
