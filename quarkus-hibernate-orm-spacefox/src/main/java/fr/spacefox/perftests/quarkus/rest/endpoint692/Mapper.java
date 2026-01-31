package fr.spacefox.perftests.quarkus.rest.endpoint692;

import fr.spacefox.perftests.quarkus.core.service692.model.Model692;
import fr.spacefox.perftests.quarkus.rest.endpoint692.schema.Schema692;

final class Mapper {
    private Mapper() {}

    public static Schema692 of(Model692 model) {
        return new Schema692(model.id(), model.value());
    }
}
