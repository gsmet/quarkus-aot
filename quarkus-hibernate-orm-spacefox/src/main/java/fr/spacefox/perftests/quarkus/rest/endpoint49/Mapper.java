package fr.spacefox.perftests.quarkus.rest.endpoint49;

import fr.spacefox.perftests.quarkus.core.service49.model.Model49;
import fr.spacefox.perftests.quarkus.rest.endpoint49.schema.Schema49;

final class Mapper {
    private Mapper() {}

    public static Schema49 of(Model49 model) {
        return new Schema49(model.id(), model.value());
    }
}
