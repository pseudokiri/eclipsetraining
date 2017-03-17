/**
 */
package com.sii.universe.universe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solar System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.universe.universe.SolarSystem#getSolar <em>Solar</em>}</li>
 *   <li>{@link com.sii.universe.universe.SolarSystem#getPlanets <em>Planets</em>}</li>
 *   <li>{@link com.sii.universe.universe.SolarSystem#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.universe.universe.SolarSystem#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see com.sii.universe.universe.UniversePackage#getSolarSystem()
 * @model
 * @generated
 */
public interface SolarSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Solar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar</em>' containment reference.
	 * @see #setSolar(Star)
	 * @see com.sii.universe.universe.UniversePackage#getSolarSystem_Solar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Star getSolar();

	/**
	 * Sets the value of the '{@link com.sii.universe.universe.SolarSystem#getSolar <em>Solar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar</em>' containment reference.
	 * @see #getSolar()
	 * @generated
	 */
	void setSolar(Star value);

	/**
	 * Returns the value of the '<em><b>Planets</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.universe.universe.Planet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planets</em>' containment reference list.
	 * @see com.sii.universe.universe.UniversePackage#getSolarSystem_Planets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Planet> getPlanets();

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
	 * @see com.sii.universe.universe.UniversePackage#getSolarSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.universe.universe.SolarSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see com.sii.universe.universe.UniversePackage#getSolarSystem_Position()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Integer> getPosition();

} // SolarSystem
