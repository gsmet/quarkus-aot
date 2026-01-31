package fr.spacefox.perftests.quarkus.rest.endpoint94;

import fr.spacefox.perftests.quarkus.core.service94.model.Model94;
import fr.spacefox.perftests.quarkus.rest.endpoint94.schema.Schema94;

final class Mapper {
    private Mapper() {}

    public static Schema94 of(Model94 model) {
        return new Schema94(model.id(), model.value());
    }
}
