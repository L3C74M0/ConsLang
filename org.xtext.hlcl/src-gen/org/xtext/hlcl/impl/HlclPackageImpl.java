/**
 * generated by Xtext 2.13.0
 */
package org.xtext.hlcl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.hlcl.BoolDom;
import org.xtext.hlcl.ConstraintProgram;
import org.xtext.hlcl.Dom;
import org.xtext.hlcl.HlclFactory;
import org.xtext.hlcl.HlclPackage;
import org.xtext.hlcl.RangeDom;
import org.xtext.hlcl.SetDom;
import org.xtext.hlcl.StringDom;
import org.xtext.hlcl.Variables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HlclPackageImpl extends EPackageImpl implements HlclPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeDomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setDomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolDomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringDomEClass = null;

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
   * @see org.xtext.hlcl.HlclPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HlclPackageImpl()
  {
    super(eNS_URI, HlclFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link HlclPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HlclPackage init()
  {
    if (isInited) return (HlclPackage)EPackage.Registry.INSTANCE.getEPackage(HlclPackage.eNS_URI);

    // Obtain or create and register package
    HlclPackageImpl theHlclPackage = (HlclPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HlclPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HlclPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theHlclPackage.createPackageContents();

    // Initialize created meta-data
    theHlclPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHlclPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HlclPackage.eNS_URI, theHlclPackage);
    return theHlclPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintProgram()
  {
    return constraintProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintProgram_Vars()
  {
    return (EReference)constraintProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraintProgram_Constraints()
  {
    return (EAttribute)constraintProgramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariables()
  {
    return variablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariables_Name()
  {
    return (EAttribute)variablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariables_Dom()
  {
    return (EReference)variablesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDom()
  {
    return domEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeDom()
  {
    return rangeDomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeDom_Start()
  {
    return (EAttribute)rangeDomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeDom_End()
  {
    return (EAttribute)rangeDomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetDom()
  {
    return setDomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetDom_List()
  {
    return (EAttribute)setDomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolDom()
  {
    return boolDomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolDom_Dom()
  {
    return (EAttribute)boolDomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringDom()
  {
    return stringDomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringDom_List()
  {
    return (EAttribute)stringDomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HlclFactory getHlclFactory()
  {
    return (HlclFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    constraintProgramEClass = createEClass(CONSTRAINT_PROGRAM);
    createEReference(constraintProgramEClass, CONSTRAINT_PROGRAM__VARS);
    createEAttribute(constraintProgramEClass, CONSTRAINT_PROGRAM__CONSTRAINTS);

    variablesEClass = createEClass(VARIABLES);
    createEAttribute(variablesEClass, VARIABLES__NAME);
    createEReference(variablesEClass, VARIABLES__DOM);

    domEClass = createEClass(DOM);

    rangeDomEClass = createEClass(RANGE_DOM);
    createEAttribute(rangeDomEClass, RANGE_DOM__START);
    createEAttribute(rangeDomEClass, RANGE_DOM__END);

    setDomEClass = createEClass(SET_DOM);
    createEAttribute(setDomEClass, SET_DOM__LIST);

    boolDomEClass = createEClass(BOOL_DOM);
    createEAttribute(boolDomEClass, BOOL_DOM__DOM);

    stringDomEClass = createEClass(STRING_DOM);
    createEAttribute(stringDomEClass, STRING_DOM__LIST);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    rangeDomEClass.getESuperTypes().add(this.getDom());
    setDomEClass.getESuperTypes().add(this.getDom());
    boolDomEClass.getESuperTypes().add(this.getDom());
    stringDomEClass.getESuperTypes().add(this.getDom());

    // Initialize classes and features; add operations and parameters
    initEClass(constraintProgramEClass, ConstraintProgram.class, "ConstraintProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraintProgram_Vars(), this.getVariables(), null, "vars", null, 0, -1, ConstraintProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraintProgram_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, ConstraintProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablesEClass, Variables.class, "Variables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariables_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariables_Dom(), this.getDom(), null, "dom", null, 0, 1, Variables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domEClass, Dom.class, "Dom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rangeDomEClass, RangeDom.class, "RangeDom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRangeDom_Start(), ecorePackage.getEInt(), "start", null, 0, 1, RangeDom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRangeDom_End(), ecorePackage.getEInt(), "end", null, 0, 1, RangeDom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setDomEClass, SetDom.class, "SetDom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetDom_List(), ecorePackage.getEInt(), "list", null, 0, -1, SetDom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolDomEClass, BoolDom.class, "BoolDom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolDom_Dom(), ecorePackage.getEString(), "dom", null, 0, 1, BoolDom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringDomEClass, StringDom.class, "StringDom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringDom_List(), ecorePackage.getEString(), "list", null, 0, -1, StringDom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HlclPackageImpl
