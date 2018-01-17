/*
 * generated by Xtext 2.13.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.hlcl.BoolDom;
import org.xtext.hlcl.ConstraintProgram;
import org.xtext.hlcl.HlclPackage;
import org.xtext.hlcl.RangeDom;
import org.xtext.hlcl.SetDom;
import org.xtext.hlcl.StringDom;
import org.xtext.hlcl.Variables;
import org.xtext.services.HlclGrammarAccess;

@SuppressWarnings("all")
public class HlclSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HlclGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == HlclPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case HlclPackage.BOOL_DOM:
				sequence_BoolDom(context, (BoolDom) semanticObject); 
				return; 
			case HlclPackage.CONSTRAINT_PROGRAM:
				sequence_ConstraintProgram(context, (ConstraintProgram) semanticObject); 
				return; 
			case HlclPackage.RANGE_DOM:
				sequence_RangeDom(context, (RangeDom) semanticObject); 
				return; 
			case HlclPackage.SET_DOM:
				sequence_SetDom(context, (SetDom) semanticObject); 
				return; 
			case HlclPackage.STRING_DOM:
				sequence_StringDom(context, (StringDom) semanticObject); 
				return; 
			case HlclPackage.VARIABLES:
				sequence_Variables(context, (Variables) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Dom returns BoolDom
	 *     BoolDom returns BoolDom
	 *
	 * Constraint:
	 *     dom='boolDomain'
	 */
	protected void sequence_BoolDom(ISerializationContext context, BoolDom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HlclPackage.Literals.BOOL_DOM__DOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HlclPackage.Literals.BOOL_DOM__DOM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoolDomAccess().getDomBoolDomainKeyword_0(), semanticObject.getDom());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintProgram returns ConstraintProgram
	 *
	 * Constraint:
	 *     (vars+=Variables+ constraints+=ConsExp*)
	 */
	protected void sequence_ConstraintProgram(ISerializationContext context, ConstraintProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dom returns RangeDom
	 *     RangeDom returns RangeDom
	 *
	 * Constraint:
	 *     (start=INT end=INT)
	 */
	protected void sequence_RangeDom(ISerializationContext context, RangeDom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HlclPackage.Literals.RANGE_DOM__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HlclPackage.Literals.RANGE_DOM__START));
			if (transientValues.isValueTransient(semanticObject, HlclPackage.Literals.RANGE_DOM__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HlclPackage.Literals.RANGE_DOM__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRangeDomAccess().getStartINTTerminalRuleCall_1_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getRangeDomAccess().getEndINTTerminalRuleCall_3_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Dom returns SetDom
	 *     SetDom returns SetDom
	 *
	 * Constraint:
	 *     list+=INT+
	 */
	protected void sequence_SetDom(ISerializationContext context, SetDom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dom returns StringDom
	 *     StringDom returns StringDom
	 *
	 * Constraint:
	 *     list+=STRING+
	 */
	protected void sequence_StringDom(ISerializationContext context, StringDom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variables returns Variables
	 *
	 * Constraint:
	 *     (name=ID dom=Dom)
	 */
	protected void sequence_Variables(ISerializationContext context, Variables semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HlclPackage.Literals.VARIABLES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HlclPackage.Literals.VARIABLES__NAME));
			if (transientValues.isValueTransient(semanticObject, HlclPackage.Literals.VARIABLES__DOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HlclPackage.Literals.VARIABLES__DOM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariablesAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariablesAccess().getDomDomParserRuleCall_3_0(), semanticObject.getDom());
		feeder.finish();
	}
	
	
}
