// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix6.Orchestra;
import com.ctre.phoenix6.hardware.TalonFX;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  private final TalonFX singer1 = new TalonFX(1, "cantivore");
  private final TalonFX singer2 = new TalonFX(3, "cantivore");
  private final TalonFX singer3 = new TalonFX(5, "cantivore");
  private final TalonFX singer4 = new TalonFX(7, "cantivore");

  private final Orchestra orchestra = new Orchestra();

  @Override
  public void robotInit() {
    orchestra.loadMusic("Yoru-Ni-Kakeru.chrp");

    orchestra.addInstrument(singer1, 0);
    orchestra.addInstrument(singer2, 0);
    orchestra.addInstrument(singer3, 1);
    orchestra.addInstrument(singer4, 1);
  }

  @Override
  public void robotPeriodic() {
    SmartDashboard.putNumber("Played Time", orchestra.getCurrentTime());
  }

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    orchestra.play();
  }

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {
    orchestra.stop();
  }

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
