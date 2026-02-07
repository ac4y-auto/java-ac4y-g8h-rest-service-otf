package ac4y.guid8humanid.service.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

import ac4y.guid8humanid.service.object.Ac4yGUID8HumanIdObjectService;
import ac4y.guid8humanid.service.object.get.*;
import ac4y.guid8humanid.service.object.set.SetByHumanIdsRequest;

@Path("")
public class Ac4yGUID8HumanIDRestfulService {
	
	public Ac4yGUID8HumanIDRestfulService() {
	}
		
	@GET
	@Path("/setByHumanIDs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response setByHumanIDs(@QueryParam("request") String request) throws JAXBException {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					new Ac4yGUID8HumanIdObjectService().setByHumanIds(
					   		(SetByHumanIdsRequest) new SetByHumanIdsRequest().getFromJson(request)
					).getAsJson()
					   
			   )
			   .build();
		
	} // setByHumanIDs

	@GET
	@Path("/getGUIDByHumanIDs")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getGUIDByHumanIDs(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getGUIDByHumanIds(
							   (GetGUIDByHumanIdsRequest) new GetGUIDByHumanIdsRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getGUIDByHumanIDs

	@GET
	@Path("/getTemplateGUID")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTemplateGUID(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getTemplateGUID(
							   (GetTemplateGUIDRequest) new GetTemplateGUIDRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getTemplateGUID

	@GET
	@Path("/isExistByGUID")
	@Produces(MediaType.APPLICATION_JSON)
	public Response isExistByGUID(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().isExistByGUID(
							   (IsExistByGUIDRequest) new IsExistByGUIDRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // isExistByGUID

	@GET
	@Path("/isExistByHumanIDs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response isExistByHumanIDs(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().isExistByHumanIds(
							   (IsExistByHumanIdsRequest) new IsExistByHumanIdsRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // isExistByGUID

	@GET
	@Path("/getByGUID")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByGUID(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getByGUID(
							   (GetByGUIDRequest) new GetByGUIDRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getByGUID

	@GET
	@Path("/getByHumanIDs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByHumanIDs(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getByHumanIds(
							   (GetByHumanIdsRequest) new GetByHumanIdsRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getByHumanIDs

	@GET
	@Path("/getList")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getList(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getList(
							   (GetListRequest) new GetListRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getList

	@GET
	@Path("/getInstanceList")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInstanceList(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getList(
							   (GetListRequest) new GetListRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getList

	@GET
	@Path("/getGUIDList")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGUIDList(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getGUIDList(
							   (GetGUIDListRequest) new GetGUIDListRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getList

} // Ac4yGUID8HumanIDRestfulService