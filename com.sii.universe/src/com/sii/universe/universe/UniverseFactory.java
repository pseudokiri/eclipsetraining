/**
 */
package com.sii.universe.universe;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sii.universe.universe.UniversePackage
 * @generated
 */
public interface UniverseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniverseFactory eINSTANCE = com.sii.universe.universe.impl.UniverseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Universe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universe</em>'.
	 * @generated
	 */
	Universe createUniverse();

	/**
	 * Returns a new object of class '<em>Galaxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Galaxy</em>'.
	 * @generated
	 */
	Galaxy createGalaxy();

	/**
	 * Returns a new object of class '<em>Star</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Star</em>'.
	 * @generated
	 */
	Star createStar();

	/**
	 * Returns a new object of class '<em>Planet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planet</em>'.
	 * @generated
	 */
	Planet createPlanet();

	/**
	 * Returns a new object of class '<em>Satellite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite</em>'.
	 * @generated
	 */
	Satellite createSatellite();

	/**
	 * Returns a new object of class '<em>Black Hole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Black Hole</em>'.
	 * @generated
	 */
	BlackHole createBlackHole();

	/**
	 * Returns a new object of class '<em>Solar System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solar System</em>'.
	 * @generated
	 */
	SolarSystem createSolarSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UniversePackage getUniversePackage();

} //UniverseFactory
