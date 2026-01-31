package fr.spacefox.perftests.quarkus.rest.endpoint231;

import fr.spacefox.perftests.quarkus.core.service231.model.Model231;
import fr.spacefox.perftests.quarkus.rest.endpoint231.schema.Schema231;

final class Mapper {
    private Mapper() {}

    public static Schema231 of(Model231 model) {
        return new Schema231(model.id(), model.value());
    }
}
