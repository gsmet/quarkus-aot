package fr.spacefox.perftests.quarkus.rest.endpoint784;

import fr.spacefox.perftests.quarkus.core.service784.model.Model784;
import fr.spacefox.perftests.quarkus.rest.endpoint784.schema.Schema784;

final class Mapper {
    private Mapper() {}

    public static Schema784 of(Model784 model) {
        return new Schema784(model.id(), model.value());
    }
}
