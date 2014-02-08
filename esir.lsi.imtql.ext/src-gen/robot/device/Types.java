/**
 */
package robot.device;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.device.Types#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.device.DevicePackage#getTypes()
 * @model
 * @generated
 */
public interface Types extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link robot.device.Device}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see robot.device.DevicePackage#getTypes_Types()
   * @model containment="true"
   * @generated
   */
  EList<Device> getTypes();

} // Types
