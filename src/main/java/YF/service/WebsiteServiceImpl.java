package YF.service;

import YF.mapper.WebsiteMapper;
import YF.pojo.Blogs;
import YF.pojo.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WebsiteServiceImpl implements WebsiteService{

    private WebsiteMapper websiteMapper;
    @Autowired
    public void setWebsiteMapper(WebsiteMapper websiteMapper) {
        this.websiteMapper = websiteMapper;
    }
    /*返回网站信息*/
    public Website queryWebsite() {
        return websiteMapper.queryWebsite();
    }

    /*查询网站信息*/
    public List<Blogs> queryBlogs(Map<String, Integer> map) {
        return websiteMapper.queryBlogs(map);
    }

    public int queryBlogsCount() {
        return websiteMapper.queryBlogsCount();
    }
}
