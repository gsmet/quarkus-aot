package fr.spacefox.perftests.quarkus.rest.endpoint395;

import fr.spacefox.perftests.quarkus.core.service395.model.Model395;
import fr.spacefox.perftests.quarkus.rest.endpoint395.schema.Schema395;

final class Mapper {
    private Mapper() {}

    public static Schema395 of(Model395 model) {
        return new Schema395(model.id(), model.value());
    }
}
