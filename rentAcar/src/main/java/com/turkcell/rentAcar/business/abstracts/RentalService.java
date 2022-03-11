package com.turkcell.rentAcar.business.abstracts;

import java.util.List;

import com.turkcell.rentAcar.business.dtos.rental.GetRentalDto;
import com.turkcell.rentAcar.business.dtos.rental.ListRentalDto;
import com.turkcell.rentAcar.business.requests.rental.CreateRentalRequest;
import com.turkcell.rentAcar.business.requests.rental.DeleteRentalRequest;
import com.turkcell.rentAcar.business.requests.rental.UpdateRentalRequest;
import com.turkcell.rentAcar.core.exception.BusinessException;
import com.turkcell.rentAcar.core.results.DataResult;
import com.turkcell.rentAcar.core.results.Result;

public interface RentalService {
	
	DataResult<List<ListRentalDto>> getAll();
	
	DataResult<List<ListRentalDto>> getAllByCarId(int carId);

	Result add(CreateRentalRequest createRentalRequest) throws BusinessException;

	DataResult<GetRentalDto> getById(int rentalId) throws BusinessException;

	Result delete(DeleteRentalRequest deleteRentalRequest) throws BusinessException;

	Result update(UpdateRentalRequest updateRentalRequest) throws BusinessException;

}
