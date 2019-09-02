package org.ysp.api;

import org.ysp.entity.UserInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Path("/")
@Produces({MediaType.APPLICATION_JSON})
public interface RestApi {
    /**
     * 获取所有用户信息
      * @return
     */
    @Path("/getAllUserInfo")
    @GET
    List<UserInfo> getAllUserInfo();
}
