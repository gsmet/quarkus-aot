package fr.spacefox.perftests.quarkus.rest.endpoint357;

import fr.spacefox.perftests.quarkus.core.service357.model.Model357;
import fr.spacefox.perftests.quarkus.rest.endpoint357.schema.Schema357;

final class Mapper {
    private Mapper() {}

    public static Schema357 of(Model357 model) {
        return new Schema357(model.id(), model.value());
    }
}
