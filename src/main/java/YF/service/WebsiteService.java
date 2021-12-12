package YF.service;

import YF.pojo.Blogs;
import YF.pojo.Website;

import java.util.List;
import java.util.Map;
public interface WebsiteService {
    /*查询网站信息*/
    Website queryWebsite();

    List<Blogs>queryBlogs(Map<String,Integer> map);

    int queryBlogsCount();
}
