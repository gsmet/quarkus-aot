package fr.spacefox.perftests.quarkus.rest.endpoint421;

import fr.spacefox.perftests.quarkus.core.service421.model.Model421;
import fr.spacefox.perftests.quarkus.rest.endpoint421.schema.Schema421;

final class Mapper {
    private Mapper() {}

    public static Schema421 of(Model421 model) {
        return new Schema421(model.id(), model.value());
    }
}
