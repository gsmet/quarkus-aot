package fr.spacefox.perftests.quarkus.rest.endpoint255;

import fr.spacefox.perftests.quarkus.core.service255.model.Model255;
import fr.spacefox.perftests.quarkus.rest.endpoint255.schema.Schema255;

final class Mapper {
    private Mapper() {}

    public static Schema255 of(Model255 model) {
        return new Schema255(model.id(), model.value());
    }
}
