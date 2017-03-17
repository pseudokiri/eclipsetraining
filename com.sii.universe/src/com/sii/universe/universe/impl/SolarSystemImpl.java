/**
 */
package com.sii.universe.universe.impl;

import com.sii.universe.universe.Planet;
import com.sii.universe.universe.SolarSystem;
import com.sii.universe.universe.Star;
import com.sii.universe.universe.UniversePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solar System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.universe.universe.impl.SolarSystemImpl#getSolar <em>Solar</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.SolarSystemImpl#getPlanets <em>Planets</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.SolarSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.SolarSystemImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolarSystemImpl extends MinimalEObjectImpl.Container implements SolarSystem {
	/**
	 * The cached value of the '{@link #getSolar() <em>Solar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar()
	 * @generated
	 * @ordered
	 */
	protected Star solar;

	/**
	 * The cached value of the '{@link #getPlanets() <em>Planets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanets()
	 * @generated
	 * @ordered
	 */
	protected EList<Planet> planets;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolarSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversePackage.Literals.SOLAR_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Star getSolar() {
		return solar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolar(Star newSolar, NotificationChain msgs) {
		Star oldSolar = solar;
		solar = newSolar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversePackage.SOLAR_SYSTEM__SOLAR, oldSolar, newSolar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar(Star newSolar) {
		if (newSolar != solar) {
			NotificationChain msgs = null;
			if (solar != null)
				msgs = ((InternalEObject)solar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniversePackage.SOLAR_SYSTEM__SOLAR, null, msgs);
			if (newSolar != null)
				msgs = ((InternalEObject)newSolar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniversePackage.SOLAR_SYSTEM__SOLAR, null, msgs);
			msgs = basicSetSolar(newSolar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversePackage.SOLAR_SYSTEM__SOLAR, newSolar, newSolar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Planet> getPlanets() {
		if (planets == null) {
			planets = new EObjectContainmentEList<Planet>(Planet.class, this, UniversePackage.SOLAR_SYSTEM__PLANETS);
		}
		return planets;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniversePackage.SOLAR_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPosition() {
		if (position == null) {
			position = new EDataTypeUniqueEList<Integer>(Integer.class, this, UniversePackage.SOLAR_SYSTEM__POSITION);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversePackage.SOLAR_SYSTEM__SOLAR:
				return basicSetSolar(null, msgs);
			case UniversePackage.SOLAR_SYSTEM__PLANETS:
				return ((InternalEList<?>)getPlanets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversePackage.SOLAR_SYSTEM__SOLAR:
				return getSolar();
			case UniversePackage.SOLAR_SYSTEM__PLANETS:
				return getPlanets();
			case UniversePackage.SOLAR_SYSTEM__NAME:
				return getName();
			case UniversePackage.SOLAR_SYSTEM__POSITION:
				return getPosition();
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
			case UniversePackage.SOLAR_SYSTEM__SOLAR:
				setSolar((Star)newValue);
				return;
			case UniversePackage.SOLAR_SYSTEM__PLANETS:
				getPlanets().clear();
				getPlanets().addAll((Collection<? extends Planet>)newValue);
				return;
			case UniversePackage.SOLAR_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case UniversePackage.SOLAR_SYSTEM__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection<? extends Integer>)newValue);
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
			case UniversePackage.SOLAR_SYSTEM__SOLAR:
				setSolar((Star)null);
				return;
			case UniversePackage.SOLAR_SYSTEM__PLANETS:
				getPlanets().clear();
				return;
			case UniversePackage.SOLAR_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniversePackage.SOLAR_SYSTEM__POSITION:
				getPosition().clear();
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
			case UniversePackage.SOLAR_SYSTEM__SOLAR:
				return solar != null;
			case UniversePackage.SOLAR_SYSTEM__PLANETS:
				return planets != null && !planets.isEmpty();
			case UniversePackage.SOLAR_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UniversePackage.SOLAR_SYSTEM__POSITION:
				return position != null && !position.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SolarSystemImpl
