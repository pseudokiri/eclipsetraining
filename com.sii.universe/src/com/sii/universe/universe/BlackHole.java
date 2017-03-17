/**
 */
package com.sii.universe.universe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Black Hole</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.universe.universe.BlackHole#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see com.sii.universe.universe.UniversePackage#getBlackHole()
 * @model
 * @generated
 */
public interface BlackHole extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute list.
	 * @see com.sii.universe.universe.UniversePackage#getBlackHole_Position()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Integer> getPosition();

} // BlackHole
