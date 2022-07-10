/**
 * generated by Xtext 2.27.0.M3
 */
package eu.fbk.se.mathexpeditor.mExp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.fbk.se.mathexpeditor.mExp.MathExpression#getConst <em>Const</em>}</li>
 *   <li>{@link eu.fbk.se.mathexpeditor.mExp.MathExpression#getVar <em>Var</em>}</li>
 *   <li>{@link eu.fbk.se.mathexpeditor.mExp.MathExpression#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link eu.fbk.se.mathexpeditor.mExp.MathExpression#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @see eu.fbk.se.mathexpeditor.mExp.MExpPackage#getMathExpression()
 * @model
 * @generated
 */
public interface MathExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(int)
   * @see eu.fbk.se.mathexpeditor.mExp.MExpPackage#getMathExpression_Const()
   * @model
   * @generated
   */
  int getConst();

  /**
   * Sets the value of the '{@link eu.fbk.se.mathexpeditor.mExp.MathExpression#getConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #getConst()
   * @generated
   */
  void setConst(int value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see eu.fbk.se.mathexpeditor.mExp.MExpPackage#getMathExpression_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link eu.fbk.se.mathexpeditor.mExp.MathExpression#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

  /**
   * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp1</em>' containment reference.
   * @see #setExp1(MathExpression)
   * @see eu.fbk.se.mathexpeditor.mExp.MExpPackage#getMathExpression_Exp1()
   * @model containment="true"
   * @generated
   */
  MathExpression getExp1();

  /**
   * Sets the value of the '{@link eu.fbk.se.mathexpeditor.mExp.MathExpression#getExp1 <em>Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp1</em>' containment reference.
   * @see #getExp1()
   * @generated
   */
  void setExp1(MathExpression value);

  /**
   * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp2</em>' containment reference.
   * @see #setExp2(MathExpression)
   * @see eu.fbk.se.mathexpeditor.mExp.MExpPackage#getMathExpression_Exp2()
   * @model containment="true"
   * @generated
   */
  MathExpression getExp2();

  /**
   * Sets the value of the '{@link eu.fbk.se.mathexpeditor.mExp.MathExpression#getExp2 <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp2</em>' containment reference.
   * @see #getExp2()
   * @generated
   */
  void setExp2(MathExpression value);

} // MathExpression
