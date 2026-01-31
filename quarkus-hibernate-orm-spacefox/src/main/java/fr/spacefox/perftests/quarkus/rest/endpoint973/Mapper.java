package fr.spacefox.perftests.quarkus.rest.endpoint973;

import fr.spacefox.perftests.quarkus.core.service973.model.Model973;
import fr.spacefox.perftests.quarkus.rest.endpoint973.schema.Schema973;

final class Mapper {
    private Mapper() {}

    public static Schema973 of(Model973 model) {
        return new Schema973(model.id(), model.value());
    }
}
