package fr.spacefox.perftests.quarkus.rest.endpoint931;

import fr.spacefox.perftests.quarkus.core.service931.model.Model931;
import fr.spacefox.perftests.quarkus.rest.endpoint931.schema.Schema931;

final class Mapper {
    private Mapper() {}

    public static Schema931 of(Model931 model) {
        return new Schema931(model.id(), model.value());
    }
}
