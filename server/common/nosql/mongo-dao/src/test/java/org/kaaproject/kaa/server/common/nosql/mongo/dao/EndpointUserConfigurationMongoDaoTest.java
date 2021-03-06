/*
 * Copyright 2014-2015 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.server.common.nosql.mongo.dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kaaproject.kaa.common.dto.ApplicationDto;
import org.kaaproject.kaa.common.dto.ConfigurationSchemaDto;
import org.kaaproject.kaa.common.dto.EndpointUserConfigurationDto;
import org.kaaproject.kaa.common.dto.EndpointUserDto;
import org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoEndpointUserConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/mongo-dao-test-context.xml")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class EndpointUserConfigurationMongoDaoTest extends AbstractMongoTest {

    private static final Logger LOG = LoggerFactory.getLogger(EndpointUserConfigurationMongoDaoTest.class);

    @BeforeClass
    public static void init() throws Exception {
        MongoDBTestRunner.setUp();
    }

    @AfterClass
    public static void after() throws Exception {
        MongoDBTestRunner.tearDown();
    }

    @Before
    public void beforeTest() throws IOException {
        LOG.info("EndpointProfileMongoDaoTest init before tests.");
        MongoDataLoader.loadData();
    }

    @After
    public void afterTest() throws IOException {
        MongoDataLoader.clearDBData();
    }

    @Test
    public void saveEndpointUserConfigurationDtoTest() throws IOException {
        EndpointUserConfigurationDto userConfigurationDto = generateEndpointUserConfiguration(null, null, null, readSchemaFileAsString("dao/user/overrideData.json"));
        Assert.assertNotNull(userConfigurationDto);
        Assert.assertEquals(userConfigurationDto, new MongoEndpointUserConfiguration(userConfigurationDto).toDto());
    }

    @Test
    public void findByUserIdAndAppTokenAndSchemaVersionTest() throws IOException {
        EndpointUserDto userDto = generateEndpointUser(null);
        ApplicationDto appDto = generateApplication();
        ConfigurationSchemaDto schema = generateConfSchema(appDto.getId(),1).get(0);
        EndpointUserConfigurationDto firstUserConfigurationDto = generateEndpointUserConfiguration(userDto, appDto, schema, readSchemaFileAsString("dao/user/overrideData.json"));
        generateEndpointUserConfiguration(userDto, appDto, null, readSchemaFileAsString("dao/user/overrideData.json"));
        generateEndpointUserConfiguration(null, null, null, readSchemaFileAsString("dao/user/overrideData.json"));
        MongoEndpointUserConfiguration found = endpointUserConfigurationDao.findByUserIdAndAppTokenAndSchemaVersion(userDto.getId(), appDto.getApplicationToken(), schema.getMajorVersion());
        Assert.assertEquals(firstUserConfigurationDto, found.toDto());
    }

    @Test
    public void removeByUserIdAndAppTokenAndSchemaVersionTest() throws IOException {
        EndpointUserDto userDto = generateEndpointUser(null);
        ApplicationDto appDto = generateApplication();
        ConfigurationSchemaDto configurationSchemaDto = generateConfSchema(appDto.getId(),1).get(0);
        generateEndpointUserConfiguration(userDto, appDto, configurationSchemaDto, readSchemaFileAsString("dao/user/overrideData.json"));
        generateEndpointUserConfiguration(userDto, appDto, null, readSchemaFileAsString("dao/user/overrideData.json"));
        generateEndpointUserConfiguration(userDto, appDto, null, readSchemaFileAsString("dao/user/overrideData.json"));
        endpointUserConfigurationDao.removeByUserIdAndAppTokenAndSchemaVersion(userDto.getId(), appDto.getApplicationToken(), configurationSchemaDto.getMajorVersion());
        MongoEndpointUserConfiguration removed = endpointUserConfigurationDao.findByUserIdAndAppTokenAndSchemaVersion(userDto.getId(), appDto.getApplicationToken(), configurationSchemaDto.getMajorVersion());
        Assert.assertNull(removed);
        List<MongoEndpointUserConfiguration> foundList = endpointUserConfigurationDao.findByUserId(userDto.getId());
        Assert.assertEquals(2, foundList.size());
    }

    @Test
    @Ignore("invalid")
    public void findByUserIdTest() throws IOException {
        EndpointUserDto userDto = generateEndpointUser(null);
        ApplicationDto appDto = generateApplication();
        EndpointUserConfigurationDto firstUserConfigurationDto = generateEndpointUserConfiguration(userDto, appDto, null, readSchemaFileAsString("dao/user/overrideData.json"));
        EndpointUserConfigurationDto secondUserConfigurationDto = generateEndpointUserConfiguration(userDto, appDto, null, readSchemaFileAsString("dao/user/overrideData.json"));
        List<MongoEndpointUserConfiguration> expectedList = new ArrayList<>();
        expectedList.add(new MongoEndpointUserConfiguration(firstUserConfigurationDto));
        expectedList.add(new MongoEndpointUserConfiguration(secondUserConfigurationDto));
        generateEndpointUserConfiguration(null, null, null);
        List<MongoEndpointUserConfiguration> foundList = endpointUserConfigurationDao.findByUserId(userDto.getId());
        Assert.assertEquals(expectedList.size(), foundList.size());
        Assert.assertEquals(expectedList, foundList);
    }
}
