// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 * 
 * More constants
 */
public final class Constants {

  public static class OperatorConstants {
    public static final int DRIVER_CONTROL_PORT   = 0;
    public static final int OPERATOR_CONTROL_PORT = 1;
    }
  public static class SpeedConstants {
    public static final double FAST_FORWARD = 0.6;
    public static final double SLOW_FORWARD = 0.2;
    public static final double FAST_REVERSE = -0.6;
    public static final double SLOW_REVERSE = -0.2;
     }  
  public static class MotorCANConsants {
    public static final int NEO_1_CAN_ID    = 11;
    public static final int NEO_2_CAN_ID    = 12;
    public static final int TALON_A_CAN_ID  = 30;
    public static final int TALON_B_CAN_ID  = 31;
    }
   public static final class LEDConstants {
        public static final int LEDDriverOneID = 3;
        public static final double colorRed = 0.61;
        public static final double colorHotPink = 0.57;
        public static final double colorYellow = 0.69;
        public static final double colorSkyBlue = 0.83;
        public static final double colorBlueViolet = 0.89;
        public static final double colorWhite = 0.93;
        public static final double colorLimeGreen = 0.73;
        public static final double colorOrange = 0.65;
        public static final double colorDarkGreen = 0.75;
        public static final double colorLawnGreen = 0.71;
        public static final double colorBlue = 0.87;
        public static final double colorGold = 0.67;
        public static final double twinklesColorOneAndTwo = 0.51;
    }
  }

