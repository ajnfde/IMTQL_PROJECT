/*
 * generated by Xtext
 */
package robot.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import robot.ui.internal.DeviceActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DeviceExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DeviceActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DeviceActivator.getInstance().getInjector(DeviceActivator.ROBOT_DEVICE);
	}
	
}
