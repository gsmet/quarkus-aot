package fr.spacefox.perftests.quarkus.rest.endpoint900;

import fr.spacefox.perftests.quarkus.core.service900.model.Model900;
import fr.spacefox.perftests.quarkus.rest.endpoint900.schema.Schema900;

final class Mapper {
    private Mapper() {}

    public static Schema900 of(Model900 model) {
        return new Schema900(model.id(), model.value());
    }
}
