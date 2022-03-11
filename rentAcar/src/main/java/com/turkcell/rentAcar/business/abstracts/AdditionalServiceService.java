package com.turkcell.rentAcar.business.abstracts;

import java.util.List;

import com.turkcell.rentAcar.business.dtos.additionalService.GetAdditionalServiceDto;
import com.turkcell.rentAcar.business.dtos.additionalService.ListAdditionalServiceDto;
import com.turkcell.rentAcar.business.requests.additionalService.CreateAdditionalServiceRequest;
import com.turkcell.rentAcar.business.requests.additionalService.DeleteAdditionalServiceRequest;
import com.turkcell.rentAcar.business.requests.additionalService.UpdateAdditionalServiceRequest;
import com.turkcell.rentAcar.core.exception.BusinessException;
import com.turkcell.rentAcar.core.results.DataResult;
import com.turkcell.rentAcar.core.results.Result;

public interface AdditionalServiceService {
	
	DataResult<List<ListAdditionalServiceDto>> getAll();
	
	DataResult<List<ListAdditionalServiceDto>> getAllByRentalId(int rentalId);

	Result add(CreateAdditionalServiceRequest createAdditionalServiceRequest) throws BusinessException;

	DataResult<GetAdditionalServiceDto> getById(int additionalServiceId) throws BusinessException;

	Result delete(DeleteAdditionalServiceRequest deleteAdditionalServiceRequest) throws BusinessException;

	Result update(UpdateAdditionalServiceRequest updateAdditionalServiceRequest) throws BusinessException;

}
