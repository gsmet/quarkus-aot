package fr.spacefox.perftests.quarkus.rest.endpoint712;

import fr.spacefox.perftests.quarkus.core.service712.model.Model712;
import fr.spacefox.perftests.quarkus.rest.endpoint712.schema.Schema712;

final class Mapper {
    private Mapper() {}

    public static Schema712 of(Model712 model) {
        return new Schema712(model.id(), model.value());
    }
}
