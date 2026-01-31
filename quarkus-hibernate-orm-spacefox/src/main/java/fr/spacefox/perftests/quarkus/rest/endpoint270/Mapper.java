package fr.spacefox.perftests.quarkus.rest.endpoint270;

import fr.spacefox.perftests.quarkus.core.service270.model.Model270;
import fr.spacefox.perftests.quarkus.rest.endpoint270.schema.Schema270;

final class Mapper {
    private Mapper() {}

    public static Schema270 of(Model270 model) {
        return new Schema270(model.id(), model.value());
    }
}
