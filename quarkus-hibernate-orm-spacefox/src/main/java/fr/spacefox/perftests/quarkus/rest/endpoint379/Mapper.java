package fr.spacefox.perftests.quarkus.rest.endpoint379;

import fr.spacefox.perftests.quarkus.core.service379.model.Model379;
import fr.spacefox.perftests.quarkus.rest.endpoint379.schema.Schema379;

final class Mapper {
    private Mapper() {}

    public static Schema379 of(Model379 model) {
        return new Schema379(model.id(), model.value());
    }
}
