/**
 */
package robot.device;

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
 * @see robot.device.DeviceFactory
 * @model kind="package"
 * @generated
 */
public interface DevicePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "device";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Device.robot";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "device";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DevicePackage eINSTANCE = robot.device.impl.DevicePackageImpl.init();

  /**
   * The meta object id for the '{@link robot.device.impl.TypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.device.impl.TypesImpl
   * @see robot.device.impl.DevicePackageImpl#getTypes()
   * @generated
   */
  int TYPES = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__TYPES = 0;

  /**
   * The number of structural features of the '<em>Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link robot.device.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.device.impl.DeviceImpl
   * @see robot.device.impl.DevicePackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 1;

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
   * The meta object id for the '{@link robot.device.impl.FonctionnaliteImpl <em>Fonctionnalite</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.device.impl.FonctionnaliteImpl
   * @see robot.device.impl.DevicePackageImpl#getFonctionnalite()
   * @generated
   */
  int FONCTIONNALITE = 2;

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
   * The meta object id for the '{@link robot.device.impl.EJavaObjectImpl <em>EJava Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.device.impl.EJavaObjectImpl
   * @see robot.device.impl.DevicePackageImpl#getEJavaObject()
   * @generated
   */
  int EJAVA_OBJECT = 3;

  /**
   * The number of structural features of the '<em>EJava Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJAVA_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link robot.device.impl.ParametreImpl <em>Parametre</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.device.impl.ParametreImpl
   * @see robot.device.impl.DevicePackageImpl#getParametre()
   * @generated
   */
  int PARAMETRE = 4;

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
   * The meta object id for the '{@link robot.device.impl.CaptureImpl <em>Capture</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.device.impl.CaptureImpl
   * @see robot.device.impl.DevicePackageImpl#getCapture()
   * @generated
   */
  int CAPTURE = 5;

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
   * The meta object id for the '{@link robot.device.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.device.impl.ActionImpl
   * @see robot.device.impl.DevicePackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;

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
   * The meta object id for the '{@link robot.device.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see robot.device.impl.ObjectImpl
   * @see robot.device.impl.DevicePackageImpl#getObject()
   * @generated
   */
  int OBJECT = 7;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = EJAVA_OBJECT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link robot.device.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types</em>'.
   * @see robot.device.Types
   * @generated
   */
  EClass getTypes();

  /**
   * Returns the meta object for the containment reference list '{@link robot.device.Types#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see robot.device.Types#getTypes()
   * @see #getTypes()
   * @generated
   */
  EReference getTypes_Types();

  /**
   * Returns the meta object for class '{@link robot.device.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see robot.device.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the attribute '{@link robot.device.Device#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see robot.device.Device#getName()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Name();

  /**
   * Returns the meta object for the containment reference list '{@link robot.device.Device#getRefFonction <em>Ref Fonction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Fonction</em>'.
   * @see robot.device.Device#getRefFonction()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_RefFonction();

  /**
   * Returns the meta object for class '{@link robot.device.Fonctionnalite <em>Fonctionnalite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fonctionnalite</em>'.
   * @see robot.device.Fonctionnalite
   * @generated
   */
  EClass getFonctionnalite();

  /**
   * Returns the meta object for the attribute '{@link robot.device.Fonctionnalite#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see robot.device.Fonctionnalite#getName()
   * @see #getFonctionnalite()
   * @generated
   */
  EAttribute getFonctionnalite_Name();

  /**
   * Returns the meta object for the containment reference list '{@link robot.device.Fonctionnalite#getListeParametres <em>Liste Parametres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Liste Parametres</em>'.
   * @see robot.device.Fonctionnalite#getListeParametres()
   * @see #getFonctionnalite()
   * @generated
   */
  EReference getFonctionnalite_ListeParametres();

  /**
   * Returns the meta object for class '{@link robot.device.EJavaObject <em>EJava Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EJava Object</em>'.
   * @see robot.device.EJavaObject
   * @generated
   */
  EClass getEJavaObject();

  /**
   * Returns the meta object for class '{@link robot.device.Parametre <em>Parametre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parametre</em>'.
   * @see robot.device.Parametre
   * @generated
   */
  EClass getParametre();

  /**
   * Returns the meta object for the containment reference '{@link robot.device.Parametre#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see robot.device.Parametre#getType()
   * @see #getParametre()
   * @generated
   */
  EReference getParametre_Type();

  /**
   * Returns the meta object for the attribute '{@link robot.device.Parametre#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see robot.device.Parametre#getName()
   * @see #getParametre()
   * @generated
   */
  EAttribute getParametre_Name();

  /**
   * Returns the meta object for class '{@link robot.device.Capture <em>Capture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capture</em>'.
   * @see robot.device.Capture
   * @generated
   */
  EClass getCapture();

  /**
   * Returns the meta object for class '{@link robot.device.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see robot.device.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference '{@link robot.device.Action#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see robot.device.Action#getReturn()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Return();

  /**
   * Returns the meta object for class '{@link robot.device.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see robot.device.Object
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
  DeviceFactory getDeviceFactory();

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
     * The meta object literal for the '{@link robot.device.impl.TypesImpl <em>Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.device.impl.TypesImpl
     * @see robot.device.impl.DevicePackageImpl#getTypes()
     * @generated
     */
    EClass TYPES = eINSTANCE.getTypes();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES__TYPES = eINSTANCE.getTypes_Types();

    /**
     * The meta object literal for the '{@link robot.device.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.device.impl.DeviceImpl
     * @see robot.device.impl.DevicePackageImpl#getDevice()
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
     * The meta object literal for the '{@link robot.device.impl.FonctionnaliteImpl <em>Fonctionnalite</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.device.impl.FonctionnaliteImpl
     * @see robot.device.impl.DevicePackageImpl#getFonctionnalite()
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
     * The meta object literal for the '{@link robot.device.impl.EJavaObjectImpl <em>EJava Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.device.impl.EJavaObjectImpl
     * @see robot.device.impl.DevicePackageImpl#getEJavaObject()
     * @generated
     */
    EClass EJAVA_OBJECT = eINSTANCE.getEJavaObject();

    /**
     * The meta object literal for the '{@link robot.device.impl.ParametreImpl <em>Parametre</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.device.impl.ParametreImpl
     * @see robot.device.impl.DevicePackageImpl#getParametre()
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
     * The meta object literal for the '{@link robot.device.impl.CaptureImpl <em>Capture</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.device.impl.CaptureImpl
     * @see robot.device.impl.DevicePackageImpl#getCapture()
     * @generated
     */
    EClass CAPTURE = eINSTANCE.getCapture();

    /**
     * The meta object literal for the '{@link robot.device.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.device.impl.ActionImpl
     * @see robot.device.impl.DevicePackageImpl#getAction()
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
     * The meta object literal for the '{@link robot.device.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see robot.device.impl.ObjectImpl
     * @see robot.device.impl.DevicePackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

  }

} //DevicePackage
