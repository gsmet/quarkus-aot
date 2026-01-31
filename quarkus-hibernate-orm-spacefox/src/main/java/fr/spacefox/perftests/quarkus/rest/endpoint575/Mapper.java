package fr.spacefox.perftests.quarkus.rest.endpoint575;

import fr.spacefox.perftests.quarkus.core.service575.model.Model575;
import fr.spacefox.perftests.quarkus.rest.endpoint575.schema.Schema575;

final class Mapper {
    private Mapper() {}

    public static Schema575 of(Model575 model) {
        return new Schema575(model.id(), model.value());
    }
}
