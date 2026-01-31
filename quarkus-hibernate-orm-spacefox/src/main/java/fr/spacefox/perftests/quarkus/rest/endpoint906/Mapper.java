package fr.spacefox.perftests.quarkus.rest.endpoint906;

import fr.spacefox.perftests.quarkus.core.service906.model.Model906;
import fr.spacefox.perftests.quarkus.rest.endpoint906.schema.Schema906;

final class Mapper {
    private Mapper() {}

    public static Schema906 of(Model906 model) {
        return new Schema906(model.id(), model.value());
    }
}
