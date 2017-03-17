/**
 */
package com.sii.universe.universe.impl;

import com.sii.universe.universe.Satellite;
import com.sii.universe.universe.UniversePackage;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.universe.universe.impl.SatelliteImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.SatelliteImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.SatelliteImpl#getRotationDuration <em>Rotation Duration</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.SatelliteImpl#getRevolutionDuration <em>Revolution Duration</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.SatelliteImpl#getMass <em>Mass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatelliteImpl extends MinimalEObjectImpl.Container implements Satellite {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> position;

	/**
	 * The default value of the '{@link #getRotationDuration() <em>Rotation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationDuration()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ROTATION_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationDuration() <em>Rotation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationDuration()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar rotationDuration = ROTATION_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevolutionDuration() <em>Revolution Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevolutionDuration()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REVOLUTION_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevolutionDuration() <em>Revolution Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevolutionDuration()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar revolutionDuration = REVOLUTION_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected static final int MASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected int mass = MASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversePackage.Literals.SATELLITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversePackage.SATELLITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPosition() {
		if (position == null) {
			position = new EDataTypeUniqueEList<Integer>(Integer.class, this, UniversePackage.SATELLITE__POSITION);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRotationDuration() {
		return rotationDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationDuration(XMLGregorianCalendar newRotationDuration) {
		XMLGregorianCalendar oldRotationDuration = rotationDuration;
		rotationDuration = newRotationDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversePackage.SATELLITE__ROTATION_DURATION, oldRotationDuration, rotationDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRevolutionDuration() {
		return revolutionDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevolutionDuration(XMLGregorianCalendar newRevolutionDuration) {
		XMLGregorianCalendar oldRevolutionDuration = revolutionDuration;
		revolutionDuration = newRevolutionDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversePackage.SATELLITE__REVOLUTION_DURATION, oldRevolutionDuration, revolutionDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMass(int newMass) {
		int oldMass = mass;
		mass = newMass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversePackage.SATELLITE__MASS, oldMass, mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversePackage.SATELLITE__NAME:
				return getName();
			case UniversePackage.SATELLITE__POSITION:
				return getPosition();
			case UniversePackage.SATELLITE__ROTATION_DURATION:
				return getRotationDuration();
			case UniversePackage.SATELLITE__REVOLUTION_DURATION:
				return getRevolutionDuration();
			case UniversePackage.SATELLITE__MASS:
				return getMass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversePackage.SATELLITE__NAME:
				setName((String)newValue);
				return;
			case UniversePackage.SATELLITE__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection<? extends Integer>)newValue);
				return;
			case UniversePackage.SATELLITE__ROTATION_DURATION:
				setRotationDuration((XMLGregorianCalendar)newValue);
				return;
			case UniversePackage.SATELLITE__REVOLUTION_DURATION:
				setRevolutionDuration((XMLGregorianCalendar)newValue);
				return;
			case UniversePackage.SATELLITE__MASS:
				setMass((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniversePackage.SATELLITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniversePackage.SATELLITE__POSITION:
				getPosition().clear();
				return;
			case UniversePackage.SATELLITE__ROTATION_DURATION:
				setRotationDuration(ROTATION_DURATION_EDEFAULT);
				return;
			case UniversePackage.SATELLITE__REVOLUTION_DURATION:
				setRevolutionDuration(REVOLUTION_DURATION_EDEFAULT);
				return;
			case UniversePackage.SATELLITE__MASS:
				setMass(MASS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniversePackage.SATELLITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UniversePackage.SATELLITE__POSITION:
				return position != null && !position.isEmpty();
			case UniversePackage.SATELLITE__ROTATION_DURATION:
				return ROTATION_DURATION_EDEFAULT == null ? rotationDuration != null : !ROTATION_DURATION_EDEFAULT.equals(rotationDuration);
			case UniversePackage.SATELLITE__REVOLUTION_DURATION:
				return REVOLUTION_DURATION_EDEFAULT == null ? revolutionDuration != null : !REVOLUTION_DURATION_EDEFAULT.equals(revolutionDuration);
			case UniversePackage.SATELLITE__MASS:
				return mass != MASS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", position: ");
		result.append(position);
		result.append(", rotationDuration: ");
		result.append(rotationDuration);
		result.append(", revolutionDuration: ");
		result.append(revolutionDuration);
		result.append(", mass: ");
		result.append(mass);
		result.append(')');
		return result.toString();
	}

} //SatelliteImpl
