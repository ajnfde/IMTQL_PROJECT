package robot.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import robot.dsl.Action;
import robot.dsl.Capture;
import robot.dsl.Device;
import robot.dsl.DslPackage;
import robot.dsl.IDevice;
import robot.dsl.Parametre;
import robot.dsl.Robot;
import robot.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DslPackage.ACTION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getFonctionnaliteRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.CAPTURE:
				if(context == grammarAccess.getCaptureRule() ||
				   context == grammarAccess.getFonctionnaliteRule()) {
					sequence_Capture(context, (Capture) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.DEVICE:
				if(context == grammarAccess.getDeviceRule()) {
					sequence_Device(context, (Device) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.IDEVICE:
				if(context == grammarAccess.getIDeviceRule()) {
					sequence_IDevice(context, (IDevice) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.OBJECT:
				if(context == grammarAccess.getEJavaObjectRule()) {
					sequence_EJavaObject(context, (robot.dsl.Object) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.PARAMETRE:
				if(context == grammarAccess.getParametreRule()) {
					sequence_Parametre(context, (Parametre) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.ROBOT:
				if(context == grammarAccess.getRobotRule()) {
					sequence_Robot(context, (Robot) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (return=EJavaObject name=ID (ListeParametres+=Parametre ListeParametres+=Parametre*)?)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (ListeParametres+=Parametre ListeParametres+=Parametre*)?)
	 */
	protected void sequence_Capture(EObject context, Capture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID refFonction+=Fonctionnalite+)
	 */
	protected void sequence_Device(EObject context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Object}
	 */
	protected void sequence_EJavaObject(EObject context, robot.dsl.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeof=ID name=ID)
	 */
	protected void sequence_IDevice(EObject context, IDevice semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.IDEVICE__TYPEOF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.IDEVICE__TYPEOF));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.IDEVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.IDEVICE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIDeviceAccess().getTypeofIDTerminalRuleCall_0_0(), semanticObject.getTypeof());
		feeder.accept(grammarAccess.getIDeviceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=EJavaObject name=ID)
	 */
	protected void sequence_Parametre(EObject context, Parametre semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.PARAMETRE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PARAMETRE__TYPE));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.PARAMETRE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PARAMETRE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParametreAccess().getTypeEJavaObjectParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParametreAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID instances+=IDevice instances+=IDevice*)
	 */
	protected void sequence_Robot(EObject context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
