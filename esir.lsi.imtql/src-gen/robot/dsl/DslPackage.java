/**
 */
package robot.dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robot.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Dsl.robot";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslPackage eINSTANCE = robot.dsl.impl.DslPackageImpl.init();

  /**
   * The meta object id for the '{@link robot.dsl.impl.RobotImpl <em>Robot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.dsl.impl.RobotImpl
   * @see robot.dsl.impl.DslPackageImpl#getRobot()
   * @generated
   */
  int ROBOT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__NAME = 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__INSTANCES = 1;

  /**
   * The number of structural features of the '<em>Robot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link robot.dsl.impl.FonctionnaliteImpl <em>Fonctionnalite</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.dsl.impl.FonctionnaliteImpl
   * @see robot.dsl.impl.DslPackageImpl#getFonctionnalite()
   * @generated
   */
  int FONCTIONNALITE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONCTIONNALITE__NAME = 0;

  /**
   * The feature id for the '<em><b>Liste Parametres</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONCTIONNALITE__LISTE_PARAMETRES = 1;

  /**
   * The number of structural features of the '<em>Fonctionnalite</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONCTIONNALITE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link robot.dsl.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.dsl.impl.DeviceImpl
   * @see robot.dsl.impl.DslPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Ref Fonction</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__REF_FONCTION = 1;

  /**
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link robot.dsl.impl.IDeviceImpl <em>IDevice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.dsl.impl.IDeviceImpl
   * @see robot.dsl.impl.DslPackageImpl#getIDevice()
   * @generated
   */
  int IDEVICE = 3;

  /**
   * The feature id for the '<em><b>Typeof</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEVICE__TYPEOF = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEVICE__NAME = 1;

  /**
   * The number of structural features of the '<em>IDevice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link robot.dsl.impl.EJavaObjectImpl <em>EJava Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.dsl.impl.EJavaObjectImpl
   * @see robot.dsl.impl.DslPackageImpl#getEJavaObject()
   * @generated
   */
  int EJAVA_OBJECT = 4;

  /**
   * The number of structural features of the '<em>EJava Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJAVA_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link robot.dsl.impl.ParametreImpl <em>Parametre</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.dsl.impl.ParametreImpl
   * @see robot.dsl.impl.DslPackageImpl#getParametre()
   * @generated
   */
  int PARAMETRE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRE__NAME = 1;

  /**
   * The number of structural features of the '<em>Parametre</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link robot.dsl.impl.CaptureImpl <em>Capture</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.dsl.impl.CaptureImpl
   * @see robot.dsl.impl.DslPackageImpl#getCapture()
   * @generated
   */
  int CAPTURE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPTURE__NAME = FONCTIONNALITE__NAME;

  /**
   * The feature id for the '<em><b>Liste Parametres</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPTURE__LISTE_PARAMETRES = FONCTIONNALITE__LISTE_PARAMETRES;

  /**
   * The number of structural features of the '<em>Capture</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPTURE_FEATURE_COUNT = FONCTIONNALITE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link robot.dsl.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.dsl.impl.ActionImpl
   * @see robot.dsl.impl.DslPackageImpl#getAction()
   * @generated
   */
  int ACTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = FONCTIONNALITE__NAME;

  /**
   * The feature id for the '<em><b>Liste Parametres</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__LISTE_PARAMETRES = FONCTIONNALITE__LISTE_PARAMETRES;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__RETURN = FONCTIONNALITE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = FONCTIONNALITE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link robot.dsl.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.dsl.impl.ObjectImpl
   * @see robot.dsl.impl.DslPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 8;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = EJAVA_OBJECT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link robot.dsl.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Robot</em>'.
   * @see robot.dsl.Robot
   * @generated
   */
  EClass getRobot();

  /**
   * Returns the meta object for the attribute '{@link robot.dsl.Robot#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see robot.dsl.Robot#getName()
   * @see #getRobot()
   * @generated
   */
  EAttribute getRobot_Name();

  /**
   * Returns the meta object for the containment reference list '{@link robot.dsl.Robot#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see robot.dsl.Robot#getInstances()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Instances();

  /**
   * Returns the meta object for class '{@link robot.dsl.Fonctionnalite <em>Fonctionnalite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fonctionnalite</em>'.
   * @see robot.dsl.Fonctionnalite
   * @generated
   */
  EClass getFonctionnalite();

  /**
   * Returns the meta object for the attribute '{@link robot.dsl.Fonctionnalite#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see robot.dsl.Fonctionnalite#getName()
   * @see #getFonctionnalite()
   * @generated
   */
  EAttribute getFonctionnalite_Name();

  /**
   * Returns the meta object for the containment reference list '{@link robot.dsl.Fonctionnalite#getListeParametres <em>Liste Parametres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Liste Parametres</em>'.
   * @see robot.dsl.Fonctionnalite#getListeParametres()
   * @see #getFonctionnalite()
   * @generated
   */
  EReference getFonctionnalite_ListeParametres();

  /**
   * Returns the meta object for class '{@link robot.dsl.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see robot.dsl.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the attribute '{@link robot.dsl.Device#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see robot.dsl.Device#getName()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Name();

  /**
   * Returns the meta object for the containment reference list '{@link robot.dsl.Device#getRefFonction <em>Ref Fonction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Fonction</em>'.
   * @see robot.dsl.Device#getRefFonction()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_RefFonction();

  /**
   * Returns the meta object for class '{@link robot.dsl.IDevice <em>IDevice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IDevice</em>'.
   * @see robot.dsl.IDevice
   * @generated
   */
  EClass getIDevice();

  /**
   * Returns the meta object for the attribute '{@link robot.dsl.IDevice#getTypeof <em>Typeof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typeof</em>'.
   * @see robot.dsl.IDevice#getTypeof()
   * @see #getIDevice()
   * @generated
   */
  EAttribute getIDevice_Typeof();

  /**
   * Returns the meta object for the attribute '{@link robot.dsl.IDevice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see robot.dsl.IDevice#getName()
   * @see #getIDevice()
   * @generated
   */
  EAttribute getIDevice_Name();

  /**
   * Returns the meta object for class '{@link robot.dsl.EJavaObject <em>EJava Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EJava Object</em>'.
   * @see robot.dsl.EJavaObject
   * @generated
   */
  EClass getEJavaObject();

  /**
   * Returns the meta object for class '{@link robot.dsl.Parametre <em>Parametre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parametre</em>'.
   * @see robot.dsl.Parametre
   * @generated
   */
  EClass getParametre();

  /**
   * Returns the meta object for the containment reference '{@link robot.dsl.Parametre#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see robot.dsl.Parametre#getType()
   * @see #getParametre()
   * @generated
   */
  EReference getParametre_Type();

  /**
   * Returns the meta object for the attribute '{@link robot.dsl.Parametre#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see robot.dsl.Parametre#getName()
   * @see #getParametre()
   * @generated
   */
  EAttribute getParametre_Name();

  /**
   * Returns the meta object for class '{@link robot.dsl.Capture <em>Capture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capture</em>'.
   * @see robot.dsl.Capture
   * @generated
   */
  EClass getCapture();

  /**
   * Returns the meta object for class '{@link robot.dsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see robot.dsl.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference '{@link robot.dsl.Action#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see robot.dsl.Action#getReturn()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Return();

  /**
   * Returns the meta object for class '{@link robot.dsl.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see robot.dsl.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DslFactory getDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link robot.dsl.impl.RobotImpl <em>Robot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.dsl.impl.RobotImpl
     * @see robot.dsl.impl.DslPackageImpl#getRobot()
     * @generated
     */
    EClass ROBOT = eINSTANCE.getRobot();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__INSTANCES = eINSTANCE.getRobot_Instances();

    /**
     * The meta object literal for the '{@link robot.dsl.impl.FonctionnaliteImpl <em>Fonctionnalite</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.dsl.impl.FonctionnaliteImpl
     * @see robot.dsl.impl.DslPackageImpl#getFonctionnalite()
     * @generated
     */
    EClass FONCTIONNALITE = eINSTANCE.getFonctionnalite();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONCTIONNALITE__NAME = eINSTANCE.getFonctionnalite_Name();

    /**
     * The meta object literal for the '<em><b>Liste Parametres</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONCTIONNALITE__LISTE_PARAMETRES = eINSTANCE.getFonctionnalite_ListeParametres();

    /**
     * The meta object literal for the '{@link robot.dsl.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.dsl.impl.DeviceImpl
     * @see robot.dsl.impl.DslPackageImpl#getDevice()
     * @generated
     */
    EClass DEVICE = eINSTANCE.getDevice();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

    /**
     * The meta object literal for the '<em><b>Ref Fonction</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__REF_FONCTION = eINSTANCE.getDevice_RefFonction();

    /**
     * The meta object literal for the '{@link robot.dsl.impl.IDeviceImpl <em>IDevice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.dsl.impl.IDeviceImpl
     * @see robot.dsl.impl.DslPackageImpl#getIDevice()
     * @generated
     */
    EClass IDEVICE = eINSTANCE.getIDevice();

    /**
     * The meta object literal for the '<em><b>Typeof</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDEVICE__TYPEOF = eINSTANCE.getIDevice_Typeof();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDEVICE__NAME = eINSTANCE.getIDevice_Name();

    /**
     * The meta object literal for the '{@link robot.dsl.impl.EJavaObjectImpl <em>EJava Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.dsl.impl.EJavaObjectImpl
     * @see robot.dsl.impl.DslPackageImpl#getEJavaObject()
     * @generated
     */
    EClass EJAVA_OBJECT = eINSTANCE.getEJavaObject();

    /**
     * The meta object literal for the '{@link robot.dsl.impl.ParametreImpl <em>Parametre</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.dsl.impl.ParametreImpl
     * @see robot.dsl.impl.DslPackageImpl#getParametre()
     * @generated
     */
    EClass PARAMETRE = eINSTANCE.getParametre();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETRE__TYPE = eINSTANCE.getParametre_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETRE__NAME = eINSTANCE.getParametre_Name();

    /**
     * The meta object literal for the '{@link robot.dsl.impl.CaptureImpl <em>Capture</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.dsl.impl.CaptureImpl
     * @see robot.dsl.impl.DslPackageImpl#getCapture()
     * @generated
     */
    EClass CAPTURE = eINSTANCE.getCapture();

    /**
     * The meta object literal for the '{@link robot.dsl.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.dsl.impl.ActionImpl
     * @see robot.dsl.impl.DslPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__RETURN = eINSTANCE.getAction_Return();

    /**
     * The meta object literal for the '{@link robot.dsl.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.dsl.impl.ObjectImpl
     * @see robot.dsl.impl.DslPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

  }

} //DslPackage
