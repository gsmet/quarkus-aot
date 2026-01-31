package fr.spacefox.perftests.quarkus.rest.endpoint636;

import fr.spacefox.perftests.quarkus.core.service636.model.Model636;
import fr.spacefox.perftests.quarkus.rest.endpoint636.schema.Schema636;

final class Mapper {
    private Mapper() {}

    public static Schema636 of(Model636 model) {
        return new Schema636(model.id(), model.value());
    }
}
