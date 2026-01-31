package fr.spacefox.perftests.quarkus.rest.endpoint839;

import fr.spacefox.perftests.quarkus.core.service839.model.Model839;
import fr.spacefox.perftests.quarkus.rest.endpoint839.schema.Schema839;

final class Mapper {
    private Mapper() {}

    public static Schema839 of(Model839 model) {
        return new Schema839(model.id(), model.value());
    }
}
