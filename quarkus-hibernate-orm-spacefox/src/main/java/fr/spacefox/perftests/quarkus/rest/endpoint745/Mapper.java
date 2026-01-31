package fr.spacefox.perftests.quarkus.rest.endpoint745;

import fr.spacefox.perftests.quarkus.core.service745.model.Model745;
import fr.spacefox.perftests.quarkus.rest.endpoint745.schema.Schema745;

final class Mapper {
    private Mapper() {}

    public static Schema745 of(Model745 model) {
        return new Schema745(model.id(), model.value());
    }
}
