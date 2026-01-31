package fr.spacefox.perftests.quarkus.rest.endpoint251;

import fr.spacefox.perftests.quarkus.core.service251.model.Model251;
import fr.spacefox.perftests.quarkus.rest.endpoint251.schema.Schema251;

final class Mapper {
    private Mapper() {}

    public static Schema251 of(Model251 model) {
        return new Schema251(model.id(), model.value());
    }
}
