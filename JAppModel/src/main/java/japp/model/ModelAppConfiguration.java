package japp.model;

import japp.model.business.BusinessFactory;
import japp.model.repository.RepositoryFactory;
import japp.model.service.ServiceFactory;

public interface ModelAppConfiguration {
	
	public BusinessFactory getBusinessFactory();
	
	public RepositoryFactory getRepositoryFactory();
	
	public ServiceFactory getServiceFactory();
}
