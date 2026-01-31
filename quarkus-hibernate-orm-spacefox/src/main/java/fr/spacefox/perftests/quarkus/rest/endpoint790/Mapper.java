package fr.spacefox.perftests.quarkus.rest.endpoint790;

import fr.spacefox.perftests.quarkus.core.service790.model.Model790;
import fr.spacefox.perftests.quarkus.rest.endpoint790.schema.Schema790;

final class Mapper {
    private Mapper() {}

    public static Schema790 of(Model790 model) {
        return new Schema790(model.id(), model.value());
    }
}
