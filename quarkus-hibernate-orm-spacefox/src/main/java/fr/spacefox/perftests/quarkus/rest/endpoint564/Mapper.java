package fr.spacefox.perftests.quarkus.rest.endpoint564;

import fr.spacefox.perftests.quarkus.core.service564.model.Model564;
import fr.spacefox.perftests.quarkus.rest.endpoint564.schema.Schema564;

final class Mapper {
    private Mapper() {}

    public static Schema564 of(Model564 model) {
        return new Schema564(model.id(), model.value());
    }
}
