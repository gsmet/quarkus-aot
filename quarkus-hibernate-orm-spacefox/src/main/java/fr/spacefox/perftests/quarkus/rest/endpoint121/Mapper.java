package fr.spacefox.perftests.quarkus.rest.endpoint121;

import fr.spacefox.perftests.quarkus.core.service121.model.Model121;
import fr.spacefox.perftests.quarkus.rest.endpoint121.schema.Schema121;

final class Mapper {
    private Mapper() {}

    public static Schema121 of(Model121 model) {
        return new Schema121(model.id(), model.value());
    }
}
