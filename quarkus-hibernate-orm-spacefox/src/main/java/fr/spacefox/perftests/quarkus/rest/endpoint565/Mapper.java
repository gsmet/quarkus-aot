package fr.spacefox.perftests.quarkus.rest.endpoint565;

import fr.spacefox.perftests.quarkus.core.service565.model.Model565;
import fr.spacefox.perftests.quarkus.rest.endpoint565.schema.Schema565;

final class Mapper {
    private Mapper() {}

    public static Schema565 of(Model565 model) {
        return new Schema565(model.id(), model.value());
    }
}
