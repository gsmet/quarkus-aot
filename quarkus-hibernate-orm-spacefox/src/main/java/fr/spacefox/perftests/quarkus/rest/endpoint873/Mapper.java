package fr.spacefox.perftests.quarkus.rest.endpoint873;

import fr.spacefox.perftests.quarkus.core.service873.model.Model873;
import fr.spacefox.perftests.quarkus.rest.endpoint873.schema.Schema873;

final class Mapper {
    private Mapper() {}

    public static Schema873 of(Model873 model) {
        return new Schema873(model.id(), model.value());
    }
}
