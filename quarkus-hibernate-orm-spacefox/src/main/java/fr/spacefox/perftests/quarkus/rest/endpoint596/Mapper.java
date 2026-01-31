package fr.spacefox.perftests.quarkus.rest.endpoint596;

import fr.spacefox.perftests.quarkus.core.service596.model.Model596;
import fr.spacefox.perftests.quarkus.rest.endpoint596.schema.Schema596;

final class Mapper {
    private Mapper() {}

    public static Schema596 of(Model596 model) {
        return new Schema596(model.id(), model.value());
    }
}
