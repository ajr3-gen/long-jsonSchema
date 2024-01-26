# long-jsonSchema
Demonstrating how Jackson's JsonSchema code handles long data types.

Running main() will print out the generated JsonSchema, in which LONG objects have been converted to INT:

Mapped object: {
  "type" : "object",
  "id" : "urn:jsonschema:org:example:Demonstrator",
  "properties" : {
    "myId" : {
      "type" : "string"
    },
    "myInteger" : {
      "type" : "integer"
    },
    "myLongPrimitive" : {
      "type" : "integer"
    },
    "myLongObject" : {
      "type" : "integer"
    }
  }
}
