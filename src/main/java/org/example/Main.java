package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

public class Main {
    public static void main(String[] args) {
        Main tester = new Main();
        tester.doMapping();
    }

    public void doMapping() {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.enable(DeserializationFeature.USE_LONG_FOR_INTS);
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        try {
            JsonSchema testschema = schemaGen.generateSchema(Demonstrator.class);
            System.out.println("Mapped object: "+ mapper.writerWithDefaultPrettyPrinter().writeValueAsString(testschema));
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
