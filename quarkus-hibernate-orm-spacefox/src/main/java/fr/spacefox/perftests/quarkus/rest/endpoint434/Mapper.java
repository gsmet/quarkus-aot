package fr.spacefox.perftests.quarkus.rest.endpoint434;

import fr.spacefox.perftests.quarkus.core.service434.model.Model434;
import fr.spacefox.perftests.quarkus.rest.endpoint434.schema.Schema434;

final class Mapper {
    private Mapper() {}

    public static Schema434 of(Model434 model) {
        return new Schema434(model.id(), model.value());
    }
}
