package fr.spacefox.perftests.quarkus.rest.endpoint201;

import fr.spacefox.perftests.quarkus.core.service201.model.Model201;
import fr.spacefox.perftests.quarkus.rest.endpoint201.schema.Schema201;

final class Mapper {
    private Mapper() {}

    public static Schema201 of(Model201 model) {
        return new Schema201(model.id(), model.value());
    }
}
