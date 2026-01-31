package fr.spacefox.perftests.quarkus.rest.endpoint581;

import fr.spacefox.perftests.quarkus.core.service581.model.Model581;
import fr.spacefox.perftests.quarkus.rest.endpoint581.schema.Schema581;

final class Mapper {
    private Mapper() {}

    public static Schema581 of(Model581 model) {
        return new Schema581(model.id(), model.value());
    }
}
