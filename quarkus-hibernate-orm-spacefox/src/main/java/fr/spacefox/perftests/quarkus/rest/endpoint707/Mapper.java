package fr.spacefox.perftests.quarkus.rest.endpoint707;

import fr.spacefox.perftests.quarkus.core.service707.model.Model707;
import fr.spacefox.perftests.quarkus.rest.endpoint707.schema.Schema707;

final class Mapper {
    private Mapper() {}

    public static Schema707 of(Model707 model) {
        return new Schema707(model.id(), model.value());
    }
}
