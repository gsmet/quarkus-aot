package fr.spacefox.perftests.quarkus.rest.endpoint772;

import fr.spacefox.perftests.quarkus.core.service772.model.Model772;
import fr.spacefox.perftests.quarkus.rest.endpoint772.schema.Schema772;

final class Mapper {
    private Mapper() {}

    public static Schema772 of(Model772 model) {
        return new Schema772(model.id(), model.value());
    }
}
