/**
 */
package com.sii.universe.universe.impl;

import com.sii.universe.universe.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniverseFactoryImpl extends EFactoryImpl implements UniverseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UniverseFactory init() {
		try {
			UniverseFactory theUniverseFactory = (UniverseFactory)EPackage.Registry.INSTANCE.getEFactory(UniversePackage.eNS_URI);
			if (theUniverseFactory != null) {
				return theUniverseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UniverseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniverseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UniversePackage.UNIVERSE: return createUniverse();
			case UniversePackage.GALAXY: return createGalaxy();
			case UniversePackage.STAR: return createStar();
			case UniversePackage.PLANET: return createPlanet();
			case UniversePackage.SATELLITE: return createSatellite();
			case UniversePackage.BLACK_HOLE: return createBlackHole();
			case UniversePackage.SOLAR_SYSTEM: return createSolarSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universe createUniverse() {
		UniverseImpl universe = new UniverseImpl();
		return universe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Galaxy createGalaxy() {
		GalaxyImpl galaxy = new GalaxyImpl();
		return galaxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Star createStar() {
		StarImpl star = new StarImpl();
		return star;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planet createPlanet() {
		PlanetImpl planet = new PlanetImpl();
		return planet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satellite createSatellite() {
		SatelliteImpl satellite = new SatelliteImpl();
		return satellite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlackHole createBlackHole() {
		BlackHoleImpl blackHole = new BlackHoleImpl();
		return blackHole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolarSystem createSolarSystem() {
		SolarSystemImpl solarSystem = new SolarSystemImpl();
		return solarSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversePackage getUniversePackage() {
		return (UniversePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UniversePackage getPackage() {
		return UniversePackage.eINSTANCE;
	}

} //UniverseFactoryImpl
