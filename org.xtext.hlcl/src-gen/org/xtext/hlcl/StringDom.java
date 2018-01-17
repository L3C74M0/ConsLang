/**
 * generated by Xtext 2.13.0
 */
package org.xtext.hlcl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Dom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hlcl.StringDom#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hlcl.HlclPackage#getStringDom()
 * @model
 * @generated
 */
public interface StringDom extends Dom
{
  /**
   * Returns the value of the '<em><b>List</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute list.
   * @see org.xtext.hlcl.HlclPackage#getStringDom_List()
   * @model unique="false"
   * @generated
   */
  EList<String> getList();

} // StringDom
