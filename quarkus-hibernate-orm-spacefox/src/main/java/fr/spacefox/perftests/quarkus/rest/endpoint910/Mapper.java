package fr.spacefox.perftests.quarkus.rest.endpoint910;

import fr.spacefox.perftests.quarkus.core.service910.model.Model910;
import fr.spacefox.perftests.quarkus.rest.endpoint910.schema.Schema910;

final class Mapper {
    private Mapper() {}

    public static Schema910 of(Model910 model) {
        return new Schema910(model.id(), model.value());
    }
}
