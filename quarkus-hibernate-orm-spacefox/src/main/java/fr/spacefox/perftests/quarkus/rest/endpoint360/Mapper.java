package fr.spacefox.perftests.quarkus.rest.endpoint360;

import fr.spacefox.perftests.quarkus.core.service360.model.Model360;
import fr.spacefox.perftests.quarkus.rest.endpoint360.schema.Schema360;

final class Mapper {
    private Mapper() {}

    public static Schema360 of(Model360 model) {
        return new Schema360(model.id(), model.value());
    }
}
