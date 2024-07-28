package therealflamingo.ado;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;

public class OffsetDateTimeDeserializer extends com.fasterxml.jackson.databind.JsonDeserializer<OffsetDateTime> {

    @Override
    public OffsetDateTime deserialize(JsonParser p, DeserializationContext context) throws IOException {
        String value = p.getText();
        return OffsetDateTime.parse(value);
    }
}
