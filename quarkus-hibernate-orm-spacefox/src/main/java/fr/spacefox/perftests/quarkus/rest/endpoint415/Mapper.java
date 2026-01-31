package fr.spacefox.perftests.quarkus.rest.endpoint415;

import fr.spacefox.perftests.quarkus.core.service415.model.Model415;
import fr.spacefox.perftests.quarkus.rest.endpoint415.schema.Schema415;

final class Mapper {
    private Mapper() {}

    public static Schema415 of(Model415 model) {
        return new Schema415(model.id(), model.value());
    }
}
