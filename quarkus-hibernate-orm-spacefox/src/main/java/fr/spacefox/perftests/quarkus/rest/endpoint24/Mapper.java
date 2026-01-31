package fr.spacefox.perftests.quarkus.rest.endpoint24;

import fr.spacefox.perftests.quarkus.core.service24.model.Model24;
import fr.spacefox.perftests.quarkus.rest.endpoint24.schema.Schema24;

final class Mapper {
    private Mapper() {}

    public static Schema24 of(Model24 model) {
        return new Schema24(model.id(), model.value());
    }
}
