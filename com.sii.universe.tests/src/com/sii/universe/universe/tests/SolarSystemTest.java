/**
 */
package com.sii.universe.universe.tests;

import com.sii.universe.universe.SolarSystem;
import com.sii.universe.universe.UniverseFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solar System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolarSystemTest extends TestCase {

	/**
	 * The fixture for this Solar System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolarSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolarSystemTest.class);
	}

	/**
	 * Constructs a new Solar System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolarSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Solar System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SolarSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Solar System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolarSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UniverseFactory.eINSTANCE.createSolarSystem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SolarSystemTest
