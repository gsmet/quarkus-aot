package fr.spacefox.perftests.quarkus.rest.endpoint622;

import fr.spacefox.perftests.quarkus.core.service622.model.Model622;
import fr.spacefox.perftests.quarkus.rest.endpoint622.schema.Schema622;

final class Mapper {
    private Mapper() {}

    public static Schema622 of(Model622 model) {
        return new Schema622(model.id(), model.value());
    }
}
