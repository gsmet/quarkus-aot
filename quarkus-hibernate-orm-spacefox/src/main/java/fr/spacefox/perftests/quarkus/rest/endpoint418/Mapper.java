package fr.spacefox.perftests.quarkus.rest.endpoint418;

import fr.spacefox.perftests.quarkus.core.service418.model.Model418;
import fr.spacefox.perftests.quarkus.rest.endpoint418.schema.Schema418;

final class Mapper {
    private Mapper() {}

    public static Schema418 of(Model418 model) {
        return new Schema418(model.id(), model.value());
    }
}
