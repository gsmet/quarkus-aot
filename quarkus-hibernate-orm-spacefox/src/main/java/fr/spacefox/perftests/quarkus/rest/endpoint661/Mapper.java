package fr.spacefox.perftests.quarkus.rest.endpoint661;

import fr.spacefox.perftests.quarkus.core.service661.model.Model661;
import fr.spacefox.perftests.quarkus.rest.endpoint661.schema.Schema661;

final class Mapper {
    private Mapper() {}

    public static Schema661 of(Model661 model) {
        return new Schema661(model.id(), model.value());
    }
}
