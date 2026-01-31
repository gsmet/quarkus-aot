package fr.spacefox.perftests.quarkus.rest.endpoint597;

import fr.spacefox.perftests.quarkus.core.service597.model.Model597;
import fr.spacefox.perftests.quarkus.rest.endpoint597.schema.Schema597;

final class Mapper {
    private Mapper() {}

    public static Schema597 of(Model597 model) {
        return new Schema597(model.id(), model.value());
    }
}
