package fr.spacefox.perftests.quarkus.rest.endpoint514;

import fr.spacefox.perftests.quarkus.core.service514.model.Model514;
import fr.spacefox.perftests.quarkus.rest.endpoint514.schema.Schema514;

final class Mapper {
    private Mapper() {}

    public static Schema514 of(Model514 model) {
        return new Schema514(model.id(), model.value());
    }
}
