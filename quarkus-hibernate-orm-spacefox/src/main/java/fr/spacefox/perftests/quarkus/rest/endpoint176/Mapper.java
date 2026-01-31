package fr.spacefox.perftests.quarkus.rest.endpoint176;

import fr.spacefox.perftests.quarkus.core.service176.model.Model176;
import fr.spacefox.perftests.quarkus.rest.endpoint176.schema.Schema176;

final class Mapper {
    private Mapper() {}

    public static Schema176 of(Model176 model) {
        return new Schema176(model.id(), model.value());
    }
}
