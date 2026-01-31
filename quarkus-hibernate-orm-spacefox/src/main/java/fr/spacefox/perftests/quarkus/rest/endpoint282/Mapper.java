package fr.spacefox.perftests.quarkus.rest.endpoint282;

import fr.spacefox.perftests.quarkus.core.service282.model.Model282;
import fr.spacefox.perftests.quarkus.rest.endpoint282.schema.Schema282;

final class Mapper {
    private Mapper() {}

    public static Schema282 of(Model282 model) {
        return new Schema282(model.id(), model.value());
    }
}
