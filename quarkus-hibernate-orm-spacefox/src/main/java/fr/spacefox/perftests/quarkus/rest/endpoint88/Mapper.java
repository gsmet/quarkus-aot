package fr.spacefox.perftests.quarkus.rest.endpoint88;

import fr.spacefox.perftests.quarkus.core.service88.model.Model88;
import fr.spacefox.perftests.quarkus.rest.endpoint88.schema.Schema88;

final class Mapper {
    private Mapper() {}

    public static Schema88 of(Model88 model) {
        return new Schema88(model.id(), model.value());
    }
}
