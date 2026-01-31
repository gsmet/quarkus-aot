package fr.spacefox.perftests.quarkus.rest.endpoint739;

import fr.spacefox.perftests.quarkus.core.service739.model.Model739;
import fr.spacefox.perftests.quarkus.rest.endpoint739.schema.Schema739;

final class Mapper {
    private Mapper() {}

    public static Schema739 of(Model739 model) {
        return new Schema739(model.id(), model.value());
    }
}
