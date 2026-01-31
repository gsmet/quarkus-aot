package fr.spacefox.perftests.quarkus.rest.endpoint883;

import fr.spacefox.perftests.quarkus.core.service883.model.Model883;
import fr.spacefox.perftests.quarkus.rest.endpoint883.schema.Schema883;

final class Mapper {
    private Mapper() {}

    public static Schema883 of(Model883 model) {
        return new Schema883(model.id(), model.value());
    }
}
