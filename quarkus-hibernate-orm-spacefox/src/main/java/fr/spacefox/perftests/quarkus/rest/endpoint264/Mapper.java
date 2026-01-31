package fr.spacefox.perftests.quarkus.rest.endpoint264;

import fr.spacefox.perftests.quarkus.core.service264.model.Model264;
import fr.spacefox.perftests.quarkus.rest.endpoint264.schema.Schema264;

final class Mapper {
    private Mapper() {}

    public static Schema264 of(Model264 model) {
        return new Schema264(model.id(), model.value());
    }
}
