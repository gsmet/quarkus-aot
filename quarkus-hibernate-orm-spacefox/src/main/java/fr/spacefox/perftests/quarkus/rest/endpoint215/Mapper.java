package fr.spacefox.perftests.quarkus.rest.endpoint215;

import fr.spacefox.perftests.quarkus.core.service215.model.Model215;
import fr.spacefox.perftests.quarkus.rest.endpoint215.schema.Schema215;

final class Mapper {
    private Mapper() {}

    public static Schema215 of(Model215 model) {
        return new Schema215(model.id(), model.value());
    }
}
