package fr.spacefox.perftests.quarkus.rest.endpoint95;

import fr.spacefox.perftests.quarkus.core.service95.model.Model95;
import fr.spacefox.perftests.quarkus.rest.endpoint95.schema.Schema95;

final class Mapper {
    private Mapper() {}

    public static Schema95 of(Model95 model) {
        return new Schema95(model.id(), model.value());
    }
}
