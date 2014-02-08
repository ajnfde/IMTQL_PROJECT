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
import robot.device.Action;
import robot.device.Capture;
import robot.device.Device;
import robot.device.DevicePackage;
import robot.device.Parametre;
import robot.device.Types;
import robot.services.DeviceGrammarAccess;

@SuppressWarnings("all")
public class DeviceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DeviceGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DevicePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DevicePackage.ACTION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getFonctionnaliteRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case DevicePackage.CAPTURE:
				if(context == grammarAccess.getCaptureRule() ||
				   context == grammarAccess.getFonctionnaliteRule()) {
					sequence_Capture(context, (Capture) semanticObject); 
					return; 
				}
				else break;
			case DevicePackage.DEVICE:
				if(context == grammarAccess.getDeviceRule()) {
					sequence_Device(context, (Device) semanticObject); 
					return; 
				}
				else break;
			case DevicePackage.OBJECT:
				if(context == grammarAccess.getEJavaObjectRule()) {
					sequence_EJavaObject(context, (robot.device.Object) semanticObject); 
					return; 
				}
				else break;
			case DevicePackage.PARAMETRE:
				if(context == grammarAccess.getParametreRule()) {
					sequence_Parametre(context, (Parametre) semanticObject); 
					return; 
				}
				else break;
			case DevicePackage.TYPES:
				if(context == grammarAccess.getTypesRule()) {
					sequence_Types(context, (Types) semanticObject); 
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
	protected void sequence_EJavaObject(EObject context, robot.device.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=EJavaObject name=ID)
	 */
	protected void sequence_Parametre(EObject context, Parametre semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DevicePackage.Literals.PARAMETRE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DevicePackage.Literals.PARAMETRE__TYPE));
			if(transientValues.isValueTransient(semanticObject, DevicePackage.Literals.PARAMETRE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DevicePackage.Literals.PARAMETRE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParametreAccess().getTypeEJavaObjectParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParametreAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (Types+=Device Types+=Device*)
	 */
	protected void sequence_Types(EObject context, Types semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
