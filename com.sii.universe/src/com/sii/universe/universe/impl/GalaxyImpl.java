/**
 */
package com.sii.universe.universe.impl;

import com.sii.universe.universe.BlackHole;
import com.sii.universe.universe.Galaxy;
import com.sii.universe.universe.SolarSystem;
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
 * An implementation of the model object '<em><b>Galaxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.universe.universe.impl.GalaxyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.GalaxyImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.GalaxyImpl#getVelocityFromUniverseCenter <em>Velocity From Universe Center</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.GalaxyImpl#getBlackHoles <em>Black Holes</em>}</li>
 *   <li>{@link com.sii.universe.universe.impl.GalaxyImpl#getSolarsystem <em>Solarsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GalaxyImpl extends MinimalEObjectImpl.Container implements Galaxy {
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
	 * The default value of the '{@link #getVelocityFromUniverseCenter() <em>Velocity From Universe Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocityFromUniverseCenter()
	 * @generated
	 * @ordered
	 */
	protected static final int VELOCITY_FROM_UNIVERSE_CENTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVelocityFromUniverseCenter() <em>Velocity From Universe Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocityFromUniverseCenter()
	 * @generated
	 * @ordered
	 */
	protected int velocityFromUniverseCenter = VELOCITY_FROM_UNIVERSE_CENTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlackHoles() <em>Black Holes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackHoles()
	 * @generated
	 * @ordered
	 */
	protected EList<BlackHole> blackHoles;

	/**
	 * The cached value of the '{@link #getSolarsystem() <em>Solarsystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<SolarSystem> solarsystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GalaxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversePackage.Literals.GALAXY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniversePackage.GALAXY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPosition() {
		if (position == null) {
			position = new EDataTypeUniqueEList<Integer>(Integer.class, this, UniversePackage.GALAXY__POSITION);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVelocityFromUniverseCenter() {
		return velocityFromUniverseCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocityFromUniverseCenter(int newVelocityFromUniverseCenter) {
		int oldVelocityFromUniverseCenter = velocityFromUniverseCenter;
		velocityFromUniverseCenter = newVelocityFromUniverseCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversePackage.GALAXY__VELOCITY_FROM_UNIVERSE_CENTER, oldVelocityFromUniverseCenter, velocityFromUniverseCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlackHole> getBlackHoles() {
		if (blackHoles == null) {
			blackHoles = new EObjectContainmentEList<BlackHole>(BlackHole.class, this, UniversePackage.GALAXY__BLACK_HOLES);
		}
		return blackHoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolarSystem> getSolarsystem() {
		if (solarsystem == null) {
			solarsystem = new EObjectContainmentEList<SolarSystem>(SolarSystem.class, this, UniversePackage.GALAXY__SOLARSYSTEM);
		}
		return solarsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversePackage.GALAXY__BLACK_HOLES:
				return ((InternalEList<?>)getBlackHoles()).basicRemove(otherEnd, msgs);
			case UniversePackage.GALAXY__SOLARSYSTEM:
				return ((InternalEList<?>)getSolarsystem()).basicRemove(otherEnd, msgs);
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
			case UniversePackage.GALAXY__NAME:
				return getName();
			case UniversePackage.GALAXY__POSITION:
				return getPosition();
			case UniversePackage.GALAXY__VELOCITY_FROM_UNIVERSE_CENTER:
				return getVelocityFromUniverseCenter();
			case UniversePackage.GALAXY__BLACK_HOLES:
				return getBlackHoles();
			case UniversePackage.GALAXY__SOLARSYSTEM:
				return getSolarsystem();
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
			case UniversePackage.GALAXY__NAME:
				setName((String)newValue);
				return;
			case UniversePackage.GALAXY__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection<? extends Integer>)newValue);
				return;
			case UniversePackage.GALAXY__VELOCITY_FROM_UNIVERSE_CENTER:
				setVelocityFromUniverseCenter((Integer)newValue);
				return;
			case UniversePackage.GALAXY__BLACK_HOLES:
				getBlackHoles().clear();
				getBlackHoles().addAll((Collection<? extends BlackHole>)newValue);
				return;
			case UniversePackage.GALAXY__SOLARSYSTEM:
				getSolarsystem().clear();
				getSolarsystem().addAll((Collection<? extends SolarSystem>)newValue);
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
			case UniversePackage.GALAXY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniversePackage.GALAXY__POSITION:
				getPosition().clear();
				return;
			case UniversePackage.GALAXY__VELOCITY_FROM_UNIVERSE_CENTER:
				setVelocityFromUniverseCenter(VELOCITY_FROM_UNIVERSE_CENTER_EDEFAULT);
				return;
			case UniversePackage.GALAXY__BLACK_HOLES:
				getBlackHoles().clear();
				return;
			case UniversePackage.GALAXY__SOLARSYSTEM:
				getSolarsystem().clear();
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
			case UniversePackage.GALAXY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UniversePackage.GALAXY__POSITION:
				return position != null && !position.isEmpty();
			case UniversePackage.GALAXY__VELOCITY_FROM_UNIVERSE_CENTER:
				return velocityFromUniverseCenter != VELOCITY_FROM_UNIVERSE_CENTER_EDEFAULT;
			case UniversePackage.GALAXY__BLACK_HOLES:
				return blackHoles != null && !blackHoles.isEmpty();
			case UniversePackage.GALAXY__SOLARSYSTEM:
				return solarsystem != null && !solarsystem.isEmpty();
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
		result.append(", VelocityFromUniverseCenter: ");
		result.append(velocityFromUniverseCenter);
		result.append(')');
		return result.toString();
	}

} //GalaxyImpl
