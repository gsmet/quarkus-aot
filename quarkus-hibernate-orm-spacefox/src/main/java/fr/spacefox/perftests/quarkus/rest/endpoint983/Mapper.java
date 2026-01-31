package fr.spacefox.perftests.quarkus.rest.endpoint983;

import fr.spacefox.perftests.quarkus.core.service983.model.Model983;
import fr.spacefox.perftests.quarkus.rest.endpoint983.schema.Schema983;

final class Mapper {
    private Mapper() {}

    public static Schema983 of(Model983 model) {
        return new Schema983(model.id(), model.value());
    }
}
