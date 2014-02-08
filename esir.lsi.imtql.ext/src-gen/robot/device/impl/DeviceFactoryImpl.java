/**
 */
package robot.device.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robot.device.Action;
import robot.device.Capture;
import robot.device.Device;
import robot.device.DeviceFactory;
import robot.device.DevicePackage;
import robot.device.EJavaObject;
import robot.device.Fonctionnalite;
import robot.device.Parametre;
import robot.device.Types;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceFactoryImpl extends EFactoryImpl implements DeviceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeviceFactory init()
  {
    try
    {
      DeviceFactory theDeviceFactory = (DeviceFactory)EPackage.Registry.INSTANCE.getEFactory(DevicePackage.eNS_URI);
      if (theDeviceFactory != null)
      {
        return theDeviceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DeviceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DevicePackage.TYPES: return createTypes();
      case DevicePackage.DEVICE: return createDevice();
      case DevicePackage.FONCTIONNALITE: return createFonctionnalite();
      case DevicePackage.EJAVA_OBJECT: return createEJavaObject();
      case DevicePackage.PARAMETRE: return createParametre();
      case DevicePackage.CAPTURE: return createCapture();
      case DevicePackage.ACTION: return createAction();
      case DevicePackage.OBJECT: return createObject();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Types createTypes()
  {
    TypesImpl types = new TypesImpl();
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fonctionnalite createFonctionnalite()
  {
    FonctionnaliteImpl fonctionnalite = new FonctionnaliteImpl();
    return fonctionnalite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EJavaObject createEJavaObject()
  {
    EJavaObjectImpl eJavaObject = new EJavaObjectImpl();
    return eJavaObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametre createParametre()
  {
    ParametreImpl parametre = new ParametreImpl();
    return parametre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Capture createCapture()
  {
    CaptureImpl capture = new CaptureImpl();
    return capture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public robot.device.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DevicePackage getDevicePackage()
  {
    return (DevicePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DevicePackage getPackage()
  {
    return DevicePackage.eINSTANCE;
  }

} //DeviceFactoryImpl
