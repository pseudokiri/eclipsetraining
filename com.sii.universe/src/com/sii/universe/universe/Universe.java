/**
 */
package com.sii.universe.universe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.universe.universe.Universe#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.universe.universe.Universe#getGalaxies <em>Galaxies</em>}</li>
 * </ul>
 *
 * @see com.sii.universe.universe.UniversePackage#getUniverse()
 * @model
 * @generated
 */
public interface Universe extends EObject {
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
	 * @see com.sii.universe.universe.UniversePackage#getUniverse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.universe.universe.Universe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Galaxies</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.universe.universe.Galaxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Galaxies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Galaxies</em>' containment reference list.
	 * @see com.sii.universe.universe.UniversePackage#getUniverse_Galaxies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Galaxy> getGalaxies();

} // Universe
