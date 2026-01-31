package fr.spacefox.perftests.quarkus.rest.endpoint167;

import fr.spacefox.perftests.quarkus.core.service167.model.Model167;
import fr.spacefox.perftests.quarkus.rest.endpoint167.schema.Schema167;

final class Mapper {
    private Mapper() {}

    public static Schema167 of(Model167 model) {
        return new Schema167(model.id(), model.value());
    }
}
