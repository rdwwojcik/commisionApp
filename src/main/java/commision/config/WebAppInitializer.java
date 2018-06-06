package commision.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!getRootConfigClasses");
        return new Class[]{DatabaseConfig.class, WebSecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!getServletConfigClasses()");
        return new Class[]{MvcWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!getServletMappings()");
        return new String[]{"/"};
    }

//    @Override
//    protected Filter[] getServletFilters() {
//        // if encoding has issues we need to add UTF-8 encoding filter
//        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
//        encodingFilter.setForceEncoding(true);
//        encodingFilter.setEncoding("UTF-8");
//        // encoding filter must be the first one
//        return new Filter[]{encodingFilter, new DelegatingFilterProxy("springSecurityFilterChain"), new OpenEntityManagerInViewFilter()};
//    }
}
