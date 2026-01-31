package fr.spacefox.perftests.quarkus.rest.endpoint1;

import fr.spacefox.perftests.quarkus.core.service1.model.Model1;
import fr.spacefox.perftests.quarkus.rest.endpoint1.schema.Schema1;

final class Mapper {
    private Mapper() {}

    public static Schema1 of(Model1 model) {
        return new Schema1(model.id(), model.value());
    }
}
