/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Body2;
import io.swagger.model.Body3;
import io.swagger.model.Body4;
import io.swagger.model.Body5;
import io.swagger.model.Client;
import io.swagger.model.OuterComposite;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Swagger Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API tests for FakeApi 
 */
public class FakeApiTest {


    private FakeApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("http://petstore.swagger.io:80/v2", FakeApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterBooleanSerializeTest() {
        Boolean body = null;
        //Boolean response = api.fakeOuterBooleanSerialize(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterCompositeSerializeTest() {
        OuterComposite body = null;
        //OuterComposite response = api.fakeOuterCompositeSerialize(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterNumberSerializeTest() {
        BigDecimal body = null;
        //BigDecimal response = api.fakeOuterNumberSerialize(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterStringSerializeTest() {
        String body = null;
        //String response = api.fakeOuterStringSerialize(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * To test \&quot;client\&quot; model
     *
     * To test \&quot;client\&quot; model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testClientModelTest() {
        Client body = null;
        //Client response = api.testClientModel(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEndpointParametersTest() {
        Body2 body = null;
        //api.testEndpointParameters(body);
        
        // TODO: test validations
        
        
    }
    /**
     * To test enum parameters
     *
     * To test enum parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEnumParametersTest() {
        List<String> enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        //api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger);
        
        // TODO: test validations
        
        
    }
    /**
     * To test enum parameters
     *
     * To test enum parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEnumRequestBodyTest() {
        Body4 body = null;
        //api.testEnumRequestBody(body);
        
        // TODO: test validations
        
        
    }
    /**
     * test inline additionalProperties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testInlineAdditionalPropertiesTest() {
        Map<String, String> body = null;
        //api.testInlineAdditionalProperties(body);
        
        // TODO: test validations
        
        
    }
    /**
     * test json serialization of form data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testJsonFormDataTest() {
        Body5 body = null;
        //api.testJsonFormData(body);
        
        // TODO: test validations
        
        
    }
}
