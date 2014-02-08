/**
 */
package robot.device;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fonctionnalite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.device.Fonctionnalite#getName <em>Name</em>}</li>
 *   <li>{@link robot.device.Fonctionnalite#getListeParametres <em>Liste Parametres</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.device.DevicePackage#getFonctionnalite()
 * @model
 * @generated
 */
public interface Fonctionnalite extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see robot.device.DevicePackage#getFonctionnalite_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link robot.device.Fonctionnalite#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Liste Parametres</b></em>' containment reference list.
   * The list contents are of type {@link robot.device.Parametre}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Liste Parametres</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Liste Parametres</em>' containment reference list.
   * @see robot.device.DevicePackage#getFonctionnalite_ListeParametres()
   * @model containment="true"
   * @generated
   */
  EList<Parametre> getListeParametres();

} // Fonctionnalite
