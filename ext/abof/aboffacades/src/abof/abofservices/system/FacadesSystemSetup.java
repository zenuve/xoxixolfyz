/**
 *
 */
package abof.abofservices.system;

import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;

import org.apache.log4j.Logger;

import com.hybris.abof.facades.constants.AbofFacadesConstants;


/**
 * @author 589733
 *
 */
@SystemSetup(extension = AbofFacadesConstants.EXTENSIONNAME)
public class FacadesSystemSetup
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(FacadesSystemSetup.class);

	@SystemSetup(extension = AbofFacadesConstants.EXTENSIONNAME, process = Process.UPDATE, type = Type.PROJECT)
	public void createNecessaryProjectData()
	{
		LOG.info(".........Executing FacadesSystemSetup while updating project data......");
	}

	@SystemSetup(extension = AbofFacadesConstants.EXTENSIONNAME, process = Process.UPDATE, type = Type.ESSENTIAL)
	public void createNecessaryEssentialData(final SystemSetupContext context)
	{
		LOG.info(".........Executing FacadesSystemSetup while updating project data......");
		if (1 == 1)
		{
			LOG.info(".........Executing FacadesSystemSetup while updating project data......");
		}
	}
}
