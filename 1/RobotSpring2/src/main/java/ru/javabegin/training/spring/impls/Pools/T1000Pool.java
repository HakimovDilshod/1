package ru.javabegin.training.spring.impls.Pools;
import java.util.Collection;
import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotPool;

public class T1000Pool implements RobotPool {
	private Collection<Robot> robotCollection;
	
		
	public void setRobotCollection(Collection<Robot> robotCollection) {
		this.robotCollection = robotCollection;
	}

	@Override
	public Collection<Robot> getRobotCollection() {
		// TODO Auto-generated method stub
		return robotCollection;
	}

	public void action() {
		
		for (Robot robot: robotCollection) {
			robot.action();
		}

	}
	
}