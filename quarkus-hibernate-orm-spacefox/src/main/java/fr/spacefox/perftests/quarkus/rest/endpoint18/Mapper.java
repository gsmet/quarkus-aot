package fr.spacefox.perftests.quarkus.rest.endpoint18;

import fr.spacefox.perftests.quarkus.core.service18.model.Model18;
import fr.spacefox.perftests.quarkus.rest.endpoint18.schema.Schema18;

final class Mapper {
    private Mapper() {}

    public static Schema18 of(Model18 model) {
        return new Schema18(model.id(), model.value());
    }
}
