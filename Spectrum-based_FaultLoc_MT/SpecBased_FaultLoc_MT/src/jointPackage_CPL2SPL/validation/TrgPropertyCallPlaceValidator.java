/**
 *
 * $Id$
 */
package jointPackage_CPL2SPL.validation;

import jointPackage_CPL2SPL.TrgVariablePlace;

/**
 * A sample validator interface for {@link jointPackage_CPL2SPL.TrgPropertyCallPlace}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TrgPropertyCallPlaceValidator {
	boolean validate();

	boolean validatePropName(String value);
	boolean validateSource(TrgVariablePlace value);
}
