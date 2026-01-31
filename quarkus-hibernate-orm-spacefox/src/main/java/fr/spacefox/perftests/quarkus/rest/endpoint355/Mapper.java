package fr.spacefox.perftests.quarkus.rest.endpoint355;

import fr.spacefox.perftests.quarkus.core.service355.model.Model355;
import fr.spacefox.perftests.quarkus.rest.endpoint355.schema.Schema355;

final class Mapper {
    private Mapper() {}

    public static Schema355 of(Model355 model) {
        return new Schema355(model.id(), model.value());
    }
}
