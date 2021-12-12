package YF.service;

import YF.mapper.BlogsMapper;
import YF.pojo.Blogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogsServiceImpl implements BlogsService{
    private BlogsMapper blogsMapper;
    @Autowired
    public void setBlogsMapper(BlogsMapper blogsMapper) {
        this.blogsMapper = blogsMapper;
    }

    public int addBlog(Blogs blogs) {
        return blogsMapper.addBlog(blogs);
    }
}
