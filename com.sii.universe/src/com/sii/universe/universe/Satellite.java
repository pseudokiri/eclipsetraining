/**
 */
package com.sii.universe.universe;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.universe.universe.Satellite#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.universe.universe.Satellite#getPosition <em>Position</em>}</li>
 *   <li>{@link com.sii.universe.universe.Satellite#getRotationDuration <em>Rotation Duration</em>}</li>
 *   <li>{@link com.sii.universe.universe.Satellite#getRevolutionDuration <em>Revolution Duration</em>}</li>
 *   <li>{@link com.sii.universe.universe.Satellite#getMass <em>Mass</em>}</li>
 * </ul>
 *
 * @see com.sii.universe.universe.UniversePackage#getSatellite()
 * @model
 * @generated
 */
public interface Satellite extends EObject {
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
	 * @see com.sii.universe.universe.UniversePackage#getSatellite_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.universe.universe.Satellite#getName <em>Name</em>}' attribute.
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
	 * @see com.sii.universe.universe.UniversePackage#getSatellite_Position()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Integer> getPosition();

	/**
	 * Returns the value of the '<em><b>Rotation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation Duration</em>' attribute.
	 * @see #setRotationDuration(XMLGregorianCalendar)
	 * @see com.sii.universe.universe.UniversePackage#getSatellite_RotationDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 * @generated
	 */
	XMLGregorianCalendar getRotationDuration();

	/**
	 * Sets the value of the '{@link com.sii.universe.universe.Satellite#getRotationDuration <em>Rotation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Duration</em>' attribute.
	 * @see #getRotationDuration()
	 * @generated
	 */
	void setRotationDuration(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Revolution Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revolution Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revolution Duration</em>' attribute.
	 * @see #setRevolutionDuration(XMLGregorianCalendar)
	 * @see com.sii.universe.universe.UniversePackage#getSatellite_RevolutionDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 * @generated
	 */
	XMLGregorianCalendar getRevolutionDuration();

	/**
	 * Sets the value of the '{@link com.sii.universe.universe.Satellite#getRevolutionDuration <em>Revolution Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revolution Duration</em>' attribute.
	 * @see #getRevolutionDuration()
	 * @generated
	 */
	void setRevolutionDuration(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see #setMass(int)
	 * @see com.sii.universe.universe.UniversePackage#getSatellite_Mass()
	 * @model
	 * @generated
	 */
	int getMass();

	/**
	 * Sets the value of the '{@link com.sii.universe.universe.Satellite#getMass <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' attribute.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(int value);

} // Satellite
