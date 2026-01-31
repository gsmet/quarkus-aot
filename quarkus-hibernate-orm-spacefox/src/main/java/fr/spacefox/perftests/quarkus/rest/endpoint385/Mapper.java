package fr.spacefox.perftests.quarkus.rest.endpoint385;

import fr.spacefox.perftests.quarkus.core.service385.model.Model385;
import fr.spacefox.perftests.quarkus.rest.endpoint385.schema.Schema385;

final class Mapper {
    private Mapper() {}

    public static Schema385 of(Model385 model) {
        return new Schema385(model.id(), model.value());
    }
}
