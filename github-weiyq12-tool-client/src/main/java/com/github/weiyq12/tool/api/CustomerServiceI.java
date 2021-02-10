package com.github.weiyq12.tool.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.github.weiyq12.tool.dto.CustomerAddCmd;
import com.github.weiyq12.tool.dto.CustomerListByNameQry;
import com.github.weiyq12.tool.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
