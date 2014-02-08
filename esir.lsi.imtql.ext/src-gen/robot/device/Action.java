/**
 */
package robot.device;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.device.Action#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.device.DevicePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Fonctionnalite
{
  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(EJavaObject)
   * @see robot.device.DevicePackage#getAction_Return()
   * @model containment="true"
   * @generated
   */
  EJavaObject getReturn();

  /**
   * Sets the value of the '{@link robot.device.Action#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(EJavaObject value);

} // Action
