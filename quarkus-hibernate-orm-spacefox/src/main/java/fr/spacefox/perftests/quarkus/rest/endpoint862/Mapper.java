package fr.spacefox.perftests.quarkus.rest.endpoint862;

import fr.spacefox.perftests.quarkus.core.service862.model.Model862;
import fr.spacefox.perftests.quarkus.rest.endpoint862.schema.Schema862;

final class Mapper {
    private Mapper() {}

    public static Schema862 of(Model862 model) {
        return new Schema862(model.id(), model.value());
    }
}
