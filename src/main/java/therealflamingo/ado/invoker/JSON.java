package therealflamingo.ado.invoker;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.*;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.threeten.bp.OffsetDateTime;
import therealflamingo.ado.OffsetDateTimeDeserializer;

import java.text.DateFormat;

import javax.ws.rs.ext.ContextResolver;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class JSON implements ContextResolver<ObjectMapper> {
  private ObjectMapper mapper;

  public JSON() {
    mapper = new ObjectMapper();
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    mapper.setDateFormat(new RFC3339DateFormat());
    mapper.registerModule(new JodaModule());
    SimpleModule module = new SimpleModule();
    module.addDeserializer(OffsetDateTime.class, new OffsetDateTimeDeserializer());
    mapper.registerModule(module);

  }

  /**
   * Set the date format for JSON (de)serialization with Date properties.
   */
  public void setDateFormat(DateFormat dateFormat) {
    mapper.setDateFormat(dateFormat);
  }

  @Override
  public ObjectMapper getContext(Class<?> type) {
    return mapper;
  }
}
