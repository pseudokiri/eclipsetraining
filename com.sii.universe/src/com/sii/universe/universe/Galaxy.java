/**
 */
package com.sii.universe.universe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Galaxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.universe.universe.Galaxy#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.universe.universe.Galaxy#getPosition <em>Position</em>}</li>
 *   <li>{@link com.sii.universe.universe.Galaxy#getVelocityFromUniverseCenter <em>Velocity From Universe Center</em>}</li>
 *   <li>{@link com.sii.universe.universe.Galaxy#getBlackHoles <em>Black Holes</em>}</li>
 *   <li>{@link com.sii.universe.universe.Galaxy#getSolarsystem <em>Solarsystem</em>}</li>
 * </ul>
 *
 * @see com.sii.universe.universe.UniversePackage#getGalaxy()
 * @model
 * @generated
 */
public interface Galaxy extends EObject {
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
	 * @see com.sii.universe.universe.UniversePackage#getGalaxy_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.universe.universe.Galaxy#getName <em>Name</em>}' attribute.
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
	 * @see com.sii.universe.universe.UniversePackage#getGalaxy_Position()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Integer> getPosition();

	/**
	 * Returns the value of the '<em><b>Velocity From Universe Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity From Universe Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity From Universe Center</em>' attribute.
	 * @see #setVelocityFromUniverseCenter(int)
	 * @see com.sii.universe.universe.UniversePackage#getGalaxy_VelocityFromUniverseCenter()
	 * @model required="true"
	 * @generated
	 */
	int getVelocityFromUniverseCenter();

	/**
	 * Sets the value of the '{@link com.sii.universe.universe.Galaxy#getVelocityFromUniverseCenter <em>Velocity From Universe Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity From Universe Center</em>' attribute.
	 * @see #getVelocityFromUniverseCenter()
	 * @generated
	 */
	void setVelocityFromUniverseCenter(int value);

	/**
	 * Returns the value of the '<em><b>Black Holes</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.universe.universe.BlackHole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Black Holes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Black Holes</em>' containment reference list.
	 * @see com.sii.universe.universe.UniversePackage#getGalaxy_BlackHoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlackHole> getBlackHoles();

	/**
	 * Returns the value of the '<em><b>Solarsystem</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.universe.universe.SolarSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solarsystem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solarsystem</em>' containment reference list.
	 * @see com.sii.universe.universe.UniversePackage#getGalaxy_Solarsystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolarSystem> getSolarsystem();

} // Galaxy
