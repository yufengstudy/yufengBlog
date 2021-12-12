package YF.mapper;

import YF.pojo.Blogs;
import YF.pojo.Website;
import java.util.List;
import java.util.Map;

public interface WebsiteMapper {

    /*查询网站信息*/
    Website queryWebsite();

    /*查询文章信息*/
    List<Blogs> queryBlogs(Map<String,Integer> map);

    /*查询文章总数*/
    int queryBlogsCount();
}
