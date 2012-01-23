package org.example.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.assertEquals;

/**
 * @author zuther
 */
@ContextConfiguration(locations = "spring-context.xml")
@ActiveProfiles("development")
public class MyProfileServiceDevelopmentTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private MyProfileService profileService;

    @Test
    public void testGetProfileName(){
        assertEquals("development", profileService.getProfileName());
    }
}
