package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new IntakeSubsystem. */

  private final MotorController m_leftIntake = new WPI_TalonSRX(5);
  private final MotorController m_rightIntake = new WPI_TalonSRX(6);
  private final MotorControllerGroup m_intakeGroup = new MotorControllerGroup(m_leftIntake, m_rightIntake);

  public IntakeSubsystem() {
    m_leftIntake.setInverted(true);
    m_rightIntake.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void runIntake(double speed) {
    System.out.println("Intake speed:" + speed);
    m_intakeGroup.set(speed);
  }

  public void stopIntake() {
    var speed = 0;
    System.out.println("Intake speed:" + speed);
    m_intakeGroup.set(speed);
  }

}
