package fr.spacefox.perftests.quarkus.rest.endpoint611;

import fr.spacefox.perftests.quarkus.core.service611.model.Model611;
import fr.spacefox.perftests.quarkus.rest.endpoint611.schema.Schema611;

final class Mapper {
    private Mapper() {}

    public static Schema611 of(Model611 model) {
        return new Schema611(model.id(), model.value());
    }
}
