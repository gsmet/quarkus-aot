package fr.spacefox.perftests.quarkus.rest.endpoint531;

import fr.spacefox.perftests.quarkus.core.service531.model.Model531;
import fr.spacefox.perftests.quarkus.rest.endpoint531.schema.Schema531;

final class Mapper {
    private Mapper() {}

    public static Schema531 of(Model531 model) {
        return new Schema531(model.id(), model.value());
    }
}
