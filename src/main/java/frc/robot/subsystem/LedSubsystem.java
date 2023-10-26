package frc.robot.subsystem;

import java.util.Map;

import edu.wpi.first.networktables.GenericEntry;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LedSubsystem extends SubsystemBase {
Spark I_DONT_CARE;
GenericEntry I_DONT_KNOW; 
    public LedSubsystem() {
        I_DONT_CARE = new Spark(9);
        I_DONT_KNOW = Shuffleboard.getTab("LED").add("widget", 0.0).withWidget(BuiltInWidgets.kNumberSlider).withProperties(Map.of("Min",-1,"Max",1)).getEntry();
    }
    @Override
    public void periodic() {
        I_DONT_CARE.set(I_DONT_KNOW.getDouble(0));
    }
    
}
