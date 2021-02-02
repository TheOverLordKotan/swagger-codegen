/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Body2;
import io.swagger.model.Body3;
import io.swagger.model.Body4;
import io.swagger.model.Body5;
import io.swagger.model.Client;
import io.swagger.model.OuterComposite;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
public interface FakeApi {

    FakeApiDelegate getDelegate();

    @Operation(summary = "", description = "Test serialization of outer boolean types", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Output boolean", content = @Content(schema = @Schema(implementation = Boolean.class))) })
    @RequestMapping(value = "/fake/outer/boolean",
        produces = { "*/*" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Boolean> fakeOuterBooleanSerialize(@Parameter(in = ParameterIn.DEFAULT, description = "Input boolean as post body", schema=@Schema()) @Valid @RequestBody Boolean body) {
        return getDelegate().fakeOuterBooleanSerialize(body);
    }


    @Operation(summary = "", description = "Test serialization of object with outer number type", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Output composite", content = @Content(schema = @Schema(implementation = OuterComposite.class))) })
    @RequestMapping(value = "/fake/outer/composite",
        produces = { "*/*" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<OuterComposite> fakeOuterCompositeSerialize(@Parameter(in = ParameterIn.DEFAULT, description = "Input composite as post body", schema=@Schema()) @Valid @RequestBody OuterComposite body) {
        return getDelegate().fakeOuterCompositeSerialize(body);
    }


    @Operation(summary = "", description = "Test serialization of outer number types", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Output number", content = @Content(schema = @Schema(implementation = BigDecimal.class))) })
    @RequestMapping(value = "/fake/outer/number",
        produces = { "*/*" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<BigDecimal> fakeOuterNumberSerialize(@Parameter(in = ParameterIn.DEFAULT, description = "Input number as post body", schema=@Schema()) @Valid @RequestBody BigDecimal body) {
        return getDelegate().fakeOuterNumberSerialize(body);
    }


    @Operation(summary = "", description = "Test serialization of outer string types", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Output string", content = @Content(schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/fake/outer/string",
        produces = { "*/*" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<String> fakeOuterStringSerialize(@Parameter(in = ParameterIn.DEFAULT, description = "Input string as post body", schema=@Schema()) @Valid @RequestBody String body) {
        return getDelegate().fakeOuterStringSerialize(body);
    }


    @Operation(summary = "To test \"client\" model", description = "To test \"client\" model", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Client.class))) })
    @RequestMapping(value = "/fake",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    default ResponseEntity<Client> testClientModel(@Parameter(in = ParameterIn.DEFAULT, description = "client model", required=true, schema=@Schema()) @Valid @RequestBody Client body) {
        return getDelegate().testClientModel(body);
    }


    @Operation(summary = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", description = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", security = {
        @SecurityRequirement(name = "http_basic_test")    }, tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/fake",
        consumes = { "application/xml; charset=utf-8", "application/json; charset=utf-8" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Void> testEndpointParameters(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body2 body) {
        return getDelegate().testEndpointParameters(body);
    }


    @Operation(summary = "To test enum parameters", description = "To test enum parameters", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid request"),
        
        @ApiResponse(responseCode = "404", description = "Not found") })
    @RequestMapping(value = "/fake",
        method = RequestMethod.GET)
    default ResponseEntity<Void> testEnumParameters(@Parameter(in = ParameterIn.HEADER, description = "Header parameter enum test (string array)" ,schema=@Schema(allowableValues={ ">", "$" }
)) @RequestHeader(value="enum_header_string_array", required=false) List<String> enumHeaderStringArray, @Parameter(in = ParameterIn.HEADER, description = "Header parameter enum test (string)" ,schema=@Schema(allowableValues={ "_abc", "-efg", "(xyz)" }
, defaultValue="-efg")) @RequestHeader(value="enum_header_string", required=false) String enumHeaderString, @Parameter(in = ParameterIn.QUERY, description = "Query parameter enum test (string array)" ,schema=@Schema(allowableValues={ ">", "$" }
)) @Valid @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray, @Parameter(in = ParameterIn.QUERY, description = "Query parameter enum test (string)" ,schema=@Schema(allowableValues={ "_abc", "-efg", "(xyz)" }
, defaultValue="-efg")) @Valid @RequestParam(value = "enum_query_string", required = false, defaultValue="-efg") String enumQueryString, @Parameter(in = ParameterIn.QUERY, description = "Query parameter enum test (double)" ,schema=@Schema(allowableValues={ "1", "-2" }
)) @Valid @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger) {
        return getDelegate().testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger);
    }


    @Operation(summary = "To test enum parameters", description = "To test enum parameters", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid request"),
        
        @ApiResponse(responseCode = "404", description = "Not found") })
    @RequestMapping(value = "/fake/enum/form",
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Void> testEnumRequestBody(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Body4 body) {
        return getDelegate().testEnumRequestBody(body);
    }


    @Operation(summary = "test inline additionalProperties", description = "", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/fake/inline-additionalProperties",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Void> testInlineAdditionalProperties(@Parameter(in = ParameterIn.DEFAULT, description = "request body", required=true, schema=@Schema()) @Valid @RequestBody Map<String, String> body) {
        return getDelegate().testInlineAdditionalProperties(body);
    }


    @Operation(summary = "test json serialization of form data", description = "", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/fake/jsonFormData",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Void> testJsonFormData(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body5 body) {
        return getDelegate().testJsonFormData(body);
    }

}

