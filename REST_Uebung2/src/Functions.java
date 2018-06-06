import javax.ws.rs.*;


@Path("test1")
public class Functions {
	
	@Path("user")
	@GET
	@Produces("text/plain")
	public String showAllUser()
	{
		return "User1\nUser2\nUser3\nUser4\nUser5\n";
	}
	
	
	@Path("user/create/{name}")
	@GET
	@Produces("text/plain")
	public String createUser(@PathParam("name") String name)
	{
		return "User " + name + " created";
	}
	
	
	@Path("user/post")
	@GET
	@Produces("text/plain")
	public String showPosts()
	{
		String posts = "BeispielPost1\n"
				+ "BeispielPost2\n"
				+ "BeispielPost3\n"
				+ "BeispielPost4\n";

		return posts;
		
	}
	
}