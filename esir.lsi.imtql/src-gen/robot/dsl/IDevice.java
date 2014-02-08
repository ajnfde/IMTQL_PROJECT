/**
 */
package robot.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDevice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.dsl.IDevice#getTypeof <em>Typeof</em>}</li>
 *   <li>{@link robot.dsl.IDevice#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.dsl.DslPackage#getIDevice()
 * @model
 * @generated
 */
public interface IDevice extends EObject
{
  /**
   * Returns the value of the '<em><b>Typeof</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typeof</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typeof</em>' attribute.
   * @see #setTypeof(String)
   * @see robot.dsl.DslPackage#getIDevice_Typeof()
   * @model
   * @generated
   */
  String getTypeof();

  /**
   * Sets the value of the '{@link robot.dsl.IDevice#getTypeof <em>Typeof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typeof</em>' attribute.
   * @see #getTypeof()
   * @generated
   */
  void setTypeof(String value);

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
   * @see robot.dsl.DslPackage#getIDevice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link robot.dsl.IDevice#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // IDevice
