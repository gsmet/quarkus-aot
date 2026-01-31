package fr.spacefox.perftests.quarkus.rest.endpoint968;

import fr.spacefox.perftests.quarkus.core.service968.model.Model968;
import fr.spacefox.perftests.quarkus.rest.endpoint968.schema.Schema968;

final class Mapper {
    private Mapper() {}

    public static Schema968 of(Model968 model) {
        return new Schema968(model.id(), model.value());
    }
}
