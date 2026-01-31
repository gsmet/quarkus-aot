package fr.spacefox.perftests.quarkus.rest.endpoint632;

import fr.spacefox.perftests.quarkus.core.service632.model.Model632;
import fr.spacefox.perftests.quarkus.rest.endpoint632.schema.Schema632;

final class Mapper {
    private Mapper() {}

    public static Schema632 of(Model632 model) {
        return new Schema632(model.id(), model.value());
    }
}
