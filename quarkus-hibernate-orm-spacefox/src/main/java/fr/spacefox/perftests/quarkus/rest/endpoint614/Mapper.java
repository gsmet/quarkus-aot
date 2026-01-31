package fr.spacefox.perftests.quarkus.rest.endpoint614;

import fr.spacefox.perftests.quarkus.core.service614.model.Model614;
import fr.spacefox.perftests.quarkus.rest.endpoint614.schema.Schema614;

final class Mapper {
    private Mapper() {}

    public static Schema614 of(Model614 model) {
        return new Schema614(model.id(), model.value());
    }
}
