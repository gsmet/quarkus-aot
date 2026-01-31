package fr.spacefox.perftests.quarkus.rest.endpoint798;

import fr.spacefox.perftests.quarkus.core.service798.model.Model798;
import fr.spacefox.perftests.quarkus.rest.endpoint798.schema.Schema798;

final class Mapper {
    private Mapper() {}

    public static Schema798 of(Model798 model) {
        return new Schema798(model.id(), model.value());
    }
}
