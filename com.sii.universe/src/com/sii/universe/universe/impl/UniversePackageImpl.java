/**
 */
package com.sii.universe.universe.impl;

import com.sii.universe.universe.BlackHole;
import com.sii.universe.universe.Galaxy;
import com.sii.universe.universe.Planet;
import com.sii.universe.universe.Satellite;
import com.sii.universe.universe.SolarSystem;
import com.sii.universe.universe.Star;
import com.sii.universe.universe.Universe;
import com.sii.universe.universe.UniverseFactory;
import com.sii.universe.universe.UniversePackage;

import com.sii.universe.universe.util.UniverseValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversePackageImpl extends EPackageImpl implements UniversePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass galaxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass starEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackHoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solarSystemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.sii.universe.universe.UniversePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UniversePackageImpl() {
		super(eNS_URI, UniverseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UniversePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UniversePackage init() {
		if (isInited) return (UniversePackage)EPackage.Registry.INSTANCE.getEPackage(UniversePackage.eNS_URI);

		// Obtain or create and register package
		UniversePackageImpl theUniversePackage = (UniversePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UniversePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UniversePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUniversePackage.createPackageContents();

		// Initialize created meta-data
		theUniversePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUniversePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return UniverseValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUniversePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UniversePackage.eNS_URI, theUniversePackage);
		return theUniversePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniverse() {
		return universeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniverse_Name() {
		return (EAttribute)universeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniverse_Galaxies() {
		return (EReference)universeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGalaxy() {
		return galaxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalaxy_Name() {
		return (EAttribute)galaxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalaxy_Position() {
		return (EAttribute)galaxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalaxy_VelocityFromUniverseCenter() {
		return (EAttribute)galaxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGalaxy_BlackHoles() {
		return (EReference)galaxyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGalaxy_Solarsystem() {
		return (EReference)galaxyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStar() {
		return starEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStar_Name() {
		return (EAttribute)starEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStar_Position() {
		return (EAttribute)starEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStar_RotationDuration() {
		return (EAttribute)starEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStar_Mass() {
		return (EAttribute)starEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanet() {
		return planetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanet_Name() {
		return (EAttribute)planetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanet_Position() {
		return (EAttribute)planetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanet_Satellites() {
		return (EReference)planetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanet_RotationDuration() {
		return (EAttribute)planetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanet_RevolutionDuration() {
		return (EAttribute)planetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanet_Mass() {
		return (EAttribute)planetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatellite() {
		return satelliteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatellite_Name() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatellite_Position() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatellite_RotationDuration() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatellite_RevolutionDuration() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatellite_Mass() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackHole() {
		return blackHoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlackHole_Position() {
		return (EAttribute)blackHoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolarSystem() {
		return solarSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolarSystem_Solar() {
		return (EReference)solarSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolarSystem_Planets() {
		return (EReference)solarSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolarSystem_Name() {
		return (EAttribute)solarSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolarSystem_Position() {
		return (EAttribute)solarSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniverseFactory getUniverseFactory() {
		return (UniverseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		universeEClass = createEClass(UNIVERSE);
		createEAttribute(universeEClass, UNIVERSE__NAME);
		createEReference(universeEClass, UNIVERSE__GALAXIES);

		galaxyEClass = createEClass(GALAXY);
		createEAttribute(galaxyEClass, GALAXY__NAME);
		createEAttribute(galaxyEClass, GALAXY__POSITION);
		createEAttribute(galaxyEClass, GALAXY__VELOCITY_FROM_UNIVERSE_CENTER);
		createEReference(galaxyEClass, GALAXY__BLACK_HOLES);
		createEReference(galaxyEClass, GALAXY__SOLARSYSTEM);

		starEClass = createEClass(STAR);
		createEAttribute(starEClass, STAR__NAME);
		createEAttribute(starEClass, STAR__POSITION);
		createEAttribute(starEClass, STAR__ROTATION_DURATION);
		createEAttribute(starEClass, STAR__MASS);

		planetEClass = createEClass(PLANET);
		createEAttribute(planetEClass, PLANET__NAME);
		createEAttribute(planetEClass, PLANET__POSITION);
		createEReference(planetEClass, PLANET__SATELLITES);
		createEAttribute(planetEClass, PLANET__ROTATION_DURATION);
		createEAttribute(planetEClass, PLANET__REVOLUTION_DURATION);
		createEAttribute(planetEClass, PLANET__MASS);

		satelliteEClass = createEClass(SATELLITE);
		createEAttribute(satelliteEClass, SATELLITE__NAME);
		createEAttribute(satelliteEClass, SATELLITE__POSITION);
		createEAttribute(satelliteEClass, SATELLITE__ROTATION_DURATION);
		createEAttribute(satelliteEClass, SATELLITE__REVOLUTION_DURATION);
		createEAttribute(satelliteEClass, SATELLITE__MASS);

		blackHoleEClass = createEClass(BLACK_HOLE);
		createEAttribute(blackHoleEClass, BLACK_HOLE__POSITION);

		solarSystemEClass = createEClass(SOLAR_SYSTEM);
		createEReference(solarSystemEClass, SOLAR_SYSTEM__SOLAR);
		createEReference(solarSystemEClass, SOLAR_SYSTEM__PLANETS);
		createEAttribute(solarSystemEClass, SOLAR_SYSTEM__NAME);
		createEAttribute(solarSystemEClass, SOLAR_SYSTEM__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(universeEClass, Universe.class, "Universe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniverse_Name(), ecorePackage.getEString(), "name", null, 1, 1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniverse_Galaxies(), this.getGalaxy(), null, "galaxies", null, 0, -1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(galaxyEClass, Galaxy.class, "Galaxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGalaxy_Name(), ecorePackage.getEString(), "name", null, 1, 1, Galaxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalaxy_Position(), ecorePackage.getEInt(), "position", null, 3, 3, Galaxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalaxy_VelocityFromUniverseCenter(), ecorePackage.getEInt(), "VelocityFromUniverseCenter", null, 1, 1, Galaxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGalaxy_BlackHoles(), this.getBlackHole(), null, "blackHoles", null, 0, -1, Galaxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGalaxy_Solarsystem(), this.getSolarSystem(), null, "solarsystem", null, 0, -1, Galaxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(starEClass, Star.class, "Star", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStar_Name(), ecorePackage.getEString(), "name", null, 1, 1, Star.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStar_Position(), ecorePackage.getEInt(), "position", null, 3, 3, Star.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStar_RotationDuration(), theXMLTypePackage.getTime(), "rotationDuration", null, 0, 1, Star.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStar_Mass(), ecorePackage.getEInt(), "mass", null, 0, 1, Star.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planetEClass, Planet.class, "Planet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanet_Name(), ecorePackage.getEString(), "name", null, 1, 1, Planet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanet_Position(), ecorePackage.getEInt(), "position", null, 3, 3, Planet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanet_Satellites(), this.getSatellite(), null, "satellites", null, 0, -1, Planet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanet_RotationDuration(), theXMLTypePackage.getTime(), "rotationDuration", null, 0, 1, Planet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanet_RevolutionDuration(), theXMLTypePackage.getTime(), "revolutionDuration", null, 0, 1, Planet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanet_Mass(), ecorePackage.getEInt(), "mass", null, 0, 1, Planet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteEClass, Satellite.class, "Satellite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSatellite_Name(), ecorePackage.getEString(), "name", null, 1, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatellite_Position(), ecorePackage.getEInt(), "position", null, 3, 3, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatellite_RotationDuration(), theXMLTypePackage.getTime(), "rotationDuration", null, 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatellite_RevolutionDuration(), theXMLTypePackage.getTime(), "revolutionDuration", null, 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatellite_Mass(), ecorePackage.getEInt(), "mass", null, 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blackHoleEClass, BlackHole.class, "BlackHole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlackHole_Position(), ecorePackage.getEInt(), "position", null, 3, 3, BlackHole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solarSystemEClass, SolarSystem.class, "SolarSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolarSystem_Solar(), this.getStar(), null, "solar", null, 1, 1, SolarSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolarSystem_Planets(), this.getPlanet(), null, "planets", null, 0, -1, SolarSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolarSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, SolarSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolarSystem_Position(), ecorePackage.getEInt(), "position", null, 3, 3, SolarSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (starEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkName"
		   });
	}

} //UniversePackageImpl
