package com.salesmanager.shop.populator.customer;


import com.salesmanager.core.business.exception.ConversionException;
import com.salesmanager.core.business.utils.AbstractDataPopulator;
import com.salesmanager.core.model.customer.attribute.CustomerOption;
import com.salesmanager.core.model.customer.attribute.CustomerOptionDescription;
import com.salesmanager.core.model.customer.attribute.CustomerOptionSet;
import com.salesmanager.core.model.customer.attribute.CustomerOptionValue;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;





import java.util.ArrayList;
import java.util.List;



/**
 * Used in the admin section
 * @author c.samson
 *
 */

public class CustomerOptionPopulator extends
		AbstractDataPopulator<com.salesmanager.core.model.customer.attribute.CustomerOption, com.salesmanager.core.model.customer.attribute.CustomerOption> {

	
	private CustomerOptionSet optionSet;
	
	public CustomerOptionSet getOptionSet() {
		return optionSet;
	}

	public void setOptionSet(CustomerOptionSet optionSet) {
		this.optionSet = optionSet;
	}

	@Override
	public CustomerOption populate(
			com.salesmanager.core.model.customer.attribute.CustomerOption source,
			CustomerOption target, MerchantStore store, Language language) throws ConversionException {
		
		
		CustomerOption customerOption = target;
		if(customerOption==null) {
			customerOption = new CustomerOption();
		} 
		
		customerOption.setId(source.getId());
		

		List<CustomerOptionDescription> values = customerOption.getDescriptionsSettoList();
		
		com.salesmanager.core.model.customer.attribute.CustomerOptionValue optionValue = optionSet.getCustomerOptionValue();
		CustomerOptionValue custOptValue = new CustomerOptionValue();
		custOptValue.setId(optionValue.getId());
		
		
		return customerOption;

	}

    @Override
    protected CustomerOption createTarget()
    {
        // TODO Auto-generated method stub
        return null;
    }

	
}
