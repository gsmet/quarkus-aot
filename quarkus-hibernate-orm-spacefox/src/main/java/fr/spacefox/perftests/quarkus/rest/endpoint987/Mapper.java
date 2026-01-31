package fr.spacefox.perftests.quarkus.rest.endpoint987;

import fr.spacefox.perftests.quarkus.core.service987.model.Model987;
import fr.spacefox.perftests.quarkus.rest.endpoint987.schema.Schema987;

final class Mapper {
    private Mapper() {}

    public static Schema987 of(Model987 model) {
        return new Schema987(model.id(), model.value());
    }
}
