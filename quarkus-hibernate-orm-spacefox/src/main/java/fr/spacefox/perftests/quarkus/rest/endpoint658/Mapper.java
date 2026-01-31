package fr.spacefox.perftests.quarkus.rest.endpoint658;

import fr.spacefox.perftests.quarkus.core.service658.model.Model658;
import fr.spacefox.perftests.quarkus.rest.endpoint658.schema.Schema658;

final class Mapper {
    private Mapper() {}

    public static Schema658 of(Model658 model) {
        return new Schema658(model.id(), model.value());
    }
}
