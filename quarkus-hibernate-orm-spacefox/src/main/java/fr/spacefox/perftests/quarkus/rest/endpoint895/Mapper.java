package fr.spacefox.perftests.quarkus.rest.endpoint895;

import fr.spacefox.perftests.quarkus.core.service895.model.Model895;
import fr.spacefox.perftests.quarkus.rest.endpoint895.schema.Schema895;

final class Mapper {
    private Mapper() {}

    public static Schema895 of(Model895 model) {
        return new Schema895(model.id(), model.value());
    }
}
