package fr.spacefox.perftests.quarkus.rest.endpoint478;

import fr.spacefox.perftests.quarkus.core.service478.model.Model478;
import fr.spacefox.perftests.quarkus.rest.endpoint478.schema.Schema478;

final class Mapper {
    private Mapper() {}

    public static Schema478 of(Model478 model) {
        return new Schema478(model.id(), model.value());
    }
}
