package fr.spacefox.perftests.quarkus.rest.endpoint374;

import fr.spacefox.perftests.quarkus.core.service374.model.Model374;
import fr.spacefox.perftests.quarkus.rest.endpoint374.schema.Schema374;

final class Mapper {
    private Mapper() {}

    public static Schema374 of(Model374 model) {
        return new Schema374(model.id(), model.value());
    }
}
