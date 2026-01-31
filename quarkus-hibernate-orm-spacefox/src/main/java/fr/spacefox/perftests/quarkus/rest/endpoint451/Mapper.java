package fr.spacefox.perftests.quarkus.rest.endpoint451;

import fr.spacefox.perftests.quarkus.core.service451.model.Model451;
import fr.spacefox.perftests.quarkus.rest.endpoint451.schema.Schema451;

final class Mapper {
    private Mapper() {}

    public static Schema451 of(Model451 model) {
        return new Schema451(model.id(), model.value());
    }
}
