/**
 */
package com.sii.universe.universe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sii.universe.universe.UniverseFactory
 * @model kind="package"
 * @generated
 */
public interface UniversePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "universe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.sii/universe/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "universe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversePackage eINSTANCE = com.sii.universe.universe.impl.UniversePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sii.universe.universe.impl.UniverseImpl <em>Universe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.universe.universe.impl.UniverseImpl
	 * @see com.sii.universe.universe.impl.UniversePackageImpl#getUniverse()
	 * @generated
	 */
	int UNIVERSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Galaxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__GALAXIES = 1;

	/**
	 * The number of structural features of the '<em>Universe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Universe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.universe.universe.impl.GalaxyImpl <em>Galaxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.universe.universe.impl.GalaxyImpl
	 * @see com.sii.universe.universe.impl.UniversePackageImpl#getGalaxy()
	 * @generated
	 */
	int GALAXY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Velocity From Universe Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY__VELOCITY_FROM_UNIVERSE_CENTER = 2;

	/**
	 * The feature id for the '<em><b>Black Holes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY__BLACK_HOLES = 3;

	/**
	 * The feature id for the '<em><b>Solarsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY__SOLARSYSTEM = 4;

	/**
	 * The number of structural features of the '<em>Galaxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Galaxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.universe.universe.impl.StarImpl <em>Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.universe.universe.impl.StarImpl
	 * @see com.sii.universe.universe.impl.UniversePackageImpl#getStar()
	 * @generated
	 */
	int STAR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Rotation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__ROTATION_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__MASS = 3;

	/**
	 * The number of structural features of the '<em>Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.universe.universe.impl.PlanetImpl <em>Planet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.universe.universe.impl.PlanetImpl
	 * @see com.sii.universe.universe.impl.UniversePackageImpl#getPlanet()
	 * @generated
	 */
	int PLANET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANET__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Satellites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANET__SATELLITES = 2;

	/**
	 * The feature id for the '<em><b>Rotation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANET__ROTATION_DURATION = 3;

	/**
	 * The feature id for the '<em><b>Revolution Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANET__REVOLUTION_DURATION = 4;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANET__MASS = 5;

	/**
	 * The number of structural features of the '<em>Planet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Planet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.universe.universe.impl.SatelliteImpl <em>Satellite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.universe.universe.impl.SatelliteImpl
	 * @see com.sii.universe.universe.impl.UniversePackageImpl#getSatellite()
	 * @generated
	 */
	int SATELLITE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Rotation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__ROTATION_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Revolution Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__REVOLUTION_DURATION = 3;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__MASS = 4;

	/**
	 * The number of structural features of the '<em>Satellite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Satellite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.universe.universe.impl.BlackHoleImpl <em>Black Hole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.universe.universe.impl.BlackHoleImpl
	 * @see com.sii.universe.universe.impl.UniversePackageImpl#getBlackHole()
	 * @generated
	 */
	int BLACK_HOLE = 5;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_HOLE__POSITION = 0;

	/**
	 * The number of structural features of the '<em>Black Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_HOLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Black Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_HOLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.universe.universe.impl.SolarSystemImpl <em>Solar System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.universe.universe.impl.SolarSystemImpl
	 * @see com.sii.universe.universe.impl.UniversePackageImpl#getSolarSystem()
	 * @generated
	 */
	int SOLAR_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Solar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLAR_SYSTEM__SOLAR = 0;

	/**
	 * The feature id for the '<em><b>Planets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLAR_SYSTEM__PLANETS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLAR_SYSTEM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLAR_SYSTEM__POSITION = 3;

	/**
	 * The number of structural features of the '<em>Solar System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLAR_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Solar System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLAR_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.sii.universe.universe.Universe <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universe</em>'.
	 * @see com.sii.universe.universe.Universe
	 * @generated
	 */
	EClass getUniverse();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Universe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.universe.universe.Universe#getName()
	 * @see #getUniverse()
	 * @generated
	 */
	EAttribute getUniverse_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.universe.universe.Universe#getGalaxies <em>Galaxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Galaxies</em>'.
	 * @see com.sii.universe.universe.Universe#getGalaxies()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_Galaxies();

	/**
	 * Returns the meta object for class '{@link com.sii.universe.universe.Galaxy <em>Galaxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Galaxy</em>'.
	 * @see com.sii.universe.universe.Galaxy
	 * @generated
	 */
	EClass getGalaxy();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Galaxy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.universe.universe.Galaxy#getName()
	 * @see #getGalaxy()
	 * @generated
	 */
	EAttribute getGalaxy_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.sii.universe.universe.Galaxy#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Position</em>'.
	 * @see com.sii.universe.universe.Galaxy#getPosition()
	 * @see #getGalaxy()
	 * @generated
	 */
	EAttribute getGalaxy_Position();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Galaxy#getVelocityFromUniverseCenter <em>Velocity From Universe Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity From Universe Center</em>'.
	 * @see com.sii.universe.universe.Galaxy#getVelocityFromUniverseCenter()
	 * @see #getGalaxy()
	 * @generated
	 */
	EAttribute getGalaxy_VelocityFromUniverseCenter();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.universe.universe.Galaxy#getBlackHoles <em>Black Holes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Black Holes</em>'.
	 * @see com.sii.universe.universe.Galaxy#getBlackHoles()
	 * @see #getGalaxy()
	 * @generated
	 */
	EReference getGalaxy_BlackHoles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.universe.universe.Galaxy#getSolarsystem <em>Solarsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solarsystem</em>'.
	 * @see com.sii.universe.universe.Galaxy#getSolarsystem()
	 * @see #getGalaxy()
	 * @generated
	 */
	EReference getGalaxy_Solarsystem();

	/**
	 * Returns the meta object for class '{@link com.sii.universe.universe.Star <em>Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Star</em>'.
	 * @see com.sii.universe.universe.Star
	 * @generated
	 */
	EClass getStar();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Star#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.universe.universe.Star#getName()
	 * @see #getStar()
	 * @generated
	 */
	EAttribute getStar_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.sii.universe.universe.Star#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Position</em>'.
	 * @see com.sii.universe.universe.Star#getPosition()
	 * @see #getStar()
	 * @generated
	 */
	EAttribute getStar_Position();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Star#getRotationDuration <em>Rotation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation Duration</em>'.
	 * @see com.sii.universe.universe.Star#getRotationDuration()
	 * @see #getStar()
	 * @generated
	 */
	EAttribute getStar_RotationDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Star#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see com.sii.universe.universe.Star#getMass()
	 * @see #getStar()
	 * @generated
	 */
	EAttribute getStar_Mass();

	/**
	 * Returns the meta object for class '{@link com.sii.universe.universe.Planet <em>Planet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planet</em>'.
	 * @see com.sii.universe.universe.Planet
	 * @generated
	 */
	EClass getPlanet();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Planet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.universe.universe.Planet#getName()
	 * @see #getPlanet()
	 * @generated
	 */
	EAttribute getPlanet_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.sii.universe.universe.Planet#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Position</em>'.
	 * @see com.sii.universe.universe.Planet#getPosition()
	 * @see #getPlanet()
	 * @generated
	 */
	EAttribute getPlanet_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.universe.universe.Planet#getSatellites <em>Satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Satellites</em>'.
	 * @see com.sii.universe.universe.Planet#getSatellites()
	 * @see #getPlanet()
	 * @generated
	 */
	EReference getPlanet_Satellites();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Planet#getRotationDuration <em>Rotation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation Duration</em>'.
	 * @see com.sii.universe.universe.Planet#getRotationDuration()
	 * @see #getPlanet()
	 * @generated
	 */
	EAttribute getPlanet_RotationDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Planet#getRevolutionDuration <em>Revolution Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revolution Duration</em>'.
	 * @see com.sii.universe.universe.Planet#getRevolutionDuration()
	 * @see #getPlanet()
	 * @generated
	 */
	EAttribute getPlanet_RevolutionDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Planet#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see com.sii.universe.universe.Planet#getMass()
	 * @see #getPlanet()
	 * @generated
	 */
	EAttribute getPlanet_Mass();

	/**
	 * Returns the meta object for class '{@link com.sii.universe.universe.Satellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite</em>'.
	 * @see com.sii.universe.universe.Satellite
	 * @generated
	 */
	EClass getSatellite();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Satellite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.universe.universe.Satellite#getName()
	 * @see #getSatellite()
	 * @generated
	 */
	EAttribute getSatellite_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.sii.universe.universe.Satellite#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Position</em>'.
	 * @see com.sii.universe.universe.Satellite#getPosition()
	 * @see #getSatellite()
	 * @generated
	 */
	EAttribute getSatellite_Position();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Satellite#getRotationDuration <em>Rotation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation Duration</em>'.
	 * @see com.sii.universe.universe.Satellite#getRotationDuration()
	 * @see #getSatellite()
	 * @generated
	 */
	EAttribute getSatellite_RotationDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Satellite#getRevolutionDuration <em>Revolution Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revolution Duration</em>'.
	 * @see com.sii.universe.universe.Satellite#getRevolutionDuration()
	 * @see #getSatellite()
	 * @generated
	 */
	EAttribute getSatellite_RevolutionDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.Satellite#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see com.sii.universe.universe.Satellite#getMass()
	 * @see #getSatellite()
	 * @generated
	 */
	EAttribute getSatellite_Mass();

	/**
	 * Returns the meta object for class '{@link com.sii.universe.universe.BlackHole <em>Black Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Black Hole</em>'.
	 * @see com.sii.universe.universe.BlackHole
	 * @generated
	 */
	EClass getBlackHole();

	/**
	 * Returns the meta object for the attribute list '{@link com.sii.universe.universe.BlackHole#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Position</em>'.
	 * @see com.sii.universe.universe.BlackHole#getPosition()
	 * @see #getBlackHole()
	 * @generated
	 */
	EAttribute getBlackHole_Position();

	/**
	 * Returns the meta object for class '{@link com.sii.universe.universe.SolarSystem <em>Solar System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solar System</em>'.
	 * @see com.sii.universe.universe.SolarSystem
	 * @generated
	 */
	EClass getSolarSystem();

	/**
	 * Returns the meta object for the containment reference '{@link com.sii.universe.universe.SolarSystem#getSolar <em>Solar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Solar</em>'.
	 * @see com.sii.universe.universe.SolarSystem#getSolar()
	 * @see #getSolarSystem()
	 * @generated
	 */
	EReference getSolarSystem_Solar();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.universe.universe.SolarSystem#getPlanets <em>Planets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Planets</em>'.
	 * @see com.sii.universe.universe.SolarSystem#getPlanets()
	 * @see #getSolarSystem()
	 * @generated
	 */
	EReference getSolarSystem_Planets();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.universe.universe.SolarSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.universe.universe.SolarSystem#getName()
	 * @see #getSolarSystem()
	 * @generated
	 */
	EAttribute getSolarSystem_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.sii.universe.universe.SolarSystem#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Position</em>'.
	 * @see com.sii.universe.universe.SolarSystem#getPosition()
	 * @see #getSolarSystem()
	 * @generated
	 */
	EAttribute getSolarSystem_Position();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniverseFactory getUniverseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.sii.universe.universe.impl.UniverseImpl <em>Universe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.universe.universe.impl.UniverseImpl
		 * @see com.sii.universe.universe.impl.UniversePackageImpl#getUniverse()
		 * @generated
		 */
		EClass UNIVERSE = eINSTANCE.getUniverse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSE__NAME = eINSTANCE.getUniverse_Name();

		/**
		 * The meta object literal for the '<em><b>Galaxies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__GALAXIES = eINSTANCE.getUniverse_Galaxies();

		/**
		 * The meta object literal for the '{@link com.sii.universe.universe.impl.GalaxyImpl <em>Galaxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.universe.universe.impl.GalaxyImpl
		 * @see com.sii.universe.universe.impl.UniversePackageImpl#getGalaxy()
		 * @generated
		 */
		EClass GALAXY = eINSTANCE.getGalaxy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALAXY__NAME = eINSTANCE.getGalaxy_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALAXY__POSITION = eINSTANCE.getGalaxy_Position();

		/**
		 * The meta object literal for the '<em><b>Velocity From Universe Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALAXY__VELOCITY_FROM_UNIVERSE_CENTER = eINSTANCE.getGalaxy_VelocityFromUniverseCenter();

		/**
		 * The meta object literal for the '<em><b>Black Holes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GALAXY__BLACK_HOLES = eINSTANCE.getGalaxy_BlackHoles();

		/**
		 * The meta object literal for the '<em><b>Solarsystem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GALAXY__SOLARSYSTEM = eINSTANCE.getGalaxy_Solarsystem();

		/**
		 * The meta object literal for the '{@link com.sii.universe.universe.impl.StarImpl <em>Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.universe.universe.impl.StarImpl
		 * @see com.sii.universe.universe.impl.UniversePackageImpl#getStar()
		 * @generated
		 */
		EClass STAR = eINSTANCE.getStar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAR__NAME = eINSTANCE.getStar_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAR__POSITION = eINSTANCE.getStar_Position();

		/**
		 * The meta object literal for the '<em><b>Rotation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAR__ROTATION_DURATION = eINSTANCE.getStar_RotationDuration();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAR__MASS = eINSTANCE.getStar_Mass();

		/**
		 * The meta object literal for the '{@link com.sii.universe.universe.impl.PlanetImpl <em>Planet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.universe.universe.impl.PlanetImpl
		 * @see com.sii.universe.universe.impl.UniversePackageImpl#getPlanet()
		 * @generated
		 */
		EClass PLANET = eINSTANCE.getPlanet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANET__NAME = eINSTANCE.getPlanet_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANET__POSITION = eINSTANCE.getPlanet_Position();

		/**
		 * The meta object literal for the '<em><b>Satellites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANET__SATELLITES = eINSTANCE.getPlanet_Satellites();

		/**
		 * The meta object literal for the '<em><b>Rotation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANET__ROTATION_DURATION = eINSTANCE.getPlanet_RotationDuration();

		/**
		 * The meta object literal for the '<em><b>Revolution Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANET__REVOLUTION_DURATION = eINSTANCE.getPlanet_RevolutionDuration();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANET__MASS = eINSTANCE.getPlanet_Mass();

		/**
		 * The meta object literal for the '{@link com.sii.universe.universe.impl.SatelliteImpl <em>Satellite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.universe.universe.impl.SatelliteImpl
		 * @see com.sii.universe.universe.impl.UniversePackageImpl#getSatellite()
		 * @generated
		 */
		EClass SATELLITE = eINSTANCE.getSatellite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE__NAME = eINSTANCE.getSatellite_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE__POSITION = eINSTANCE.getSatellite_Position();

		/**
		 * The meta object literal for the '<em><b>Rotation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE__ROTATION_DURATION = eINSTANCE.getSatellite_RotationDuration();

		/**
		 * The meta object literal for the '<em><b>Revolution Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE__REVOLUTION_DURATION = eINSTANCE.getSatellite_RevolutionDuration();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE__MASS = eINSTANCE.getSatellite_Mass();

		/**
		 * The meta object literal for the '{@link com.sii.universe.universe.impl.BlackHoleImpl <em>Black Hole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.universe.universe.impl.BlackHoleImpl
		 * @see com.sii.universe.universe.impl.UniversePackageImpl#getBlackHole()
		 * @generated
		 */
		EClass BLACK_HOLE = eINSTANCE.getBlackHole();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLACK_HOLE__POSITION = eINSTANCE.getBlackHole_Position();

		/**
		 * The meta object literal for the '{@link com.sii.universe.universe.impl.SolarSystemImpl <em>Solar System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.universe.universe.impl.SolarSystemImpl
		 * @see com.sii.universe.universe.impl.UniversePackageImpl#getSolarSystem()
		 * @generated
		 */
		EClass SOLAR_SYSTEM = eINSTANCE.getSolarSystem();

		/**
		 * The meta object literal for the '<em><b>Solar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLAR_SYSTEM__SOLAR = eINSTANCE.getSolarSystem_Solar();

		/**
		 * The meta object literal for the '<em><b>Planets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLAR_SYSTEM__PLANETS = eINSTANCE.getSolarSystem_Planets();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLAR_SYSTEM__NAME = eINSTANCE.getSolarSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLAR_SYSTEM__POSITION = eINSTANCE.getSolarSystem_Position();

	}

} //UniversePackage
