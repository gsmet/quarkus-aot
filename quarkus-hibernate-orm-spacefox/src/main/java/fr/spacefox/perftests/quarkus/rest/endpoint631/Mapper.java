package fr.spacefox.perftests.quarkus.rest.endpoint631;

import fr.spacefox.perftests.quarkus.core.service631.model.Model631;
import fr.spacefox.perftests.quarkus.rest.endpoint631.schema.Schema631;

final class Mapper {
    private Mapper() {}

    public static Schema631 of(Model631 model) {
        return new Schema631(model.id(), model.value());
    }
}
