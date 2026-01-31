package fr.spacefox.perftests.quarkus.rest.endpoint194;

import fr.spacefox.perftests.quarkus.core.service194.model.Model194;
import fr.spacefox.perftests.quarkus.rest.endpoint194.schema.Schema194;

final class Mapper {
    private Mapper() {}

    public static Schema194 of(Model194 model) {
        return new Schema194(model.id(), model.value());
    }
}
