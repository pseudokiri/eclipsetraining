/**
 */
package com.sii.universe.universe.tests;

import com.sii.universe.universe.Galaxy;
import com.sii.universe.universe.UniverseFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Galaxy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GalaxyTest extends TestCase {

	/**
	 * The fixture for this Galaxy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Galaxy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GalaxyTest.class);
	}

	/**
	 * Constructs a new Galaxy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GalaxyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Galaxy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Galaxy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Galaxy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Galaxy getFixture() {
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
		setFixture(UniverseFactory.eINSTANCE.createGalaxy());
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

} //GalaxyTest
