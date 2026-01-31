package fr.spacefox.perftests.quarkus.rest.endpoint601;

import fr.spacefox.perftests.quarkus.core.service601.model.Model601;
import fr.spacefox.perftests.quarkus.rest.endpoint601.schema.Schema601;

final class Mapper {
    private Mapper() {}

    public static Schema601 of(Model601 model) {
        return new Schema601(model.id(), model.value());
    }
}
