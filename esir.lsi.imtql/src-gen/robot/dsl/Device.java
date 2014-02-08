/**
 */
package robot.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.dsl.Device#getName <em>Name</em>}</li>
 *   <li>{@link robot.dsl.Device#getRefFonction <em>Ref Fonction</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.dsl.DslPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject
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
   * @see robot.dsl.DslPackage#getDevice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link robot.dsl.Device#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ref Fonction</b></em>' containment reference list.
   * The list contents are of type {@link robot.dsl.Fonctionnalite}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Fonction</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Fonction</em>' containment reference list.
   * @see robot.dsl.DslPackage#getDevice_RefFonction()
   * @model containment="true"
   * @generated
   */
  EList<Fonctionnalite> getRefFonction();

} // Device
