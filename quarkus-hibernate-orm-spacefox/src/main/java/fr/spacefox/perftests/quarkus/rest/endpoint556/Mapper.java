package fr.spacefox.perftests.quarkus.rest.endpoint556;

import fr.spacefox.perftests.quarkus.core.service556.model.Model556;
import fr.spacefox.perftests.quarkus.rest.endpoint556.schema.Schema556;

final class Mapper {
    private Mapper() {}

    public static Schema556 of(Model556 model) {
        return new Schema556(model.id(), model.value());
    }
}
