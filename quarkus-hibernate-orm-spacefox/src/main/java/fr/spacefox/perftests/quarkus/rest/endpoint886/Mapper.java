package fr.spacefox.perftests.quarkus.rest.endpoint886;

import fr.spacefox.perftests.quarkus.core.service886.model.Model886;
import fr.spacefox.perftests.quarkus.rest.endpoint886.schema.Schema886;

final class Mapper {
    private Mapper() {}

    public static Schema886 of(Model886 model) {
        return new Schema886(model.id(), model.value());
    }
}
