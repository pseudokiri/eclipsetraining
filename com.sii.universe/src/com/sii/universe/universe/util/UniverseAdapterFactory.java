/**
 */
package com.sii.universe.universe.util;

import com.sii.universe.universe.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sii.universe.universe.UniversePackage
 * @generated
 */
public class UniverseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UniversePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniverseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UniversePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniverseSwitch<Adapter> modelSwitch =
		new UniverseSwitch<Adapter>() {
			@Override
			public Adapter caseUniverse(Universe object) {
				return createUniverseAdapter();
			}
			@Override
			public Adapter caseGalaxy(Galaxy object) {
				return createGalaxyAdapter();
			}
			@Override
			public Adapter caseStar(Star object) {
				return createStarAdapter();
			}
			@Override
			public Adapter casePlanet(Planet object) {
				return createPlanetAdapter();
			}
			@Override
			public Adapter caseSatellite(Satellite object) {
				return createSatelliteAdapter();
			}
			@Override
			public Adapter caseBlackHole(BlackHole object) {
				return createBlackHoleAdapter();
			}
			@Override
			public Adapter caseSolarSystem(SolarSystem object) {
				return createSolarSystemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.sii.universe.universe.Universe <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.universe.universe.Universe
	 * @generated
	 */
	public Adapter createUniverseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.universe.universe.Galaxy <em>Galaxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.universe.universe.Galaxy
	 * @generated
	 */
	public Adapter createGalaxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.universe.universe.Star <em>Star</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.universe.universe.Star
	 * @generated
	 */
	public Adapter createStarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.universe.universe.Planet <em>Planet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.universe.universe.Planet
	 * @generated
	 */
	public Adapter createPlanetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.universe.universe.Satellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.universe.universe.Satellite
	 * @generated
	 */
	public Adapter createSatelliteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.universe.universe.BlackHole <em>Black Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.universe.universe.BlackHole
	 * @generated
	 */
	public Adapter createBlackHoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.universe.universe.SolarSystem <em>Solar System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.universe.universe.SolarSystem
	 * @generated
	 */
	public Adapter createSolarSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UniverseAdapterFactory
